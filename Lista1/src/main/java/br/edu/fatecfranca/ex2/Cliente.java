package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    //construtores
    public Cliente(){
        
    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float deposito){
        this.saldo += deposito;
    }
    
    public void realizarSaque(float saque){
        this.saldo -= saque;
    }
    
    public void mostrar(){
         JOptionPane.showMessageDialog(null, "Nº da Conta: " + this.numeroConta 
                 + " Nº da Agencia: " + this.numeroAgencia + " Nome: " + this.nome 
                 + " Saldo Atual: " + this.saldo);
    }
}
