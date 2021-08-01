package PastaAtividade8;

public class Funcionario{

    double salario;
    public String departamento;
    public String nome;
    public String dataEntrada;
    public String rg;
    public boolean verdade;


    void recebeAumento(double aumento) {

        if (verdade) {
            this.salario += aumento;
            System.out.println("Recebeu aumento, seu salario agora é  \n" + this.salario);
        }

    }

    public void calculaGanhoAnual() {

        double salarioAnual = (salario * 12);

        System.out.println("Salario anual  " +salarioAnual);


    }
    public void ver(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Data de entrada: " +this.dataEntrada);
        System.out.println("RG: " +this.rg);
        System.out.println("Salario Atual: " +this.salario);

    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;

    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;

    }

    public void setRg(String rg) {
        this.rg = rg;

    }

    public void setSalario(float salario) {
        this.salario = salario;

    }
}