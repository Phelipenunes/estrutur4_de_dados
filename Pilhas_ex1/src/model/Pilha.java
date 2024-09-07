package model;

public class Pilha {
	
	No topo; 
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty(){
		if(topo == null){
			return true;
		}
		return false;
	}
	
	public void push(int valor){
		No elemento = new No();
		elemento.dado = valor;
		if((isEmpty())){
			topo = elemento;
		}else {
			topo = elemento;
		}
	}
	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("Não há elementos para desempilhar");
		}
		
		No atual = topo;
		int menorValor = topo.dado;
		
		while (atual != null) {
	        if (atual.dado < menorValor) {
	            menorValor = atual.dado;
	        }
	        atual = atual.proximo;
	    }
		return menorValor;
				
	}
}
