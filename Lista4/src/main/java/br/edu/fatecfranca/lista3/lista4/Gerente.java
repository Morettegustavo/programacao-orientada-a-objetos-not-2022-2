package br.edu.fatecfranca.lista3.lista4;
public class Gerente extends Funcionario {

    private float bonificacao;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
    }

    public float getBonificacao() {
        return bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonificacao=" + bonificacao + 
                super.toString() + '}';
    }    
}
