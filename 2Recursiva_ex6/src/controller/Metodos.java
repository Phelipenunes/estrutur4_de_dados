package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int[] inverterVetor(int vetor[], int tamanhoI, int tamanhoF){
		if(tamanhoI >= tamanhoF){
			return vetor;
		} else {
            int aux = vetor[tamanhoI];
            vetor[tamanhoI] = vetor[tamanhoF];
            vetor[tamanhoF] = aux;

            return inverterVetor(vetor, tamanhoI + 1, tamanhoF - 1);
        }
	}
}