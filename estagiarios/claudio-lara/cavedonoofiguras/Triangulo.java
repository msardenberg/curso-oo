package br.com.ideais.cavedonoo;

import java.util.ArrayList;

public class Triangulo extends AreaDaFigura {
	private ArrayList<Double> valores = new ArrayList<Double>();
	
	public Triangulo(){
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o lado do triangulo: ");
			this.valores.add(Teclado.pegaTeclado());
		}
	}
	
	public ArrayList<Double> getTriangulo(){
		return this.valores;
	}
	
	public double calculoArea(ArrayList<Double> lista) {

		double semiPerimetro = (lista.get(0)+lista.get(1)+lista.get(2))/2;
		double valorArea = Math.sqrt(semiPerimetro * (semiPerimetro - lista.get(0)) *(semiPerimetro - lista.get(1)) *(semiPerimetro - lista.get(2)));
		return valorArea;
	}

}
