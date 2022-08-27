/*
•	Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), numeroAgencia (int), nome (String) e saldo (float), 

•	Crie os construtores 

•	Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente. 

•	Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual. 

•	Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado  

•	Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano. 

*/

package br.edu.fatecfranca.lista1.exe2;
public class Cliente {
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    // construtor sem parâmetro
    public Cliente() {
        
    }
    
    // construtor com parâmetro
    public Cliente(int nroConta, int nroAgencia, String nome, double saldo){
        this.nroConta = nroConta;
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void RealizarDeposito(double x) {
        this.saldo += x;
    }
    
    public void RealizarSaque(double x) {
        if(this.saldo >= x){
            this.saldo -= x;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public String paraString() {
        return "Nro Agência " + this.nroAgencia + " Nro Conta " + this.nroConta + " Nome " + this.nome + " Saldo: " + this.saldo;
    }
}
