package PastaAtividade3;
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        int n = 0;

        System.out.println("Informe um numero: \n");
        n = ler.nextInt();

        String s =  n + "";

        for(int i = 0; i < s.length(); i++){
            String valor = "";
            switch (s.charAt(i)){
                case '0':
                    valor = "zero";
                    break;
                case '1':
                    valor = "um";
                    break;
                case '2':
                    valor = "dois";
                    break;
                case '3':
                    valor = "três";
                    break;
                case '4':
                    valor = "quatro";
                    break;
                case '5':
                    valor = "cinco";
                    break;
                case '6':
                    valor = "seis";
                    break;
                case '7':
                    valor = "sete";
                    break;
                case '8':
                    valor = "oito";
                    break;
                case '9':
                    valor = "nove";
                    break;
                default:
                    break;
            }

            System.out.print(valor);

            if(i != s.length() - 1){
                System.out.print(", ");
            }
        }
        ler.close();
    }
}