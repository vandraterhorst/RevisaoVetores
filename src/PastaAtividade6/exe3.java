package PastaAtividade6;

import java.util.Scanner;
import java.util.ArrayList;;

public class exe3 {
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


        System.out.println("Digite o nome que deseja excluir: ");
        s = ler.nextLine();
        if(pessoas.equals("clear")){
            pessoas.clear();
            System.out.print("A lista foi limpa!");

        }else{
            System.out.printf("O nome " +s+ " foi removido!!\n");
            pessoas.remove(s);
        }


        System.out.print("Lista Atualizada: " +pessoas);





    }

}