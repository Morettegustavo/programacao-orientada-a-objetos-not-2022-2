package br.edu.fatecfranca.lista3.provaprimeirobimestre.ex2;

import java.util.Date;

public class Compra {
    private int id;
    private Date data;

    public Compra() {
    }

    public Compra(int id, Date data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
