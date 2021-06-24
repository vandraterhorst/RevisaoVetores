package PastaAtividade2;

import java.util.Scanner;

public class exe8 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[15];
        int i;

        System.out.println("Entre com os valores do vetor: ");

        for (i=0; i<15; i++) {
            vet[i] = sc.nextInt();
        }

        for (i=14; i>=0; i--) {
            System.out.printf("Vetor inverso: %d\n", vet[i]);


        }


    }
}