package PastaAtividade5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class exe3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String senha;
        String verificar = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$";

        System.out.println("Digite sua senha: ");
        senha = ler.nextLine();

        Pattern padrao = Pattern.compile(verificar);
        Matcher match = padrao.matcher(senha);

        if (match.find() == true) {
            System.out.println("Senha aceita!");
        } else
            System.out.println("Senha não aceita. Você deve criar uma senha mais forte!!");
    }




}