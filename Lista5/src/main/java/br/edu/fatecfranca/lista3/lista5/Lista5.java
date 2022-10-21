package br.edu.fatecfranca.lista3.lista5;
public class Lista5 {
    public static void main(String[] args) {
        
        IMamifero objMamifero = new Ornitorrinco();
        objMamifero.darMama();
        
        IAve objAve = new Ornitorrinco();
        objAve.botarOvo();
        objAve.voar();
        
        Ornitorrinco objOrnitorrinco = new Ornitorrinco();
        objOrnitorrinco.botarOvo();
        objOrnitorrinco.darMama();
        objOrnitorrinco.voar();
        
    }
}
