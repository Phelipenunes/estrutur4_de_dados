package view;

import br.edu.fateczl.fila.Fila;

public class Principal {
	public static void main(String[] args) {
		Fila<Integer> f = new Fila<>();
		int[] vetor = {100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92};
		int tamanhoVetor = vetor.length;
		
		for (int i = 0; i < tamanhoVetor; i++) {
			try {
				if (f.isEmpty()) {
					f.insert(vetor[i] - 10);
				} else if (vetor[i] % 5 == 0) { // Corrigido: mod para %
					f.insert(vetor[i] / 5);
				} else if (vetor[i] % 3 == 0) { // Corrigido: mod para %
					f.insert(vetor[i] * 3);
				} else {
					int v1 = f.remove(); // Pode lançar exceção
					System.out.println(v1 * vetor[i]);
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}
	}
}

/*
Fila f = new Fila();
int[] vetor = {100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92};
int tamanhoVetor = vetor.length;
Para (i = 0 ; i < tamanhoVetor ; i++) {
Se (filaVazia() == verdadeiro) {
f.insert(vetor[i] - 10);
} Senao Se (vetor[i] mod 5 == 0) {
f.insert(vetor[i] / 5);
} Senao Se (vetor[i] mod 3 == 0) {
f.insert(vetor[i] * 3);
} Senao {
int v1 = f.remove();
escreva (v1 * vetor[i]);
}
}
*/