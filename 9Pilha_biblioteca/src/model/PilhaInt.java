package model;

public class PilhaInt {
	NoInt topo;
	
	public PilhaInt(){
		topo = null;
	}
	public boolean isEmpty() {
		if(topo == null){
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
	    NoInt elemento = new NoInt();
	    elemento.dado = valor;
	    elemento.proximo = topo; // O novo nó aponta para o antigo topo
	    topo = elemento; // Agora o novo nó se torna o topo
	}
	
	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("Não há elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;	
	}
	
	public int size() throws Exception{
		if(isEmpty()){
			return 0;
		}
		
		int tamanho = 0;
	    NoInt atual = topo;

	    while (atual != null) {
	        tamanho++;
	        atual = atual.proximo; // Avança para o próximo nó
	    }

	    return tamanho; // Retorna o tamanho da pilha	
	}
	
	public int top() throws Exception {
	    if (isEmpty()) {
	        throw new Exception("Pilha vazia");
	    }
	    return topo.dado; // Retorna o valor do topo, sem remover
	}
}	