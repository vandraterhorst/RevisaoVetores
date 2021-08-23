package PastaAtividade7.PastaAtividade9;
import java.util.ArrayList;

public class Pais {

    public String codigoIso;
    public String nome;
    public Integer pop;
    public Double dimensao;
    public ArrayList<Pais> paisFronteira = new ArrayList<Pais>();

    public Pais(String codigoIso, String nome, Double dimensao, Integer pop) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.pop = pop;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean ehOMesmoPais(Pais outroPais){
        if( this.codigoIso.equals(outroPais.getCodigoIso())){
            return true;
        }else{
            return false;
        }
    }

    public boolean ehLimitrofe(Pais outroPais){
        if( this.paisFronteira.contains(outroPais) ){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Pais> vizinhosComuns(Pais outroPais){
        ArrayList<Pais> comuns = new ArrayList<Pais>();
        for(Pais p : this.paisFronteira){
            if( outroPais.ehLimitrofe(p) ){
                comuns.add(p);
            }
        }
        return comuns;
    }
    public float desidadepop(){

        return (float) (this.pop / this.dimensao);
    }


}