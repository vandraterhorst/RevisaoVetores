package PastaAtividade7.PastaAtividade9;
import java.util.ArrayList;

public class Curso {

    public int codigo;
    public  float valorMens;
    ArrayList < Aluno > listaAluno =  new  ArrayList <> ();


    public Curso( int codigo , float valorMens ) {
        this. codigo = codigo;
        this. valorMens = valorMens;
    }

    public  int  getCodigo () {
        return codigo;
    }

    public  void  setCodigo ( int  codigo ) {
        this.codigo=codigo;
    }

    public  double  getValorMensalidade () {
        return valorMens;
    }

    public  void  setValorMensalidade ( double  valorMensalidade ) {
        this. valorMens = valorMens;
    }

    public  int  quantAluno () {
        return  this.listaAluno.size();
    }

    public  void  addAluno( Aluno  a1 ) {
        this.listaAluno.add (a1);
    }

    public  int  quantAprov() {
        int quant=0;
        for ( Aluno a1 : listaAluno) {
            if (a1.getNota()>=  7 ) {
                quant ++ ;
            }
        }
        return quant ;
    }

    public  int  quantidadeReprov() {
        int quant=0;
        for( Aluno a1 : listaAluno) {
            if (a1.getNota () <  7 ) {
                quant ++ ;
            }
        }
        return quant;
    }

    public float renda () {
        return ( float ) (listaAluno . size () *  this . valorMens);
    }




}
