// a)Crie uma classe em Java chamada Cliente contendo as variáveis de instância private numeroConta (String), numeroAgencia (String), nome (String) e saldo (float), e os métodos getters e setters para todas as variáveis privadas. Para a criação dos métodos setters, o número da conta deve obrigatoriamente ter tamanho 8, contando o traço do dígito verificador. O número da agência deve ter tamanho 6, também contando o traço do dígito verificador. Verificar em ambos os casos a presença do dígito verificador. O nome do cliente não pode ultrapassar 30 caracteres. O saldo da conta não pode ficar negativo;

package br.edu.fatecfranca.lista2.exe1;
public final class Cliente {
    private String numeroConta, numeroAgencia, nome;
    private float saldo;
    
    public Cliente(){
        
    }
    
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8){
            if(numeroConta.charAt(6)== '-'){
                this.numeroConta = numeroConta;
            }
            else System.out.println("Dígito verificar errado");
        } else System.out.println("Tamanho inválido!");
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6){
            if(numeroAgencia.charAt(4)== '-'){
                this.numeroAgencia = numeroAgencia;
            } else System.out.println("Dígito verificar errado");
        } else System.out.println("Tamanho inválido!");
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        } else System.out.println("Tamanho inválido");
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }else System.out.println("Saldo negativo");
    }
    
    public void depositar(float x){
        this.saldo += x;
    }
    
    public void sacar(float x){
        this.setSaldo(this.saldo -x);
    }
    
    public String getNumeroConta(String numeroConta) {
        return this.numeroConta;
    }

    public String getNumeroAgencia(String numeroAgencia) {
        return this.numeroAgencia;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public double getSaldo(double saldo) {
        return this.saldo;
    }
}
