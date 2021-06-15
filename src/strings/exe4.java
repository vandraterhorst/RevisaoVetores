package strings;

import java.util.Scanner;

public class exe4 {

        public static void main(String[] args) {
            Scanner frase = new Scanner(System.in);

            int qpalavra = 1;
            int espaco = 0;
            int ncaracter = 0;

            System.out.println("Escreva uma frase  \n");


            String a = frase.nextLine();

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    qpalavra++;
                    espaco++;
                }
            }
            ncaracter = a.length() - espaco;


            System.out.printf("Quantidade de palavras : %d\n", qpalavra);
            System.out.printf("Quantidade de caracteres: %d", ncaracter);

            frase.close();


        }
}

