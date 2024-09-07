package view;
import model.Metodos;
public class Main {
	public static void main(String[] args) throws Exception{
		Metodos m = new Metodos();
		m.carregaPilha();
		m.exibePilha();
	}
}
