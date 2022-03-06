
package br.edu.fatecfranca.ex2;

public final class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;
    
    public Aluno(){
        
    }
    
    public Aluno (int nroAluno, int idade, String nome, float p1, float p2){
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void setNroAluno( int nroAluno){
        String nroAlunoString = String.valueOf(nroAluno);
        if (nroAlunoString.length() == 6){
            this.nroAluno = nroAluno;
        } else {
            this.nroAluno = 0;
            System.out.println("Nº do Aluno deve conter 6 digitos");
        }
    }
    
    public void setIdade( int idade){
        if (idade >= 0){
            this.idade = idade;
        } else{
            this.idade = 0;
            System.out.println("Idade não pode ser menor que ZERO");
        }
    }
    
    public void setNome(String nome){
        if(nome.length() <=30){
            this.nome = nome;
        } else {
            this.nome = "Nome Invalido";
            System.out.println("Nome com no maximo 30 caracteres.");
        }
    }
    
    public void setP1(float p1){
        if (p1 >=0){
            this.p1 = p1;
        } else {
            this.p1 = 0;
            System.out.println("Prova 1 não pode ser negativa!");
        }
    }
    
    public void setP2(float p2){
        if (p2 >=0){
            this.p2 = p2;
        } else {
            this.p2 = 0;
            System.out.println("Prova 2 não pode ser negativa!");
        }
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2) /2;
    }
    
    public int getNroAluno(){
        return nroAluno;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getP1(){
        return p1;
    }
    
    public float getP2(){
        return p2;
    }
    
    public String dadosAluno() {
        return "Nro Aluno: " + nroAluno + 
         "\n Nome Aluno: " + nome + 
         "\n Idade: " + idade +
         "\n Prova 1° Bimestre: " + p1 + 
         "\n Prova 2° Bimestre: " + p2 + 
         "\n Média: " + this.notaFinal();
    }

    
}
