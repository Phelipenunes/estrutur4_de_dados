package controller;

public class Metodos {
	public Metodos(){
		super();
	}
    public int contarDigitos(int numero) {
        if (numero < 10) {
            return 1; // se o número for menor que 10, ele tem apenas um dígito
        } else {
            return 1 + contarDigitos(numero / 10);// O próximo termo é obtido dividindo o número por 10, eliminando o último dígito
        }
    }
}