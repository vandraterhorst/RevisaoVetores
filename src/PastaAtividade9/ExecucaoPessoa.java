package PastaAtividade9;

public class ExecucaoPessoa {

    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Abraham", null, null);
        Pessoa p2 = new Pessoa("Mona", null, null);
        Pessoa p3 = new Pessoa("Clancy", null, null);
        Pessoa p4 = new Pessoa("Jack", null, null);

        Pessoa p5 = new Pessoa("Herb", p1, null);
        Pessoa p6 = new Pessoa("Homer", p1, p2);
        Pessoa p7 = new Pessoa("Marge", p3, p4);
        Pessoa p8 = new Pessoa("Patty", p3, p4);
        Pessoa p9 = new Pessoa("Selma", p3, p4);

        Pessoa p10 = new Pessoa("Bart", p6, p7);
        Pessoa p11 = new Pessoa("Lisa", p6, p7);
        Pessoa p12 = new Pessoa("Maggie", p6, p7);
        Pessoa p13 = new Pessoa("Ling", null, p9);


        System.out.println("Bart é irmão de Lisa? " + p11.ehIrmao(p10));
        System.out.println("Homer é ancestral de Bart? " + p10.ehAntecessor(p6));
        System.out.println("Mona é ancestral de Bart? " + p10.ehAntecessor(p2));
        System.out.println("Ling é ancestral de Bart: " + p10.ehAntecessor(p13));



    }

}