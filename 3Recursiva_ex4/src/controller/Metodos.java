package controller;

public class Metodos {
	public Metodos(){
		super();
	}
    public String binario(int numero) {
        if (numero == 0) {
            return "0";// quando o numero for 0 ele retorna 0 pq 0 em bin é 0.
        }
        //O número é dividido por 2 a cada chamada
        // recursiva, e o resto da divisão (0 ou 1) é concatenado ao resultado.
        // Neste caso o resultado deve ser transformado em String pois se o resultado somar vai dar ruim.
        return binario(numero / 2) + (numero % 2);
    }
}