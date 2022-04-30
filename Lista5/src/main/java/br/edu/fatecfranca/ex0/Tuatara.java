package br.edu.fatecfranca.ex0;

public class Tuatara implements IReptil, IMamifero{

    @Override
    public void criarEscama() {
        System.out.println("Tuatara criando escama");
    }

    @Override
    public void porOvos() {
        System.out.println("Tuatara pondo ovs");
    }
    
    @Override
    public void darMama() {
        System.out.println("Tuatara dando mama");
    }

    @Override
    public void crairPelo() {
        System.out.println("Tuatara criando pelo");
    }
    
}
