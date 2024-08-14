package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public double divisao(int divisor, int dividendo){
		if (divisor < dividendo){
			return dividendo % divisor;
		} else {
			return dividendo - divisao(divisor, dividendo - divisor);
		}
	}
}
