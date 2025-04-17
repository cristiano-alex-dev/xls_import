import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class textprint {


    public String path;
    public File text;

    public void imprime_texto(){

        File text = new File(path);
        Scanner sc = null;

        try {

            sc = new Scanner(text);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }

        }



    }




}
