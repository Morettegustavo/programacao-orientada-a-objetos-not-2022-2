package br.edu.fatecfranca.lista3.lista4;

import javax.swing.JOptionPane;

public class Diretor extends Funcionario{
    private float participacaoLucros;
    
    public Diretor(){
        super();
    }

    public Diretor(float participacaoLucros, String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.participacaoLucros = participacaoLucros;
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public String toString() {
        return "Diretor{" + "participacaoLucros=" + participacaoLucros + "\n" +
                super.toString() + '}';
    }    
    
    @Override
    public float calculaSalario(){
        String lucro = JOptionPane.showInputDialog("Informe lucro da empresa");
        float lucro2 = Float.parseFloat(lucro);
        return this.salario + (this.participacaoLucros * lucro2) / 100;
    }
}
