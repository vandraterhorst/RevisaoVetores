package PastaAtividade7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        String s = " ";
        int aux = 0;

        while (true){

            System.out.println("Escolha uma das opções: \n");
            System.out.print("1 - cadastrar \n");
            System.out.print("2 - listas \n");
            System.out.print("3 - remover \n");
            System.out.print("0 - sair \n");

            aux = ler.nextInt();

            switch (aux){
                case 1:
                    System.out.print("Digite o nome: ");
                    ler.nextLine();
                    s = ler.nextLine();
                    System.out.print("Digite o número: ");
                    String num = ler.nextLine();
                    lista.add(s + " " + num);
                    break;
                case 2:
                    Collections.sort(lista);
                    System.out.println("Lista ordenada ");
                    for(int i = 0; i < lista.size(); i++){
                        System.out.printf("%d - %s\n", i, lista.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Informe o índice  que deseja remover: ");
                    int rem = ler.nextInt();
                    lista.remove(rem);
                    break;
                default:

            }

            if(aux == 0){
                System.out.println("Programa finalizado.");

            }

        }


    }
}