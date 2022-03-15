
package br.edu.fatecfranca.ex0;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
        
        Cartao ca1 = new Cartao(12345678, 186,new Date(), "Visa", c1);
        
        ca1.mostra();
    }
    
}
