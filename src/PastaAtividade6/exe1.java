package PastaAtividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args){

        ArrayList <String> pessoas = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        String s;


        System.out.println("Digite um nome: ");
        s = ler.nextLine();

        while(! s.equals("vazio")){

            if (pessoas.contains(s)) {


                System.out.println("Esse nome já esta na lista. Favor informar outro nome!");
                s = ler.nextLine();

            }

            pessoas.add(s);
            System.out.println("Digite outro nome: ");
            s = ler.nextLine();

        }

        for(String p : pessoas){
            System.out.println("Nome: " +p+ " Posição " +pessoas.indexOf(p));
        }

        ler.close();


    }

}