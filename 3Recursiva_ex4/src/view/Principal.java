package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int numero = 1634;
        System.out.print(m.binario(numero));
    }
}
