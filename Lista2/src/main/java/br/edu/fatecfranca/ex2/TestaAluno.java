package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.setNroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe número do Aluno")));
        aluno1.setNome(JOptionPane.showInputDialog("Informe Nome do Aluno"));
        aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe idade do Aluno!")));
        aluno1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe nota Prova 01")));
        aluno1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe nota Prova 02")));
        System.out.println(aluno1.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno1.dadosAluno());

        Aluno aluno2 = new Aluno(569871,24,"Bruno",9,8);
        JOptionPane.showMessageDialog(null, aluno2.dadosAluno());
    }
    
}
