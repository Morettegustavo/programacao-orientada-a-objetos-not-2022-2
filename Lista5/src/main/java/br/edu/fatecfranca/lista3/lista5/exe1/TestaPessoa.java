package br.edu.fatecfranca.lista3.lista5.exe1;
public class TestaPessoa {
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        objPessoa.come();
        objPessoa.ensina();
        objPessoa.pagaIr();
        objPessoa.respira();
        objPessoa.tiraCpf();
        objPessoa.tiraRg();
        objPessoa.trabalho();
        objPessoa.vota();
        
        IContribuinte objContribuinte = new Pessoa();
        objContribuinte.pagaIr();
        objContribuinte.tiraCpf();
        
    }
    
}
