package br.edu.fatecfranca.ex0;

public class Ornitorrinco implements IMamifero, IAve{

    @Override
    public void darMama() {
        System.out.println("Ornitorrinco amamentando");        
    }

    @Override
    public void crairPelo() {
        System.out.println("Ornitorrinco criando pêlo");
    }

    @Override
    public void bicar() {
        System.out.println("Ornitorrinco bicando");
    }
        
    @Override
    public void porOvos() {
        System.out.println("Ornitorrinco pondo ovos");
    }
    
}
