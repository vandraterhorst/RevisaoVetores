package PastaAtividade3;
import java.util.Scanner;



public class exe1 {
    public static void main(String[] args){

        Scanner frase = new Scanner(System.in);
        String s;
        int contVogais = 0;
        int contdig = 0;
        System.out.println("Escreva uma frase: \n");
        s = frase.nextLine();


        System.out.println("Quantidade de caracteres: %d\n"+ s.length());

        System.out.println("Caracteres maiusculos: " +s.toUpperCase());

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contVogais++;
            }

        }
        System.out.println("Numero de vogais: " +contVogais);

        if(s.toLowerCase().startsWith("uni")){
            System.out.println("Inica com Uni");
        }else{
            System.out.println("Nao inicia com Uni");
        }

        if(s.toLowerCase().endsWith("rio")){
            System.out.println("Termina com Uni");
        }else{
            System.out.println("Nao termina com Uni");
        }

//numero de digitos
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                contdig ++;
            }
        }
        System.out.println("A string tem " + contdig + " digitos");

//mostra se eh um palindromo

        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i) );
        }
        if(s.equals(sb.toString())){
            System.out.println("É um palindromo");
        }else{
            System.out.println("Não é um palindromo");
        }


    }
}