package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class Aluno {
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    float res;
    boolean aprovado;
    
    
    //construtores
    Aluno(){
        
    }
    Aluno(int numeroAluno, String nome, int idade, float  p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    void notaFinal(){
        this.res = (p1 + p2)/2;
       
    }
    
     void passou(){
        if(res >= 6){
            aprovado = true;
        }
    }
    
    void dadosAluno(){
        JOptionPane.showMessageDialog(null, "Numero do Aluno: " + numeroAluno + 
                " Nome do Aluno: " + nome + " Idade: " + idade + " Aprovado: " + aprovado);
    }
    
   
    
}
