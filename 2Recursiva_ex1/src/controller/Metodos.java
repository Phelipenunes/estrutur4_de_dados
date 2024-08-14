package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int multiplica(int multiplicador, int numero){
		if (multiplicador == 0 || numero == 0){
			return 0;
		} else {
			return numero + multiplica(numero, multiplicador - 1);
		}
	}
}
