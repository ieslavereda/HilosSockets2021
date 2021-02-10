package common;

public class Contador {
	
	private int valor;

	public Contador() {
		super();
		this.valor = 0;
	}
	
	public synchronized void modifica(int n) {
		valor = valor + n;
	}

	public int getValor() {
		return valor;
	}

}
