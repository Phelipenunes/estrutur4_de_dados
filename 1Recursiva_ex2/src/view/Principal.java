package view;
import controller.Metodos; // importando Metodos.

public class Principal {
	public static void main(String[] args){
		Metodos m = new Metodos();// instanciando metodos
		int[] vetor = {34, 15, 88, 2, 55, 27, 11};
        int tamanho = vetor.length;
        int menorvalor = vetor[tamanho - 1];// deve se fazer isso para o tamanho do vetor não estoura.
        int resultado = m.menorValor(vetor, tamanho, menorvalor);//chamada da função recursiva.
        System.out.print(resultado);	
	}
}