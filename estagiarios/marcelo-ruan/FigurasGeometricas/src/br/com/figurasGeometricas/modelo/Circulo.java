package br.com.figurasGeometricas.modelo;

/**
 * 
 * @author Marcelo e Ruan.
 *
 */
public class Circulo extends FiguraGeometrica {

	private double raio;
	private double areaCirculo;
	
	public double getAreaCirculo() {
		return areaCirculo;
	}
	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		super();
		setRaio(raio);
	}

	@Override
	public double area() {
		setAreaCirculo(Math.PI * Math.pow(getRaio(), 2));
		return getAreaCirculo();
	}
	
}