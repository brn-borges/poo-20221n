package br.edu.fatecfranca.ex0;

public abstract class Funcionario {
    protected int nro;
    protected String nome;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(int nro, String nome, float salario) {
        this.nro = nro;
        this.nome = nome;
        this.salario = salario;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public abstract float calculaSalarioFinal();
    
    @Override
    public String toString() {
        return "Funcionario{" + "nro=" + nro + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    
}
