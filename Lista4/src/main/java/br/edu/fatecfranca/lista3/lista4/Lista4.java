package br.edu.fatecfranca.lista3.lista4;

public class Lista4 {

    public static void converteString(Funcionario objFuncionario){
        // objFuncionario = objGerente
        // OU
        // objFuncionario - objASssistente
        // OU 
        
        System.out.println(objFuncionario.toString());
    }
    
    public static void main(String[] args) {
        Gerente objGerente = new Gerente(2000, "Fulano", "123", 1, 4000, 40);
        converteString(objGerente);
        
        Assistente objAssistente = new Assistente(10, "Fulano", "Beltrano", "345", 2, 2000, 40);
        converteString(objAssistente);
        
        Diretor objDiretor = new Diretor(10, "Ciclano", "789", 3, 5000, 40);
        converteString(objDiretor);
    }
}
