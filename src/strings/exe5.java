package strings;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);


        System.out.println("Digite uma frase: ");

        String palavras = frase.nextLine();

        palavras = palavras.trim().replaceAll("\\s+", " ");

        System.out.println("Frase digitada sem espacos desnecessarios: \n"+ palavras);

    }
}