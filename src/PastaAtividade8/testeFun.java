package PastaAtividade8;

public class testeFun{

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome  = "Carol";
        f1.salario = 150;
        f1.recebeAumento(50);
        f1.dataEntrada ="14/09/2014";
        f1.rg = "123123123";

        Funcionario f2 = new Funcionario();

        f1.nome  = "Lucas";
        f1.salario = 200;
        f1.recebeAumento(50);
        f1.dataEntrada ="19/12/2014";
        f1.rg = "321321321";


        if (f1 == f2) {
            System.out.println("Iguais!");
        } else {
            System.out.println("Diferentes.");
        }
        f1.ver();
    }
}