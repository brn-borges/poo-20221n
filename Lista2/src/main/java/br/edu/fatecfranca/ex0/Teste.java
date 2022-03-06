package br.edu.fatecfranca.ex0;

public class Teste {

    public static void main(String[] args) {
       Niver obj = new Niver();
       obj.setDia(3);
       obj.setDia(30);
       obj.setDia(-3);
       obj.setMes ("Janeiro");
       obj.setMes ("Outubro");
   
       //System.out.println("Dia: " + obj.dia + " Mes: " + obj.mes);
       
       Niver obj1 = new Niver();
       
       obj1.setMes("Janeiro");
       obj1.setDia(2);
              
       Niver obj2 = new Niver(2, "Setembro");
       
       Niver obj3 = new Niver(38, "Verão");
       
       System.out.println("Dia: " + obj.getDia() + " Mes: " + obj.getMes());
       
       System.out.println("Dia: " + obj1.getDia() + " Mes: " + obj1.getMes());
       
       System.out.println("Dia: " + obj2.getDia() + " Mes: " + obj2.getMes());
       
       System.out.println("Dia: " + obj3.getDia() + " Mes: " + obj3.getMes());
       
    }
    
}
