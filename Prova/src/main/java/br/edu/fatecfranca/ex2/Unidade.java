package br.edu.fatecfranca.ex2;

public class Unidade {
    private String cidade;
    private String estado;

    public Unidade() {
    }

    public Unidade(String cidade, String estado) {
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Unidade{" + "cidade=" + cidade + ", estado=" + estado + '}';
    }
    
 }
