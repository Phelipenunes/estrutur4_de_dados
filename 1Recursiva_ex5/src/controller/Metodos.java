package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public double somafracao(double divisor){
		if( divisor == 1){
			return  1.0;// caso o divisor seja 1, retornar 1, pois 1/1 é 1.
		}else{
			return 1/divisor + somafracao(divisor - 1);// a função mantem o dividendo em 1 e subtrai 1 do divirsor somando com a fração anterior,
		}
	}
}