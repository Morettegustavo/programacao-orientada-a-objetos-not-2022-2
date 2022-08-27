package br.edu.fatecfranca.lista1.exe2;
public class Testa {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.nome = "Pedro";
        obj1.nroAgencia = 111;
        obj1.nroConta = 222;
        obj1.saldo = 0;
        
        System.out.println(obj1.paraString());
        obj1.RealizarDeposito(2000);
        obj1.RealizarSaque(300);
        System.out.println(obj1.paraString());
        
        Cliente obj2 = new Cliente(444, 333, "Ana", 0);
        System.out.println(obj2.paraString());
        obj2.RealizarDeposito(800);
        obj2.RealizarSaque(1300);
        System.out.println(obj2.paraString());
        
    }
    
}
