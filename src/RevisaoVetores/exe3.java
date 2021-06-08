package RevisaoVetores;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int i;
        int pos = 10000;
        int menor =   10000;

        System.out.println("Informe os valores do vetor: ");
        for (i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();

        }

        for (i = 0; i < 10; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
                pos = i;
            }
        }
        System.out.printf(" O menor valor eh: %d\n", menor);
        System.out.printf(" A posicao eh: %d\n", pos);
    }
}






