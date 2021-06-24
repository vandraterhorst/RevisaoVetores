package PastaAtividade4;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        int i=0;
        boolean aux = false;
        StringBuilder aux1 = new StringBuilder();
        String teste = "pUpm pfpiplpmpe plpepgpapl";



        for(; i<teste.length(); i++ ){
            if (teste.charAt(i) == 'p' && !aux) {
                aux = true;
            } else {
                aux1.append(teste.charAt(i));
                aux = false;
            }
        }


        System.out.println(aux1);

    }

}