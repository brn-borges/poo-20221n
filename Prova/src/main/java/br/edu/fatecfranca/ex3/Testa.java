package br.edu.fatecfranca.ex3;

public class Testa {

    public static void mostra(Imovel x){
        System.out.println(x.toString());
    }
    
    public static void main(String[] args) {
         Casa c1 = new Casa(1, "Rua Sei nao");
         Apto a1 = new Apto(10, "Rua tres");
                
         mostra(c1);
         mostra(a1);
    }
    
}
