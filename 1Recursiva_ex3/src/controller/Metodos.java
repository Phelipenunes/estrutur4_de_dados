package controller;

public class Metodos {
	// Construtor do Metodo.
	public Metodos(){
		super();
	}
	
	//Função recursiva para calcular o fatorial de um numero até 12.
	public int fatorial(int valor){
		if(valor == 0){// caso o valor insrido seje 0 ele retornara 1.
			return 1;
		}else{// Se o valor for maior que 1 ele irá guardar o primeiro valor e subritrai 1 do valor, quando o valor zerar ele voltará multiplicando os valores acumulados.
			return valor * fatorial(valor - 1);
		}
	}
}