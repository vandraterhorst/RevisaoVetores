package PastaAtividade7.PastaAtividade9;

public class EntradadeCinema {



    public float horario;
    public int sala;
    public float valor;
    public int anoFilme;
    public ClienteCinema cliente;

    public void inicio( float horario, int sala, float valor,int anoFilme){
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
        this.anoFilme=anoFilme;
    }

    public  double  calculaDesconto (ClienteCinema cliente) {
        int ano=anoFilme-cliente.getAnoNascimento();
        double desconto =0;
        if (ano <  12 ) {
            desconto =this.valor/2 ;
        }
        return desconto;
    }

    public  double  calculaDescontoEst(ClienteCinema cliente){
        int ano =anoFilme-cliente.getAnoNascimento();
        int cart = cliente.getNumCarteira();
        double desc =  0;

        if (ano <  12  && ano >=  15 ) {
            desc = this.valor - ( this . valor *  0.40 );
        }

        if (ano <=  16  && ano >=  20 ) {
            desc = this. valor- ( this. valor *  0.30);
        }

        if (ano >  20 ) {
            desc=this. valor - ( this. valor *  0.20 );
        }
        return desc;
    }
    public float calculaDescHora() {
        double desc =  0;
        if ( this . horario <  16 ) {
            desc =this.valor - ( this . valor *  0.10 );
        }
        return (float) desc;
    }


    public  String toString () {
        return  " Hora: "  + horario +  " \n "  +
                " Valor: "  +  String .format ("% .2f" , valor) +  " \n "  +
                " Desconto: "  +  String . format( " % .2f " , calculaDesconto(cliente)) +  " \n " +
                " Desconto para estudante: " + calculaDescontoEst(cliente) +  " \n "  +
                " Desconto pelo horario: "  +   String . format ( " % .2f " , calculaDescHora ());
    }
}