package br.com.figurasGeometricas.modelo;

/**
 * Quadriláteros: restringidos em quadrado e retângulo. 
 * @author Marcelo e Ruan
 *
 */
public class Quadrilatero extends FiguraGeometrica {

	private double base;
	private double altura;
	private double areaQuadrilatero;
	
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAreaQuadrilatero() {
		return areaQuadrilatero;
	}

	public void setAreaQuadrilatero(double areaQuadrilatero) {
		this.areaQuadrilatero = areaQuadrilatero;
	}

	public Quadrilatero(double base, double altura) {
		super();
		setBase(base);
		setAltura(altura);
	}

	@Override
	public double area() {
		setAreaQuadrilatero(getBase() * getAltura());
		return getAreaQuadrilatero();
	}

}
