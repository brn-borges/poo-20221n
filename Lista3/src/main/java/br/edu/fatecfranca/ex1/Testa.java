package br.edu.fatecfranca.ex1;

import java.util.Date;

public class Testa {

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("Bruno Borges", "400.012.768-32");
        Voo v1 = new Voo(111, "Guarulhos", "Bahamas");
        Reserva r1 = new Reserva(222, new Date(), p1, v1);
        
        System.out.println(r1.mostra());
    }
    
}
