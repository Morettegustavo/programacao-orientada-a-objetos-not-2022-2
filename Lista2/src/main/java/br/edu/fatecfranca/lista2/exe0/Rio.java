/*
Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	chover(float): que aumenta o nível atual do rio;
•	ensolarar(float): que diminui o nível atual do rio;
•	limpar(): que limpa o rio;
•	sujar(): que polui o rio;
•	mostra(): que mostra todas as informações do rio.

Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.
*/

package br.edu.fatecfranca.lista2.exe0;
public final class Rio {
    private String nome;
    private double nivel;
    private boolean poluido; // true - está poluído, salse - não está poluido
    
    // construtor sem parâmetro
    public Rio(){
        
    }
    
    // construtor com parâmetro
    public Rio(String nome, double nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNivel(double nivel){
        if(nivel >=0)
            this.nivel = nivel;
        else System.out.println("Nível negativo");
    }
    
    public void setPoluido(boolean poluido){
        this.poluido = poluido;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getNivel(){
        return this.nivel;
    }
    
    public boolean isPoluido(){
        return this.poluido;
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Nível do rio foi aumentado");
    }
    
    public void ensolarar(double x){
        this.setNivel(this.nivel -x);
    }
    
    public void limpar(){
        if(!this.poluido){
            this.poluido = true;
        }else{
            System.out.println("Rio já limpo");
        }
    }
    
    public void sujar() {
        if(this.poluido){
            this.poluido = false;
        }else{
            System.out.println("Rio já poluido");
        }
    }  
    
    public String mostrar(){
        String aux = (this.poluido? "Está poluido" : "Está limpo");
        return "Nome do rio: " + this.nome + ", nível do rio: " + this.nivel + ", o rio está poluido? " + aux;
    }
}
