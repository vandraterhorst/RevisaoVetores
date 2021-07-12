package PastaAtividade3;
import java.util.Scanner;
import java.util.Random;

public class exe6 {

    public static void main(String[] args) {


        Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);


        int valor = aleatorio.nextInt(5);
        int valor2 = aleatorio.nextInt(3);
        String[] letra= new String[4];
        String[] s1= new String[10];
        String[] s2 = new String[10];
        String[] s3 = new String[10];
        String [] s4= new String[10];

        for( int i=0;i<3;i++){
            System.out.println("Digite o codigo genetico para S1: ");
            s1[i]= ler.next();


            System.out.println("\"Digite o codigo genetico para S2: ");
            s2[i]= ler.next();

        }
        for( int i=0;i<4;i++){
            s3[i]=s1[i];
            s3[i+4]=s2[i+4];

        }
        for(int i=0;i<4;i++) {

            s4[i] = s2[i];
            s4[i+4] = s1[i + 4];

        }

        letra[0]= "a";
        letra[1]= "t";
        letra[2]= "g";
        letra[3]= "c";


        s3[valor]=letra[valor2];

        System.out.print("Codigo genetico de S1: \n");
        for(int i=0;i<3;i++){
            System.out.printf("%s \n",s1[i]);
        }

        System.out.print("Codigo genetico de S2: \n");
        for(int i=0;i<3;i++){
            System.out.printf("%s \n",s2[i]);

        }

        System.out.print("Codigo genetico de S3: \n");
        for(int i=0;i<3;i++){
            System.out.printf("%s \n",s3[i]);
        }


        System.out.print("Codigo genetico de S4: \n");
        for(int i=0;i<3;i++){
            System.out.printf("%s \n",s4[i]);
        }
        ler.close();
    }
}