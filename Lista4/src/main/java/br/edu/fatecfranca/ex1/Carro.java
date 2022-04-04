package br.edu.fatecfranca.ex1;

public class Carro extends Veiculo{
    //pontencia: float, combustivel: String
    //fazer @oviridade toString nas filhas
    //criar exemplo de polimofismo
    
    private float pontencia;
    private String combustivel;

    public Carro() {
    }

    public Carro(float pontencia, String combustivel, String modelo, String nome, int ano) {
        super(modelo, nome, ano);
        this.pontencia = pontencia;
        this.combustivel = combustivel;
    }

    public float getPontencia() {
        return pontencia;
    }

    public void setPontencia(float pontencia) {
        this.pontencia = pontencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    @Override
    public String comoMeLocomovo(){
        return "Dar partida no carro!";
    }

    @Override
    public String toString() {
        return "Carro{" + "pontencia=" + pontencia + ", combustivel=" + combustivel 
                + super.toString() + " Locomove: " + comoMeLocomovo() +'}';
    }
    
    
    
}
