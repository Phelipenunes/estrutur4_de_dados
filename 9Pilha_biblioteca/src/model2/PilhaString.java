package model2;

public class PilhaString {
    NoString topo;
    
    public PilhaString(){
        topo = null;
    }
    
    public boolean isEmpty() {
        return topo == null;
    }
    
    public void push(String valor) {
        NoString elemento = new NoString();
        elemento.dado = valor;
        elemento.proximo = topo;
        topo = elemento; 
    }
    
    public String pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Não há elementos para desempilhar");
        }
        String valor = topo.dado;
        topo = topo.proximo;
        return valor;    
    }
    
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        
        int tamanho = 0;
        NoString atual = topo;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }
    
    public String top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Pilha vazia");
        }
        return topo.dado;
    }
}
