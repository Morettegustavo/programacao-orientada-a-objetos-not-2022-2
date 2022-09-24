package br.edu.fatecfranca.lista3.lista4;

import java.util.ArrayList;

public class Lista4 {

    public static void converteString(Funcionario objFuncionario){
        System.out.println(objFuncionario.toString());
    }
    
    public static void calcSalario(Funcionario objFuncionario){
        System.out.println("Salário final " + objFuncionario.calculaSalario());
    }
    
    public static void main(String[] args) {
        Gerente objGerente = new Gerente(2000, "Fulano", "123", 1, 4000, 40);
        converteString(objGerente);
        calcSalario(objGerente);
        
        Assistente objAssistente = new Assistente(10, "Fulano", "Beltrano", "345", 2, 2000, 40);
        converteString(objAssistente);
        calcSalario(objAssistente);
        
        Diretor objDiretor = new Diretor(10, "Ciclano", "789", 3, 5000, 40);
        converteString(objDiretor);
        calcSalario(objDiretor);
        
        // criando array de Funcionario
        ArrayList<Funcionario> array = new ArrayList();
        array.add(objGerente);
        array.add(objDiretor);
        array.add(objAssistente);
        
        for(int i = 0; i < 3; i++){
            converteString(array.get(i));
        }
        
    }
}
