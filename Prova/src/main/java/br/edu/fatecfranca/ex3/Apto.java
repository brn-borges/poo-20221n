package br.edu.fatecfranca.ex3;

public class Apto extends Imovel {
    private int nro;

    public Apto() {
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    @Override
    public String toString() {
        return "Apto{" + "nro=" + nro + " Imovel: " + super.toString() +"}";
    }
    
}
