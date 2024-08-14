package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();// instanciando metodos
		int valor = 10;
        int resultado = m.soma(valor);//chamada da função recursiva.
        System.out.print(resultado);	
	}
}