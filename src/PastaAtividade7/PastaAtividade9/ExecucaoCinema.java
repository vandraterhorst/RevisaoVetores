package PastaAtividade7.PastaAtividade9;

public class ExecucaoCinema{

    public static void main(String[] args) {
        EntradadeCinema e1= new EntradadeCinema();
        ClienteCinema c1=new ClienteCinema();
        ClienteCinema c2=new ClienteCinema();
        ClienteCinema c3=new ClienteCinema();
        c1.setAnoNascimento(2004);
        c1.setNumCarteira(9006543);
        c2.setAnoNascimento(1995);
        c3.setAnoNascimento(2015);

        e1.inicio(1330,2,(15/75),2021);
        e1.calculaDesconto(c1);
        e1.calculaDescontoEst(c1);
        e1.calculaDesconto(c2);
        e1.calculaDesconto(c3);
        e1.calculaDescHora();
        e1.toString();
    }
}