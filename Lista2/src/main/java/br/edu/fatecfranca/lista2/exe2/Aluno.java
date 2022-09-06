//  a)	Crie uma classe em Java chamada Aluno contendo as variáveis de instância private numeroAluno (int),
//  nome (String), idade (int), p1 (float) e p2 (float), e os métodos getters e setters para todas as variáveis privadas.
//  Para a criação dos métodos setters, assuma que: o número do aluno deve ter tamanho exatamente igual a 6. O nome do aluno não pode ultrapassar tamanho 30.
//  A idade, e as notas p1 e p2 não podem ser negativas.

// b)  Crie os métodos public notaFinal() - que calcula e imprime a média final do aluno - , e dadosAluno() - 
// que imprime as variáveis de instância numeroAluno, nome e idade. Crie um construtor para inicialização das variáveis quando um objeto da classe for criado. 
// Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido 

// c)	Criar uma classe Teste para instanciação da classe Aluno e chamada dos métodos notaFinal() e dadosAluno()).  

// d)	Tente acessar as variáveis de instância da classe Aluno sem os métodos get e set. O que acontece?


package br.edu.fatecfranca.lista2.exe2;
public final class Aluno {
    private String numeroAluno, nome;
    private int idade;
    private float p1, p2, notaFinal; 
    
    
    // Crie um construtor para inicialização das variáveis quando um objeto da classe for criado
    // construtor sem parâmetro
    public Aluno(){
        
    }
    
    // construtor com parâmetro
    public Aluno(String nome, String numeroAluno, int idade, float p1, float p2){
        this.setNome(nome);
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    // Métodos sets
    
    // O nome do aluno não pode ultrapassar tamanho 30
    public void setNome(String nome) {
       if(nome.length() <= 30) {
           this.nome = nome;
       }else System.out.println("O nome deve ser igual ou menor que 30");
    }

    // número do aluno deve ter tamanho exatamente igual a 6
    public void setNumeroAluno(String numeroAluno) {
        if (numeroAluno.length() == 6){
            this.numeroAluno = numeroAluno;
        }else System.out.println("Número deve conter 6 dígitos");
    }

    // A idade, e as notas p1 e p2 não podem ser negativas.
    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }else System.out.println("A idade não pode ser negativa");
    }

    public void setP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        }else System.out.println("A nota não pode ser negativa");
    }

    public void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        }else System.out.println("A nota não pode ser negativa");
    }
    
    // Métodos gets
    public String getNome(String nome) {
        return this.nome;
    }

    public String getNumeroAluno(String numeroAluno) {
        return this.numeroAluno;
    }

    public int getIdade(int idade) {
        return this.idade;
    }

    public float getP1(float p1) {
        return this.p1;
    }

    public float getP2(float p2) {
        return this.p2;
    }
    
    //  Crie os métodos public notaFinal() - que calcula e imprime a média final do aluno
    public void notaFinal(float p1, float p2){
        if(p1 < 0 || p2 < 0){
            System.out.println("Notas negativas! envie notas positivas");
        }else{
            this.notaFinal = (p1 + p2);
            System.out.println("A nota final do aluno é: " + this.notaFinal);
        }
    }
    
    // dadosAluno() - que imprime as variáveis de instância numeroAluno, nome e idade
    public void dadosAluno(){
        System.out.println("Número do aluno: " + this.numeroAluno + ", nome do aluno " + this.nome + ", idade do aluno: " + this.idade);
    }
    
    
    
    
    
}
