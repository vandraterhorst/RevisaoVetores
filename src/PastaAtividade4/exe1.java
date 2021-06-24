package PastaAtividade4;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma frase: ");
        String st = sc.nextLine();

        String[] st1 = st.split("\\s+");

        for(int i = st1.length - 1; i >= 0; i--){
            System.out.print(st1[i] + " ");
        }

        sc.close();
    }
}