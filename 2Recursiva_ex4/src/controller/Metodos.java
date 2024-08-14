package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int fatDuplo(int numero){
		if(numero == 1){
			return 1;
		}else{
			return numero * fatDuplo(numero - 2);
		}
	}
}