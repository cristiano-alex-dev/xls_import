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

                Cell celProduto = linha.getCell(1);
                Cell celLocal   = linha.getCell(3);
                Cell celQTD   = linha.getCell(16);

                String produto = celProduto.getStringCellValue();
                double local   = celLocal.getNumericCellValue();
                double qtd   = celQTD.getNumericCellValue();

             //   double margem = preco - custo;

                System.out.printf("%s\t\t%.0f\t\t%.0f%n", produto, local, qtd);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler a planilha: " + e.getMessage());
        }
    }
}
