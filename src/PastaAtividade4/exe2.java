package PastaAtividade4;
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com uma frase: ");
        String frase = ler.nextLine();

        String[] frase1 = frase.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = frase1.length - 1; i >= 0; i--) {
            sb.append(frase1[i] + " ");
        }

        System.out.println(sb);
    }
}