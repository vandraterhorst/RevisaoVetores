package PastaAtividade4;

public class exe1 {
    public static void main(String[] args) {


        String frase= "Socorram-me, subi no ônibus em Marrocos";
        String fraseInvertida = "";

        String palavra[] = frase.split(" ");


        for(int i = palavra.length-1;i >= 0;i--){
            fraseInvertida = fraseInvertida.concat(palavra[i]+" ");
        }

        fraseInvertida = fraseInvertida.substring(0, fraseInvertida.length()-1);

        System.out.println("Frase Original: \n" + frase);
        System.out.println("\nFrase Invertida: \n" + fraseInvertida);



    }
}