import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> cod45e, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int escolha;


        System.out.print("Escolha 1 para importar texto ou 2 para importar planilha\n");
        escolha = sn.nextInt();

        if (escolha == 1) {

            Scanner sc = new Scanner(System.in);
            textprint vamo_ler = new textprint();


            System.out.print("Digite o caminho do arquivo: ");
            vamo_ler.path = sc.nextLine();

            vamo_ler.imprime_texto();
            sc.close();


        } else {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o caminho do arquivo .xlsx: ");
            String caminho = sc.nextLine();

            xlsprint leitor = new xlsprint();
            leitor.imprime_colunas(caminho);



          //  Scanner sa = new Scanner(System.in);
          //  textprint vamo_ler = new textprint();


          //  System.out.print("Digite o caminho do arquivo: ");
          //  vamo_ler.path = sa.nextLine();

         //   vamo_ler.imprime_texto();

            sc.close();
         //   sa.close();

        }
    }

}
