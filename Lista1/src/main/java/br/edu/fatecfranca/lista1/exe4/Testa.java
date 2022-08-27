
package br.edu.fatecfranca.lista1.exe4;
public class Testa {
    public static void main(String[] args) {
       Rio obj1 = new Rio("Amazonas", 1.86, false);
       System.out.println(obj1.mostrar());
       obj1.chover(0.54);
       obj1.ensolarar(0.3);
       obj1.limpar();
       System.out.println(obj1.mostrar());
       
       
       Rio obj2 = new Rio("Tietê", 0.87, true);
       System.out.println(obj2.mostrar());
       obj2.chover(0.8);
       obj2.ensolarar(0.4);
       obj2.limpar();
       System.out.println(obj2.mostrar());
    }
    
}
