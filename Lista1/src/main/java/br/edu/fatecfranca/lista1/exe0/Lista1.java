/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista1;

/**
 *
 * @author 1090482113014
 */
public class Lista1 {

    public static void main(String[] args) {
        // criar objetos da classe Produto
        // criar instâncias da classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.preco = 100;
        obj1.qtde = 5;
        System.out.println(" Quantidade inicial em estoque: " + obj1.qtde);
        
        obj1.comprar(10);
        System.out.println(" Quantidade estoque depois de comprar 10 unidades: " + obj1.qtde);
        
        obj1.vender(5);
        System.out.println(" Quantidade estoque depois de vender 5 unidades: " + obj1.qtde);
        
        obj1.mostrar();
        System.out.println(" Nome: " + obj1.nome + ", Qtde: " + obj1.qtde + ", Preço " + obj1.preco);
        
        // vamos instanciar explorando o método construtor
        // método que tem o mesmo nome da classe
        // método que inicializa as variáveis da classe
        
        Produto obj2 = new Produto("bola de basquete", 10, 93.90);
        obj2.mostrar();
        System.out.println(" Nome: " + obj2.nome + ", Qtde: " + obj2.qtde + ", Preço " + obj2.preco);
        
        
        
         System.out.println(" Valor inicial: " + obj2.preco);
         obj2.subir(2.1);
         System.out.println(" Subindo 2.1 no valor: " + obj2.preco);
         obj2.descer(3);
         System.out.println(" Descendo o valor 3 no valor: " + obj2.preco);
        
    }
}
