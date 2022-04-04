package br.edu.fatecfranca.ex1;

public abstract class Veiculo {
   //Veiculo é abstrata -> Tem metodo abstrato
   //Modelo: String, Nome: String, Ano: int.
   
    protected String modelo;
    protected String nome;
    protected int ano;

    public Veiculo() {
    }

    public Veiculo(String modelo, String nome, int ano) {
        this.modelo = modelo;
        this.nome = nome;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public abstract String comoMeLocomovo();

    @Override
    public String toString() {
        return "Veiculo{" + "modelo=" + modelo + ", nome=" + nome + ", ano=" + ano + '}';
    }
   
    
}
