package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int numero = 123456;
        System.out.println("Somatoria: " + m.soma(numero));
    }
}
