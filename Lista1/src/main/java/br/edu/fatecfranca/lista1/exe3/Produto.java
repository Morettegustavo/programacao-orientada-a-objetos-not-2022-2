/*
Implemente em Java uma classe chamada Produto contendo as variáveis id (int), descrição (String), qtde (int) e preco (float). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:
•	comprar(int x): que compra um produto aumentando em x a quantidade em estoque;
•	vender(int x): que vende um produto diminuindo em x a quantidade em estoque;
•	subir(float x): que aumenta o preço do produto em x unidades;
•	descer(float x): que diminui o preço do produto em x unidades;
•	mostra(): que mostra todas as informações do produto

Finalmente, cria uma classe TestaProduto, que cria dois Produtos (cada um deve utilizar um construtor diferente) e teste os métodos criados.


*/
package br.edu.fatecfranca.lista1.exe3;
// algo abstrato e serve de modelo para seus objetos
public class Produto {
    public String nome; // tipo de dado é String (uma classe)
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; // tipo de dado é double (tipo primitivo)
    
    public Produto(){
        
    }
    
    // criar um método construtor
    public Produto(String nome, int qtde, double preco) {
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // método que compra um produto, aumentando sua qtde
    // método não retorna nada
    public void comprar(int x) {
        this.qtde = this.qtde + x;
    }
    
    // método vender
    public void vender(int x) {
        if(this.qtde != 0 && this.qtde >= x) {
            this.qtde = this.qtde - x;
        }else{
            System.out.println("Sem estoque");
        }
        
    }
    
    public void mostrar() {
        System.out.println(" Nome: " + this.nome + " Qtde: " + this.qtde + " Preço " + this.preco);
    }
    
    public void subir(double x) {
        this.preco += x;
    }
    
    public void descer(double x) {
        if(this.preco >= x){
            this.preco -= x;
        }
    }
}
