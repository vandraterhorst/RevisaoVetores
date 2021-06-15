package strings;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i;


        System.out.println("Escreva um nome:\n");
        String nome = ler.nextLine().toUpperCase();

        System.out.println("\nAs iniciais do nome são:\n");
        nome = nome.replaceAll("da|das|do|dos|de|di|e", "");

        System.out.print(nome.charAt(0));
        for ( i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                System.out.print(nome.charAt(i + 1));
            }
        }
        ler.close();
    }

}