package PastaAtividade6;

import java.util.ArrayList;
import java.util.Collections;

public class exe2 {

    public static void main(String[] args){

        ArrayList <String> pessoas = new ArrayList<String>();

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

        Collections.sort(pessoas);

        System.out.println(pessoas);



    }

}