package PastaAtividade3;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);

        int qtdepalavra = 1;
        int espaco = 0;
        int numcaracter = 0;

        System.out.println("Escreva uma frase:  \n");


        String p = frase.nextLine();

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ' ') {
                qtdepalavra++;
                espaco++;
            }
        }
        numcaracter = p.length() - espaco;


        System.out.printf("Quantidade de palavras: %d\n", qtdepalavra);
        System.out.printf("Quantidade de caracteres: %d", numcaracter);

        frase.close();


    }
}

