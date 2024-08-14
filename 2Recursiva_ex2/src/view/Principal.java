package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();
		int divisor = 8;
		int dividendo = 10;
		System.out.print(m.divisao(divisor, dividendo));
	}
}