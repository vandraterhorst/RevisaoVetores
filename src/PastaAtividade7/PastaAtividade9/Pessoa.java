package PastaAtividade7.PastaAtividade9;

public class Pessoa {

    public String nome;
    public Pessoa pai;
    public Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;

    }

    public boolean ehIgual(Pessoa outraPessoa){
        if(this.nome.equals(outraPessoa.nome) && this.mae == outraPessoa.mae ){
            return true;

        }else{
            return false;
        }

    }

    public boolean ehIrmao(Pessoa outraPessoa){
        if(this.mae == outraPessoa.mae || this.pai == outraPessoa.pai){
            return true;
        }else{
            return false;
        }
    }

    public boolean ehAntecessor(Pessoa outraPessoa){
        boolean status = false;
        if(outraPessoa == this.mae || outraPessoa == this.pai){
            return true;
        }else{
            status = this.mae.ehAntecessor(outraPessoa);
            if(status == false){
                status = this.pai.ehAntecessor(outraPessoa);
            }
        }

        return  status;
    }



}