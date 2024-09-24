package view;

import br.edu.fateczl.fila.Fila;

public class Principal {
	public static void main(String[] args) throws Exception{
		Fila<Integer> f = new Fila<>();
		int valor = 0;
		int[] vetor = {26, 48, 77, 19, 92, 51, 64, 63, 75, 53, 70, 87, 36, 64, 69, 22, 47, 9, 28};
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++){
			if(f.isEmpty() == true) {
				f.insert(vetor[i]);
			}else if(vetor[i] > 50) {
				valor = f.remove();
				valor += vetor[i];
				f.insert(valor);
			}else{
				f.remove();
			}
		}
		System.out.println(f.remove());
	}
}
