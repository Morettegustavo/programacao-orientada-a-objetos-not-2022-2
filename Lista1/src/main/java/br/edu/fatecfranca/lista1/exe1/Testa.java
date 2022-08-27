/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.lista1.exe1;

/**
 *
 * @author 1090482113014
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.nome = "Pedro";
        obj1.nroAluno = 123;
        obj1.p1 = 7.4;
        obj1.p2 = 6.9;
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
        Aluno obj2 = new Aluno(456, "Gustavo", 8.9, 9.1);
        System.out.println(obj2.dadosAluno());
        obj2.passou();
    }
    
}
