/*
Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	chover(float): que aumenta o nível atual do rio;
•	ensolarar(float): que diminui o nível atual do rio;
•	limpar(): que limpa o rio;
•	sujar(): que polui o rio;
•	mostra(): que mostra todas as informações do rio.

Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.
*/

package br.edu.fatecfranca.lista1.exe4;
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido; // true - está poluído, salse - não está poluido
    
    // construtor sem parâmetro
    public Rio(){
        
    }
    
    // construtor com parâmetro
    public Rio(String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(double x){
        this.nivel += x;
        System.out.println("Nível do rio foi aumentado");
    }
    
    public void ensolarar(double x){
        if(this.nivel >= x){
            this.nivel -= x;
            System.out.println("Nível do rio foi diminuido");
        } else {
            System.out.println("Nível não pode ser negativo");
        }
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
