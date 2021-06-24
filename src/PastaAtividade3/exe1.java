package PastaAtividade3;

import java.util.Scanner;
public class exe1 {
    public static void main(String[] args){

        Scanner frase = new Scanner(System.in);
        String s;
        int contV = 0;
        int contD = 0;
        System.out.println("Digite uma frase: \n");
        s = frase.nextLine();


        System.out.println("Quantidade de caracteres: %d\n"+ s.length());

        System.out.println("Caracteres maiusculos: " +s.toUpperCase());

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contV++;
            }

        }
        System.out.println("Numero de vogais: " +contV);

        if(s.toLowerCase().startsWith("uni")){
            System.out.println("Inicia com Uni!");
        }else{
            System.out.println("Nao inicia com Uni!");
        }

        if(s.toLowerCase().endsWith("rio")){
            System.out.println("Termina com Uni!");
        }else{
            System.out.println("Nao termina com Uni!!");
        }


        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                contD ++;
            }
        }
        System.out.println("A string tem " + contD + " digitos.");


        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i) );
        }
        if(s.equals(sb.toString())){
            System.out.println("É um palindromo!");
        }else{
            System.out.println("Não é um palindromo!");
        }


    }
}