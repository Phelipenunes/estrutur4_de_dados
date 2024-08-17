package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public String inverter(String texto) {
        if (texto.length() <= 1) {// se o tamnho do texto for 1 não precisa fazer mais nada só retornar ele mesmo.
            return texto;
        }
        // Pega o último caractere e guarda ele e vai tirando até que a palavra teste seja zerada ,assim que ela for zerada ela retorna as letras.
        return texto.substring(texto.length() - 1) + inverter(texto.substring(0, texto.length() - 1));
    }
}
