package br.edu.fatecfranca.ex1;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNroConta("123456-9");
        obj1.setNroAgencia("1637-5");
        obj1.setNome("Bruno");
        obj1.setSaldo(1520);
        obj1.realizarDeposito(50);
        obj1.realizarSaque(520);
        System.out.println(obj1.mostra());

        Cliente obj2 = new Cliente("125668-1","2562-2","Gabriel", 3050);
        obj2.realizarSaque(3000);
        System.out.println(obj2.mostra());
    }
    
}
