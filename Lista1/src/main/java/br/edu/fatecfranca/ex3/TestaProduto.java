package br.edu.fatecfranca.ex3;

public class TestaProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Pão", 10, 5);
        
        p1.mostrar();
        
        p1.comprar(10);
        p1.mostrar();
        p1.vender(5);
        p1.mostrar();
        p1.subir(2);
        p1.mostrar();
        p1.descer(1);
        p1.mostrar();
        
        
        Produto p2 = new Produto(2, "Arroz", 1, 50);
        
        p2.mostrar();
        
        p2.comprar(10);
        p2.mostrar();
        p2.vender(5);
        p2.mostrar();
        p2.subir(2);
        p2.mostrar();
        p2.descer(1);
        p2.mostrar();
    }
    
}
