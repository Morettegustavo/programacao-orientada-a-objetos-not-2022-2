package br.edu.fatecfranca.lista3.lista4;
public class Gerente extends Funcionario {

    private float bonificacao;

    public Gerente() {
        super();
    }

    public Gerente(float bonificacao, String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.bonificacao = bonificacao;
    }
    
    public float getBonificacao() {
        return bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonificacao=" + bonificacao + "\n" +
                super.toString() + '}';
    }    
    
    @Override
    public float calculaSalario(){
        return this.salario + this.bonificacao;
    }
}
