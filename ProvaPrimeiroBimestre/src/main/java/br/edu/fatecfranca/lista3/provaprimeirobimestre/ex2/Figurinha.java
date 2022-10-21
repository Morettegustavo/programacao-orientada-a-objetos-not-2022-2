package br.edu.fatecfranca.lista3.provaprimeirobimestre.ex2;
public class Figurinha {
    private int id;
    private String nome;
    private boolean especial;

    public Figurinha() {
    }

    public Figurinha(int id, String nome, boolean especial) {
        this.id = id;
        this.nome = nome;
        this.especial = especial;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
}
