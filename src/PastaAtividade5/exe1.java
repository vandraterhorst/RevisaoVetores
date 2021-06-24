package PastaAtividade5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class exe1 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String numero;
        String verificar = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";

        System.out.println("Insira um numero de telefone: ");
        numero = ler.nextLine();

        Pattern padrao = Pattern.compile(verificar);
        Matcher match = padrao.matcher(numero);

        if (match.find() == true) {
            System.out.println("Padrao!");
        } else
            System.out.println("Nao identificado.");
    }

}