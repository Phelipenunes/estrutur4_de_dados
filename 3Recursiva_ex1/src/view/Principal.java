package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int numero = 123456;
        int quantidadeDigitos = m.contarDigitos(numero);
        System.out.println("Quantidade de dígitos: " + quantidadeDigitos);
    }
}
