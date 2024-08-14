package controller;

public class Metodos {
	public Metodos() {
		super();
	}
	public int menorValor(int vetor[], int tamanho, int menorvalor){
		if (tamanho == 1){
			return vetor[0] < menorvalor ? vetor[0] : menorvalor;// condição para verificar se o valor na primeira posição do vetor é maior que o menor valor.
		}
		if (vetor[tamanho - 1] < menorvalor) {
            menorvalor = vetor[tamanho - 1];// condição para verificar se o menor valor é menor que o valor anterior.
        }
		return menorValor(vetor, tamanho - 1, menorvalor);// chamada da recursiva para fazer a comparação com o valor anterior.
	}
}