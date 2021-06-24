package PastaAtividade2;

import java.util.Scanner;

public class exe5 {

    public static void main(String[] args) {

        int[] vet1 = new int[6];
        int[][] vet2 = new int[5][8];

        int i,j, count = 0;

        Scanner into = new Scanner(System.in);

        for (i=0;i<6;i++){

            System.out.printf("Digite o numero da loteria: ");

            vet1[i] = into.nextInt();
        }


        for(i=0; i<6; i++){
            for(j=0; j<6; j++){

                System.out.printf("Digite um valor para aposta: ");

                vet2[i][j] = into.nextInt();

                if(vet1[i] == vet2[i][j]){
                    count++;
                }

            }

        }
        for(i=0; i<6; i++){

            System.out.printf("%d - ", vet1[i]);
        }

        System.out.println("Ganhador: " +count);

    }
}