package PastaAtividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);

        String s;

        pessoas.add("Carlos");
        pessoas.add("Pedro");
        pessoas.add("Alex");
        pessoas.add("Joao");
        pessoas.add("Felipe");
        pessoas.add("Mara");
        pessoas.add("Paulo");
        pessoas.add("Camila");
        pessoas.add("Vitor");
        pessoas.add("Artur");

        System.out.println("Digite o nome que vc deseja procurar: ");
        s = ler.nextLine();

        if(pessoas.contains(s)){
            System.out.println("Esse nome esta na lista!");
        }else{
            System.out.println("Esse nome não esta na lista!!!");
        }
    }
}
