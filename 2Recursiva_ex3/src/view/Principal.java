package view;
import controller.Metodos;
public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();
		int vetor[] = {2,3,4,5,6,7,8,9,10};
		int tamanho = vetor.length;
		tamanho --;
		int qtd = 0;
		System.out.print(m.vetorPar(vetor, tamanho, qtd));
	}
}