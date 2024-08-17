package view;

import controller.Metodos;

public class Principal {
    public static void main(String[] args) {
    	Metodos m = new Metodos();
        String texto = "teste";
        String textoInvertido = m.inverter(texto);
        System.out.println(textoInvertido);
    }
}
