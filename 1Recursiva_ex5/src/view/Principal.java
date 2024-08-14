package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();
		double divisor = 9;
		double resultado = m.somafracao(divisor + 1);
		System.out.println(resultado);
	}
}
