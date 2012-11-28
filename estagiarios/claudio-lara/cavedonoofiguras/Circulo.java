package br.com.ideais.cavedonoo;

import java.util.ArrayList;


public class Circulo extends AreaDaFigura{
	private ArrayList<Double> valores = new ArrayList<Double>();
	public Circulo(){
		System.out.println("Digite o raio: ");
		this.valores.add(Teclado.pegaTeclado());
	}
	
	public ArrayList<Double> getCirculo(){
		return this.valores;
	}
	
	public double calculoArea(ArrayList<Double> lista) {
		double valorArea = 0;
		int i = 0;
		
		valorArea = (lista.get(i)*lista.get(i))*Math.PI;

		
		return valorArea;
	}
	 
	
	
	
}
