package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int numero = 10;
        System.out.println(m.fibo(numero));
    }
}
