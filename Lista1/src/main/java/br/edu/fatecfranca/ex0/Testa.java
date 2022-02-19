package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
        //System.out.println("Hoje é sexta feira");
        
        //cria um objeto da classe Carro
        Carro obj1 =  new Carro();
        
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.velocidade = 0;
        obj1.motor = false;
        
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(80);
        obj1.mostrar();
        obj1.frear(20);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();        
        
        Carro obj2 = new Carro();
        
        obj2.modelo = "Palio";
        obj2.ano = 2012;
        obj2.velocidade = 0;
        obj2.motor = false;
        
        Carro obj3 = new Carro("Gol", 2012, 0, false);
        
        Carro obj4 = new Carro();
        
        obj3.modelo = JOptionPane.showInputDialog("Informe Modelo: ");
        obj3.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe Ano: "));
        obj3.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe Velocidade: "));
        int resp = JOptionPane.showConfirmDialog(null, "Criar o Carro com o motor Ligado: ");
        obj3.motor =  (resp == JOptionPane.OK_OPTION);
                
        obj3.mostrar();  
    }
}
