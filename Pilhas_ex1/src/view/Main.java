package view;
import model.Pilha;
public class Main {
	public static void main(String[] args){
		Pilha p  = new Pilha();
		int vet[] = {19,44,-1,8,-10,75,-15,0};
		for(int valor : vet) {
			p.push(valor);
		}
	}
}
