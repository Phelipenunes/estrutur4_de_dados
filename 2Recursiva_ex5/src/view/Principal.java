package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();
		int valor1 = 48;
		int valor2 = 18;
		System.out.print(m.calcularMDC(valor1, valor2));
	}
}
