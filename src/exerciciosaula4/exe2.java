package exerciciosaula4;


import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String st = sc.nextLine();

        String[] st1 = st.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = st1.length - 1; i >= 0; i--){
            sb.append(st1[i] + " ");
        }

        System.out.println(sb);

        sc.close();
    }
}