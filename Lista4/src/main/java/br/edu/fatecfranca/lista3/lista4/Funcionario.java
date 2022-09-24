package br.edu.fatecfranca.lista3.lista4;
public class Funcionario {
    protected String nome, cpf;
    protected int codigo;
    protected float salario, cargaHoraria;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getSalario() {
        return salario;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + 
                ", codigo=" + codigo + ", salario=" + salario + 
                ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
      
}
