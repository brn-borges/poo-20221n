
package br.edu.fatecfranca.ex1;

public final class Cliente {
    private String nroConta;
    private String nroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente() {
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
       
    }
    
    public void setNroConta( String nroConta){
        if(nroConta.length() == 8){
            if(nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            } else {
                this.nroConta = "Invalido";
                System.out.println("Conta deve conter um digito verificado.");
            }
        } else{
            this.nroConta = "Conta Invalida";
                System.out.println("Conta deve conter ate oito digito.");
        }
    }
    
    public void setNroAgencia( String nroAgencia){
        if(nroAgencia.length() == 6){
            if(nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }else {
                this.nroAgencia = "Agencia Invalida";
                System.out.println("Agencia deve conter o digito verificado.");
            }
        }else {
            this.nroAgencia = "Agencia Invalida";
            System.out.println("Agencia deve conter tamanho 6.");
        }
    }
    
    public void setNome( String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        } else {
            this.nome = "Nome Invalido.";
            System.out.println("Nome com no maximo 30 caracteres.");
        }
    }
    
    public final void setSaldo (float saldo){
        if (saldo >=0){
            this.saldo = saldo;
        }
    }

    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
    }

    public void realizarSaque(float x){
        if(x>0){
            this.setSaldo(this.saldo - x);
        }
    }
    
    public String getNroConta() {
        return this.nroConta;
    }

    public String getNroAgencia() {
        return this.nroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String mostra() {
        return "Cliente: \n Nome:" + nome + 
        "\n Nº Agencia: " + nroAgencia + 
        "\n Nº Conta:" + nroConta + "\n Saldo:" + saldo;
    }
    
}
