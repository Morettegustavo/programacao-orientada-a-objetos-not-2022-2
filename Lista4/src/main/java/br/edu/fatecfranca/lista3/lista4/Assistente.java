package br.edu.fatecfranca.lista3.lista4;

public class Assistente extends Funcionario{
    private float horaExtras;
    private String quemAssiste;

    public Assistente() {
        super();
    }

    public Assistente(float horaExtras, String quemAssiste, String nome, String cpf, int codigo, float salario, float cargaHoraria) {
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.horaExtras = horaExtras;
        this.quemAssiste = quemAssiste;
    }

    public float getHoraExtras() {
        return horaExtras;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setHoraExtras(float horaExtras) {
        this.horaExtras = horaExtras;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }
    
    @Override
    public String toString() {
        return "Assistente{" + "horaExtras=" + horaExtras + "\n" +
                ", quemAssiste=" + quemAssiste + "\n" +
                super.toString() + '}';
    }

    
    

    
    
    
    
    
}
