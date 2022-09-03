package br.edu.fatecfranca.lista2;

import br.edu.fatecfranca.lista2.exe0.Produto;
import br.edu.fatecfranca.lista2.exe0.Rio;
import java.util.HashSet;
import java.util.Set;


public class Lista2 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto();
        obj1.setNome("Ovo");
        obj1.setQtde(-10);
        obj1.setPreco(-52);
        System.out.println("Nome " + obj1.getNome());
        
        Produto obj2 = new Produto();
        obj2.setNome("Pão");
        obj2.setQtde(10); 
        obj2.setPreco(52);
        System.out.println("Preço " + obj1.getPreco());
        
        Produto obj3 = new Produto("Lanche", 50, 25);
        obj3.setNome("casa");
        
        Rio obj4 = new Rio();
        obj4.setNome("Coxinha");
        obj4.setNivel(5.004f);
        obj4.setPoluido(true);
        
        Rio obj5 = new Rio("Paraná", 1.34f, true);
        
        
    }
}
