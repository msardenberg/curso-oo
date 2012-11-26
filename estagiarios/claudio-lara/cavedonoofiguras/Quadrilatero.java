package br.com.ideais.cavedonoo;

import java.util.ArrayList;

public class Quadrilatero extends AreaDaFigura {
	private ArrayList<Double> valores = new ArrayList<Double>();

	public Quadrilatero() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o lado do quadrilatero: ");
			valores.add(Teclado.pegaTeclado());
		}
	}
	public ArrayList<Double> getQuadrilatero(){
		return this.valores;
	}
	
	public double calculoArea(ArrayList<Double> lista) {

		double valorArea = 0;
		int i = 0;

		valorArea = lista.get(i) * lista.get(i + 1);

		return valorArea;
	}

}
