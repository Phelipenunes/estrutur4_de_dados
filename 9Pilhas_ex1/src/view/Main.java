package view;
import model.Pilha;
public class Main {
	public static void main(String[] args) throws Exception{
		Pilha p = new Pilha();
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0){
				p.push((i * i));
			}else {
				if(i <= 5){
					p.push(i);
				}else{
				System.out.println("o topo da pilha na posição "+i+" é : "+p.pop());
				}
			}
			System.out.println("O tamnho da Pilha é de: "+p.size());
		}
	}
}
/*
a)
Para (i = 0 ; i < 10 ; i++) {
Se (i % 2 == 0) {
Push(i * i);
} Senão {
Se (i <= 5) {
Push(i);
} Senão {
Imprimir(Pop());
}
}
Imprimir(Top());
}
Imprimir(Size());
*/