package RevisaoVetores;

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[20];
        int i;
        int par = 0;

        System.out.println("Informe os valores do vetor: ");
        for (i = 0; i < 20; i++) {
            vet[i] = sc.nextInt();
        }
        for (i = 0; i < 20; i++) {
            if (vet[i] % 2 == 0) {
                par++;
            }
        }
        System.out.printf("Pares = %d", par);
    }
}


