package PastaAtividade7.PastaAtividade9;
import java.util.ArrayList;

public class Inst {
    ArrayList < Curso > listaCurso =  new  ArrayList <> ();

    public  int  repr() {
        int quant=0;
        for (Curso c1:listaCurso){
            quant = quant + c1.quantidadeReprov();
        }
        return quant;
    }

    public  int  maiorReceita() {
        float maior =  0 ;
        Curso Maior =  null ;
        for ( Curso c1 : listaCurso) {
            if (c1 .renda () > maior) {
                maior = c1 . renda ();
                Maior = c1;
            }
        }
        return Maior.getCodigo ();
    }


    public  String  toString () {
        String string =  " " ;
        for ( Curso c1 : listaCurso) {
            string = string + c1 . toString () ;
        }
        return string;
    }

}