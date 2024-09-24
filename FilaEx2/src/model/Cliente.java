package model;
import java.lang.Iterable;
public class Cliente {
	
	private String Nome;
	private int QtdPecas;
	private float vlrPecas;

	public Cliente() {
		this.Nome = "";
		this.QtdPecas = 0;
		this.vlrPecas = 0;
	}
	
	public Cliente(String Nome, int QtdPecas, float vlrPecas) {
		this.Nome = Nome;
		this.QtdPecas = QtdPecas;
		this.vlrPecas = vlrPecas;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void setQtdPecas(int QtdPecas) {
		this.QtdPecas = QtdPecas;
	}
	public void setvlrPecas(float vlrPecas) {
		this.vlrPecas = vlrPecas;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public int getQtdPecas() {
		return this.QtdPecas;
	}
	public float getvlrPecas() {
		return this.vlrPecas;
	}
	
	@Override
	public String toString() {
		return "[Nome: "+Nome+", Qtd Peças: "+QtdPecas+", Vlr Peças:"+vlrPecas+"]";
	}
	
}
