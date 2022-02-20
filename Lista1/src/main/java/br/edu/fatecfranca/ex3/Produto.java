package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class Produto {
    int id;
    String descricao;
    int qtde;
    float preco;
    
    Produto(){
        
    }
    Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    void comprar(int x){
        this.qtde += x;
    }
    
    void vender(int x){
        this.qtde -= x;
    }
    
    void subir(float x){
        this.preco += x;
    }
    
    void descer(float x){
        this.preco -= x;
    }
    
    void mostrar(){
         JOptionPane.showMessageDialog(null, "Cod: " + this.id + " Descrição: "+ this.descricao + 
                " Qtde: " + this.qtde + " Preço: " + this.preco);
    }
}

