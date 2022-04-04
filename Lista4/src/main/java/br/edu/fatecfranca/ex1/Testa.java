package br.edu.fatecfranca.ex1;

public class Testa {

    public static void mostra(Veiculo x){
        System.out.println(x.toString());
    }
    
    public static void main(String[] args) {
         Carro c1 = new Carro(100, "Gasolina", "Rat", "Celta" , 2009);
         Bicicleta b1 = new Bicicleta(1, 10, "Caloi", "Milleun", 2000);
                
         mostra(c1);
         mostra(b1);
    }
    
}
