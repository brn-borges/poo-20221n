package br.edu.fatecfranca.ex0;

public class Testa {
    
    public static void mostra(Funcionario x){
        System.out.println(x.toString());
    }

    public static void main(String[] args) {
        Assistente a1 = new Assistente(1000, 100, "Fulano", 2000);
        Gerente g1 = new Gerente(20, 101, "Beltrano", 4000);
        Diretor d1 = new Diretor(50000, "Onix", 102, "Ciclano", 6000);
        
        mostra(a1);
        mostra(g1);
        mostra(d1);
        //Vamos tornar a classe pai em uma classe abstrata.
        //Classe filho em somente um pai.
    }
    
}
