package PastaAtividade7.PastaAtividade9;

import java.util.ArrayList;

public class Continente {

    public String nome;
    public ArrayList <Pais> listaPais = new ArrayList<Pais>();

    public Continente(String nome){
        this.nome = nome;

    }

    public void addPais(Pais p){
        this.listaPais.add(p);

    }

    public float dimensaoContinente(){
        float soma = 0;
        for(Pais p: this.listaPais){
            soma = (float) (soma + p.getDimensao());
        }
        return soma;

    }
    public int popContinente(){
        int soma = 0;
        for(Pais p: this.listaPais){
            soma = soma + p.getPop();
        }
        return soma;

    }

    public float densPop(){
        return (float) this.popContinente() / this.dimensaoContinente();
    }

    public Pais maiorPop(){
        Pais paisMaiorPopulacao = this.listaPais.get(0);
        for(int i=1; i<this.listaPais.size(); i++) {
            Pais p = this.listaPais.get(i);
            if (p.getPop() > paisMaiorPopulacao.getPop()) {
                paisMaiorPopulacao = p;
            }
        }
        return paisMaiorPopulacao;
    }

    public Pais menorPop(){
        Pais paisMenorPopulacao = this.listaPais.get(0);
        for(int i=1; i<this.listaPais.size(); i++){
            Pais p = this.listaPais.get(i);
            if(p.getPop() < paisMenorPopulacao.getPop()){
                paisMenorPopulacao = p;
            }
        }
        return paisMenorPopulacao;
    }

    public Pais maiorDim(){
        Pais paisMaiorDim = this.listaPais.get(0);
        for(int i=1; i<this.listaPais.size(); i++){
            Pais p = this.listaPais.get(i);
            if(p.getDimensao() > paisMaiorDim.getDimensao()){
                paisMaiorDim = p;
            }

        }
        return paisMaiorDim;
    }

    public Pais menorDim(){
        Pais paisMenorDim = this.listaPais.get(0);
        for(int i=1; i<this.listaPais.size(); i++){
            Pais p = this.listaPais.get(i);
            if(p.getDimensao() < paisMenorDim.getDimensao()){
                paisMenorDim = p;
            }
        }
        return paisMenorDim;
    }

    public float razao(){
        Pais paisMaior = this.maiorDim();
        Pais paisMenor = this.menorDim();

        return (float) (paisMaior.getDimensao() / paisMenor.getDimensao());
    }

}