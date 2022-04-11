package br.edu.fatecfranca.ex3;

public abstract class Imovel {
    protected String endereco;

    public Imovel() {
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
   
    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }
  
}
