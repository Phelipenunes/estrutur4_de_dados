package view;

import br.edu.fateczl.fila.*;
import model.*;

import controller.*;


public class Principal {

	public static void main(String[] args) throws Exception {
		int qtdPecasAleatorio;
		int vlrPecasAleatorio;
		
		int numCliente;
		Fila<Cliente> F = new Fila<Cliente>();	
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Cliente 1");
		cliente1.setQtdPecas(10);
		cliente1.setvlrPecas(5);
		
		for(int cta = 1 ; cta < 51; cta++) {
			
			qtdPecasAleatorio = (int) (Math.random() * (50 - 21) + 20);
			vlrPecasAleatorio = (int) (Math.random() * (100 - 6) + 5);
		    numCliente = cta;
		    
			Cliente cliente2 = new Cliente("Cliente "+numCliente, qtdPecasAleatorio, vlrPecasAleatorio);
			F.insert(cliente2);
		}
		
		 OperacaoController operacao = new OperacaoController();
		 operacao.caixa(F);

		
	}	
}

