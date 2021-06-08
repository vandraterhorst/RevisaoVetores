package RevisaoVetores;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[20];
        int aux;
        int i;
        int x = 19;

        System.out.println("Informe os valores do vetor");

        for (i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.println("Vetor original\n");

        for (i = 0; i < 20; i++) {
            System.out.printf("%d\n", vet[i]);
        }
        for (i = 0; i < 10; i++) {
            aux = vet[i];
            vet[i] = vet[x];
            vet[x] = aux;
            x--;
        }

        System.out.println("Vetor Alterado\n");
        for (i = 0; i < 20; i++) {
            System.out.printf("%d\n", vet[i]);
        }


    }
}