package br.edu.fatecfranca.ex1;

public class Testa {

    public static void main(String[] args) {
        Computador pc1 = new Computador("desligado", 4);
        System.out.println(pc1.toString());
        pc1.upgradeMemoria(4);
        System.out.println(pc1.toString());
        Computador pc2 = new Computador("ligado", 8);
        System.out.println(pc2.toString());
        
    }
    
}
