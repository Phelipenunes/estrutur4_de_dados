package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();
		int multiplicador = 0;
		int numero = 5;
		System.out.print(m.multiplica(multiplicador, numero));
	}
}