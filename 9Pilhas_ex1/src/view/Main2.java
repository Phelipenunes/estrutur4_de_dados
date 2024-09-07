package view;
import model.Pilha;
public class Main2 {
	public static void main(String[] args) throws Exception{
		Pilha p = new Pilha();
		for(int i = 100; i < 155; i++){
			if(p.isEmpty()){
				p.push((i + 100));
			}else {
				if(p.size() <= 4){
					p.push(i + 50);
				}else{
					System.out.println("o topo da pilha na posição "+i+" é : "+p.pop());
				}
			}
			System.out.println("O topo da pilha é de : "+p.top());
		}
		System.out.println("O tamnho da Pilha é de: "+p.size());
	}
}
/*
b)
Para (i = 100 ; i < 115 ; i++) {s
Se (isEmpty()) {
Push(i + 100);
} Senão {
Se (Size() <= 4) {
Push(i + 50);
} Senão {
Imprimir(Pop());
}
}
Imprimir(Top());
}
Imprimir(Size());
*/