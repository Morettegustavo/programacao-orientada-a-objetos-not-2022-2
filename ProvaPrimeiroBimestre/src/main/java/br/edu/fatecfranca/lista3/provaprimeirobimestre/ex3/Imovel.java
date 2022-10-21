package br.edu.fatecfranca.lista3.provaprimeirobimestre.ex3;
public class Imovel {
    private String endereco;

    public Imovel() {
    }
    
    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }
    
}
