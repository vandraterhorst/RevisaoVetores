package PastaAtividade3;
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        int n = 0;

        System.out.println("Digite um numero: \n");
        n = ler.nextInt();

        String s =  n + "";

        for(int i = 0; i < s.length(); i++){
            String valor = "";
            switch (s.charAt(i)){
                case '0':
                    valor = "Zero";
                    break;
                case '1':
                    valor = "Um";
                    break;
                case '2':
                    valor = "Dois";
                    break;
                case '3':
                    valor = "Três";
                    break;
                case '4':
                    valor = "Quatro";
                    break;
                case '5':
                    valor = "Cinco";
                    break;
                case '6':
                    valor = "Seis";
                    break;
                case '7':
                    valor = "Sete";
                    break;
                case '8':
                    valor = "Oito";
                    break;
                case '9':
                    valor = "Nove";
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