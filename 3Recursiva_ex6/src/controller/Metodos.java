package controller;

public class Metodos {
	public Metodos(){
		super();
	}
    public double soma(int numero) {
        if (numero == 1) {
            return 1.0;//  se o numero for 1 retorna 1 pois 1/1 é 1.
        }
        return (1.0 / fatorial(numero)) + soma(numero - 1);// chamada da soma diminuindo n ate chegar a 1 + a chamada da fatorial para calcular o fatorila de n.
    }
    public static int fatorial(int n) {
        // Quando n é 0 ou 1, o fatorial é 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // O fatorial de n é n * fatorial de (n-1)
        return n * fatorial(n - 1);
    }
}