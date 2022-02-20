package br.edu.fatecfranca.ex4;

public class TestaRio {

    public static void main(String[] args) {
       Rio t1 = new Rio("Canoas", 50, false);
       
       t1.mostrar();
       t1.chover(20);
       t1.mostrar();
       t1.ensoladorar(30);
       t1.mostrar();
       t1.sujar();
       t1.mostrar();
       
       Rio t2 = new Rio("Sapacai", 80, true);
       
       t2.mostrar();
       t2.chover(10);
       t2.mostrar();
       t2.ensoladorar(40);
       t2.mostrar();
       t2.limpar();
       t2.mostrar();
      
    }
    
}
