/*
•Crie uma classe em Java chamada Aluno contendo as variáveis de instância numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float), 

•Crie os construtores 

•Crie os métodos notaFinal() - que calcula e retorna a média final do aluno - , e dadosAluno() - que retorna os valores de numeroAluno, nome e idade. 
\
•Criar uma classe TestaAluno com o método main() para instanciação da classe Aluno (atribuição das variáveis de instância com quaisquer valores e chamada dos métodos notaFinal() e dadosAluno()).  

•Adicionar o método passou() à classe Aluno a fim de verificar se o aluno passou. Chame o método passou() na classe TestaAluno a fim de testa-lo.
*/


package br.edu.fatecfranca.lista1.exe1;
public class Aluno {
    public int nroAluno; // tipo primitivo
    public String nome; // tipo de Classe
    public double p1, p2; // tipo primitivo
    
    // construtor sem parâmetro
    public Aluno() {
        
    }
    
    // construtor com parâmetro
    public Aluno(int nroAluno, String nome, double p1, double p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // calcula e retorna média final
    public double notaFinal() {
        return (this.p1 + this.p2)/ 2;
    }
    
    // retorna os dados do aluno
    public String dadosAluno() {
        return "nome: " + this.nome + " Nro aluno " + this.nroAluno + " Média " + this.notaFinal();
    }
    
    // verifica se o alunos passou
    public void passou() {
        if (this.notaFinal() >= 6){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
