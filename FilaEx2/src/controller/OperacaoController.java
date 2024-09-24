package controller;
import br.edu.fateczl.fila.*;
import model.Cliente;

public class OperacaoController {


	public void caixa(Fila<Cliente> F) throws Exception {
	    for (Cliente clt : F) {
	       
	        System.out.println("Nome:" + clt.getNome());
	        
	    }
	}
}
