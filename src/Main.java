import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      textprint vamo_ler = new textprint();


      System.out.print("Digite o caminho do arquivo: ");
      vamo_ler.path = sc.nextLine();

    vamo_ler.imprime_texto();
    sc.close();

    }
}
