import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class xlsprint {

    public void imprime_colunas(String caminho) {
        try
                (FileInputStream file = new FileInputStream(caminho);
                 XSSFWorkbook xls = new XSSFWorkbook(file))

        {
            //pa pegar a primeira aba
            Sheet planilha = xls.getSheetAt(0);

            //título
            System.out.println("Descrição\t\tlocal\t\tQTD");

            //tem que começar no 1 senão pega cabeçalho
            for (int i = 1; i <= planilha.getLastRowNum(); i++) {
                Row linha = planilha.getRow(i);

                if (linha == null) continue;

                Cell celProduto = linha.getCell(0); // Coluna A: Produto
                Cell celPreco   = linha.getCell(1); // Coluna B: Preço
                Cell celCusto   = linha.getCell(2); // Coluna C: Custo

                String produto = celProduto.getStringCellValue();
                double preco   = celPreco.getNumericCellValue();
                double custo   = celCusto.getNumericCellValue();

                double margem = preco - custo;

                System.out.printf("%s\t\t%.2f%n", produto, margem);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler a planilha: " + e.getMessage());
        }
    }
}
