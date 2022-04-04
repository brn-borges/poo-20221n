package br.edu.fatecfranca.ex0;

public class Gerente extends Funcionario{
    private float comissao;

    public Gerente(float comissao, int nro, String nome, float salario) {
        super(nro, nome, salario);
        this.comissao = comissao;
    }

    public Gerente() {
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calculaSalarioFinal(){
        return this.salario + this.comissao/100;
    }
    
    @Override
    public String toString() {
        return "Gerente{" + "comissao=" + comissao + super.toString() +
                " Salário Final: " + calculaSalarioFinal() +'}';
    }    
}
