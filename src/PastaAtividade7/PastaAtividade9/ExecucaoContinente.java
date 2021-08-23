package PastaAtividade7.PastaAtividade9;

public class ExecucaoContinente {

    public static void main(String[] args) {
        Pais p1 = new Pais("BRA", "BRASIL", 1001.0, 101);
        Pais p2 = new Pais("ARG", "ARGENTINA", 1002.0, 102);
        Pais p3 = new Pais("URU", "URUGUAI", 1003.0, 103);
        Pais p4 = new Pais("EQU", "EQUADOR", 1004.0, 104);
        Pais p5 = new Pais("BOL", "BOLÍVIA", 1005.0,105);


        p1.paisFronteira.add(p2);
        p1.paisFronteira.add(p3);
        p1.paisFronteira.add(p5);
        p2.paisFronteira.add(p1);
        p2.paisFronteira.add(p3);
        p2.paisFronteira.add(p5);
        p3.paisFronteira.add(p1);
        p3.paisFronteira.add(p2);
        p5.paisFronteira.add(p1);
        p5.paisFronteira.add(p2);

        Continente america = new Continente("America");

        america.addPais(p1);
        america.addPais(p2);
        america.addPais(p3);
        america.addPais(p4);
        america.addPais(p5);


        System.out.println("População total do continente: " +america.popContinente());
        System.out.println("Dimensão total do continente: " +america.dimensaoContinente());
        System.out.println("Menor país em dimensão do continente: " +america.menorDim().getNome());
        System.out.println("Maior país em dimensão do continente: " +america.maiorDim().getNome());
        System.out.println("Densidade populacional do continente: " +america.densPop());


    }
}