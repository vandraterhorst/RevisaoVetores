package PastaAtividade7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        int i;
        int j;

        System.out.println("Digite um numero inteiro: ");
        System.out.println("Digite um numero negativo para parar: ");

        do{

            i=ler.nextInt();
            if(i>=0){
                num.add(i);
            }

        }while(i>=0);
        System.out.println("Impressão utilizando o for tradicional \n ");
        for(j=0; j<num.size(); j++){
            Integer aux= num.get(j);

            System.out.println("Elemento  \n"+aux);
        }

        System.out.println("Impressão utilizando o for dinamico \n ");
        for(Integer aux1:num){
            System.out.println("Elemento  \n"+aux1);
        }
        System.out.println("Impressão utilizando iterator \n ");
        Iterator<Integer> it=num.iterator();

        while(it.hasNext()){
            Integer aux2 = it.next();
            System.out.println("Elemento  \n"+aux2);
        }
    }
}