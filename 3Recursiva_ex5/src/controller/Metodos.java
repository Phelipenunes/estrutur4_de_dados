package controller;

public class Metodos {
	public Metodos(){
		super();
	}
    public int fibo(int numero) {
        // Condição de parada: Se numero for 1 ou 2, retornamos 1, pois as duas primeiras posições da série de Fibonacci são ambas 1
        if (numero == 1 || numero == 2) {
            return 1;
        }

        // Relação de chamada dos passos: O valor na posição n é a soma dos valores
        // nas duas posições anteriores, ou seja, fibonacci(n-1) + fibonacci(n-2)
        return fibo(numero - 1) + fibo(numero - 2);
    }
}