package model;
public class Metodos {
	public Metodos(){
		super();
	}
	
	Pilha p1 = new Pilha();
	Pilha p2 = new Pilha();
	Pilha p3 = new Pilha();
	Pilha a1 = new Pilha();
	Pilha a2 = new Pilha();
	
	public void carregaPilha(){
		p1.push(10);
		p1.push(25);
		p1.push(30);
		p1.push(40);
		
		p2.push(15);
		p2.push(28);
		p2.push(60);
		p2.push(34);
		
		p3.push(35);
		p3.push(20);
	}
	
	public void exibePilha() throws Exception{
		transferirElementos(p1,p2,p3,a1,a2);
	}
	
	public static void transferirElementos(Pilha p1, Pilha p2, Pilha p3 ,Pilha a1 ,Pilha a2) throws Exception {
	    while (!p1.isEmpty() && !p2.isEmpty()) {
	        int valor = p1.pop();  // Remove 
	        a1.push(valor);        // Adiciona
	        valor = p2.pop();
	        a1.push(valor);
	    }
	    while(!p3.isEmpty()){
	    	int valor = p3.pop();
	    	a1.push(valor);
	    }
	    while(!a1.isEmpty()){
	    	int valor = a1.pop();
	    	a2.push(valor);
	    }
	    for(int i = 0; i < 4;i++){
	    	System.out.println("O elemento "+(i+1)+" da pilha a2 é: "+a2.pop());
	    }
	}
	
}
