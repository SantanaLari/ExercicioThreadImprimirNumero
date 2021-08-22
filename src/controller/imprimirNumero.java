package controller;

public class imprimirNumero extends Thread {

	private int i;
	
	public imprimirNumero(int i) {
		this.i = i;
	}
	
	public void run() {
		numerosThread();
	}
	
	private void numerosThread() {
		System.out.println("#" + getId());
	}
}
