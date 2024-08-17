package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
       int numero1 = 101010;
       int numero2 = 0;
       System.out.print(m.contarNumeros(numero1, numero2));
    }
}
