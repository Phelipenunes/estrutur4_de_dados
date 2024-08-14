package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int numerosNegativos(int tamanho, int vet[]){
		if (tamanho == 0){
			return (vet[0] < 0) ? 1 : 0;// condição para verificar se o valor na primeira posição do vetor é negativo.
		}
		if (vet[tamanho] < 0) {
            return 1 + numerosNegativos(tamanho - 1, vet);// chamada da função para verificar o proximo numero do vetor.
        }
		return 0 + numerosNegativos(tamanho -1, vet);// chamada da função para verificar o proximo numero do vetor.
	}
}