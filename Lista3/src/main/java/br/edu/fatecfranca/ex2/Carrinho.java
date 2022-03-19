package br.edu.fatecfranca.ex2;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private int codigo;
    private Date data;
    private float valor;
    
    // vetor de objetos-parte
    private ArrayList<ItemCarrinho> itens;
    
   public Carrinho(){
       itens = new ArrayList();
   }

    public Carrinho(int codigo, Date data, float valor, 
            ArrayList<ItemCarrinho> itens) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
        this.itens = itens;
    }
   
    
    public Carrinho(int codigo, Date data) {
        this.codigo = codigo;
        this.data = data;
    }
   
   //pesquisar como adicionar e remover em um arraylist
}
