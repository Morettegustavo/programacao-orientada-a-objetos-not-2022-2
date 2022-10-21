package br.edu.fatecfranca.lista3.provaprimeirobimestre;
public class Liquidificador {
    private boolean ligado;
    private int vel;

    public Liquidificador() {
    }

    public Liquidificador(boolean ligado, int vel) {
        this.ligado = ligado;
        if (vel == 4 || vel == 8 || vel == 16 || vel == 32) {
            this.vel = vel;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVel() {
        return vel;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
    
    public void mudarVelocidade(int x){
        if (x == 0 || x == 1 || x == 2 || x == 3) {
            this.vel = x;
        }
    }
    
}
