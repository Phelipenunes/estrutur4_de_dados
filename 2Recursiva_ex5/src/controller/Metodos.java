package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int calcularMDC(int valor1, int valor2){
		if (valor2 == 0) {
            return valor1;
        }
		if(valor1 == 0){
            return valor2;
        }
		return calcularMDC(valor2, valor1 % valor2);
	}
}
/*
com este método de calcular o MDC é mais rápido e facil pois ele pega o resto da primeira divisão e substitui pelo segundo numero
e o primeior numero é substituido pelo segundo e assim vai até que o resto da divisão de 0 quando o resto for 0 pega o ultimo divisor 
segue exemplo abaixo

48, 18 | 2
18, 12 | 1
12, 6 | 2
0 = então pegar o ultimo divisor que é 6 e ele será o MDC
*/
