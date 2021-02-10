package common;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Contador c = new Contador();
		
		Thread h1 = new Thread(new Hilo(c,1));
		Thread h2 = new Thread(new Hilo(c,-1));
		
		// Pone en ejecucion
		h1.start();
		h2.start();
		
		// Espera a que acaben
		h1.join();
		h2.join();	
		
		System.out.println(c.getValor());
	
	}

}
