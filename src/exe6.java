import java.util.Scanner;

public class exe6 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int i;
        int j;
        int elem;

        System.out.println("Informe os valores do vetor X");
        for (i = 0; i < 10; i++) {
            X[i] = sc.nextInt();
        }

        System.out.println("Informe os valores do vetor Y");
        for (i = 0; i < 10; i++) {
            Y[i] = sc.nextInt();
        }


        System.out.println("\n Uniao de x e y \n");
        for (i = 0; i < 10; i++) {
            System.out.printf("%d\n", X[i]);
        }
        for (i = 0; i < 10; i++) {
            System.out.printf("%d\n", Y[i]);

        }

        System.out.println("\n Diferenca de x e y \n");
        for (i = 0; i < 10; i++) {
            System.out.printf("%d \n", X[i] - Y[i]);
        }

        System.out.println("\n Soma de x e y \n");
        for (i = 0; i < 10; i++) {
            System.out.printf("%d \n", X[i] + Y[i]);
        }

        System.out.println("\n Produto de x e y \n");
        for (i = 0; i < 10; i++) {
            System.out.printf("%d \n", X[i] * Y[i]);
        }

        System.out.println("\n Interseccao de x e y \n");
        for (i = 0; i < 10; i++) {
            elem = X[i];
            for (j = 0; j < 10; j++) {
                if (elem == Y[j]) {
                    System.out.printf("%d \n", elem);
                    break;
                }
            }
        }
    }
}


