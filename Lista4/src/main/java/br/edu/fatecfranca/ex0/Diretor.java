package br.edu.fatecfranca.ex0;

public class Diretor extends Funcionario{
    private float carro;
    private String modelo;

    public Diretor(float carro, String modelo, int nro, String nome, float salario) {
        super(nro, nome, salario);
        this.carro = carro;
        this.modelo = modelo;
    }

    public Diretor() {
    }

    public float getCarro() {
        return carro;
    }

    public void setCarro(float carro) {
        this.carro = carro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Diretor{" + "carro=" + carro + ", modelo=" + modelo + super.toString() +'}';
    }
    
    
    
}
