
package br.edu.fatecfranca.ex0;

import java.util.Date;
import java.util.Calendar;

public class Teste {

    public static void main(String[] args) {
        Conta c1 = new Conta("0102341-1", "3259", "Fulano", 1000);
        
        Calendar val = Calendar.getInstance();
        val.set(Calendar.YEAR, 2023);
        val.set(Calendar.MONTH, 2);
        val.set(Calendar.DAY_OF_MONTH,18);
        Cartao ca1 = new Cartao(12345678, 186, val.getTime(), "Visa", 9876, c1);
        
        ca1.mostra();
        ca1.sacar(600,9876);
        ca1.mostra();
    }
    
}
