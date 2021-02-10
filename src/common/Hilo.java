package common;

public class Hilo implements Runnable {

	private int n;
	private Contador c;

	public Hilo(Contador c, int n) {
		this.n = n;
		this.c = c;
	}

	public void run() {
		for (int i = 0; i < 100000; i++)
			c.modifica(n);
	}

}
