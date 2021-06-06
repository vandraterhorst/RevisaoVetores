import java.util.Scanner;
import java.util.Arrays;


public class exe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];
        int i;

        System.out.println("Informe os valores do primeiro vetor");
        for(i=0; i< 10; i++) {
            vet1[i] = sc.nextInt();
        }
        System.out.println("Informe os valores do segundo vetor");
        for(i=0; i< 10; i++) {
            vet2[i] = sc.nextInt();
        }
        for(i=0; i< 10; i++) {
            vet3[i] = vet1[i] * vet2[i];
        }
        System.out.println(" o valor da multiplicação por cada elemento eh =  "+Arrays.toString(vet3));
    }
}



