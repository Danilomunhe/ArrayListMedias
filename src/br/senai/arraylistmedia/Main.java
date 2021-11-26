package br.senai.arraylistmedia;

public class Main {

	public static void main(String[] args) {
		
		Media media = new Media();
		media.receberNotas();
		media.exibirNotas();
		System.out.println("Nota final: " + media.calcularMedia());
	}

}
