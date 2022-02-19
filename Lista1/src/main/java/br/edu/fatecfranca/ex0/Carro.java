package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Carro {
    // declaração das variaveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    //Metodos construtores
    Carro(){
        
    }
    Carro(String modelo, int ano, float velocidade, boolean motor){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    
    //metodos
    void ligar(){
        this.motor = true;
    }
    
    void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }
    
    void acelerar(float x){
        this.velocidade += x;
    }
    
    void frear(float x){
        this.velocidade -= x;
    }
    
    void mostrar(){
        //System.out.println("Modelo: " + this.modelo + " Ano: " + this.ano + 
        //        " Velocidade: " + this.velocidade + " Motor: " + this.motor);
        
        JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + " Ano: " + this.ano + 
                " Velocidade: " + this.velocidade + " Motor: " + this.motor);
    }
}
