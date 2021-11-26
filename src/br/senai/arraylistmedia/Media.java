package br.senai.arraylistmedia;

import java.util.ArrayList;
import java.util.Scanner;


public class Media {

	Scanner leitor;
	ArrayList<Double> notas = new ArrayList<Double>();
	
	double soma;
	double media;
	
	public Media() {
		
		leitor = new Scanner(System.in);
		
//		notas.add(10.0);
//		notas.add(5.5);
//		notas.add(8.0);
//		notas.add(2.5);
		
	}
	
	public void receberNotas() {
//		String continuar = "Sim";
//		while(continuar.equalsIgnoreCase("Sim")) {
//		System.out.print("Digite uma nota: ");
//		notas.add(leitor.nextDouble());
//		System.out.print("Deseja adicionar mais nota? ");
//		continuar = leitor.next();
//		}
		
		System.out.println("Digite quantas notas você gostaria de lançar: ");
		int contador = leitor.nextInt();
		while(notas.size() < contador) {
			System.out.print("Digite uma nota: ");
			notas.add(leitor.nextDouble());
			}
	}
	public  void exibirNotas(){
		
		for (int i = 0; i < notas.size(); i++) {
			System.out.println("Nota " + (i + 1) + " : " + notas.get(i));
		}
		
	}
	public double calcularMedia() {
		notas.forEach(nota->{
			soma+= nota;
		});
		media = soma / notas.size();
		return media;
	}

}
