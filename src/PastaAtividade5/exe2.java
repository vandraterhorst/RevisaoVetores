package PastaAtividade5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class exe2 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String url;
        String verificar = "^(((https?|ftp)://)?([\\w\\-.])+(\\.)([\\w]){2,4}([\\w/+=%&_.~?\\-]*))*$";

        System.out.println("Informe uma URL: ");
        url = ler.nextLine();

        Pattern padrao = Pattern.compile(verificar);
        Matcher match = padrao.matcher(url);

        if (match.find() == true) {
            System.out.println("URL válida!!");
        } else
            System.out.println("URL inválida!");
    }






}