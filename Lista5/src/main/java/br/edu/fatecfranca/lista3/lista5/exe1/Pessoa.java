package br.edu.fatecfranca.lista3.lista5.exe1;
public class Pessoa extends Animal implements ICidadao, IContribuinte, IProfessor {

    @Override
    public void vota() {
        System.out.println("Pessoa votando");
    }

    @Override
    public void tiraRg() {
        System.out.println("Pessoa tirando rg");
    }

    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagando imposto de renda");
    }

    @Override
    public void tiraCpf() {
        System.out.println("Pessoa tirando CPF");
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinando");
    }

    @Override
    public void trabalho() {
        System.out.println("Pessoa trabalhando");
    }
    
}
