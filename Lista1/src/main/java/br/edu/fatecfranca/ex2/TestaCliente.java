package br.edu.fatecfranca.ex2;

public class TestaCliente {

    public static void main(String[] args) {
        
      Cliente Fulano = new Cliente(01, 12, "Italo", 10);
      
      Fulano.mostrar();
      Fulano.realizarDeposito(100);
      Fulano.mostrar();
      Fulano.realizarSaque(52);
      Fulano.mostrar();
      
      
      Cliente Beltrano= new Cliente(02, 11, "Mel", 100);
      
      Beltrano.mostrar();
      Beltrano.realizarDeposito(100);
      Beltrano.mostrar();
      Beltrano.realizarSaque(52);
      Beltrano.mostrar();
            
    }
    
}
