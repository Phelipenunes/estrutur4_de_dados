package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int contarNumeros(int numero1, int numero2){
		if(numero1 == 0){// se o numero1 for igual 0 para a função.
			return 0;
		}
		int resto = numero1 % 10;// pegar o ultimo digito do numero
		numero1 = numero1 / 10;// retirar o ultimo digito do numero
		if(resto == numero2){// se o numero1 for igual o numero2 adcionar 1 ao contador.
			return 1 + contarNumeros(numero1, numero2);
		}
		return contarNumeros(numero1,numero2);// se o numero nao for igual nao adiciona 1 ao contador.
	}
}