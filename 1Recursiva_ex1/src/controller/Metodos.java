package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int soma(int valor){
		if(valor <= 0){
			return 0;// se o valor for menor que 0 retornar 0.
		}else{
			return valor + soma(valor - 1);// soma o valor atual com o valor anterior a ele ate chegar ao 0
		}
	}
}