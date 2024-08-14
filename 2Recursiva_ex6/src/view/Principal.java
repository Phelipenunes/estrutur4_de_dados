package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tamanhoF = vetor.length - 1; 
        int tamanhoI = 0;

        m.inverterVetor(vetor, tamanhoI, tamanhoF);

        System.out.print("Vetor invertido: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
