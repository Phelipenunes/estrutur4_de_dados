package controller;

public class Metodos {
	public Metodos(){
		super();
	}
    public int somaDigitos(int numero) {
        if (numero  == 0) {
            return 0; // se o número for = 0 retorna 0.
        } else {
            return (numero % 10) + somaDigitos(numero / 10);// O próximo termo é obtido dividindo o número por 10, eliminando o último dígito
        }
    }
}