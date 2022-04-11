package br.edu.fatecfranca.ex1;

public class Computador {
    private String status;
    private int memoriaRam;

    public Computador() {
    }

    public Computador(String status, int memoriaRam) {
        this.status = status;
        this.setMemoriaRam(memoriaRam);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status == "ligado" || status == "desligado"){
            this.status = status;
        }else{
            System.out.println("Estado Invalido!");
        }
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        if(memoriaRam==4 || memoriaRam==8 || memoriaRam==16 || memoriaRam==32){
            this.memoriaRam = memoriaRam;
        }else{
            System.out.println("Memoria Invalida!");
        }
    }
    
    public void upgradeMemoria(int qtde){
        this.setMemoriaRam(this.memoriaRam + qtde);
    }

    @Override
    public String toString() {
        return "Computador{" + "status=" + status + ", memoriaRam=" + memoriaRam + '}';
    }
        
}
