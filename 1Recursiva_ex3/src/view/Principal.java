package view;
import controller.Metodos;//Importando os Metodos do pacote controller.

public class Principal {
	public static void main(String[] args) {
		Metodos m = new Metodos();// Instanciando os Metodos.
		int valor = 10;// Valor que o usuario insere.
		int resultado = m.fatorial(valor);// Chama da função recursiva.
		System.out.print(resultado);// Saída de dados.
	}
}