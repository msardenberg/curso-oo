package br.com.figurasGeometricas.modelo;

/**
 * 
 * @author Marcelo e Ruan.
 */
public class Triangulo extends FiguraGeometrica {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double semiPerimetro;
	private double areaTriangulo;
	public String tipoTriangulo;

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
	}

	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	public double getAreaTriangulo() {
		return areaTriangulo;
	}
	public void setAreaTriangulo1(double areaTriangulo) {
		this.areaTriangulo = areaTriangulo;
	}
	public double getSemiPerimetro() {
		return semiPerimetro;
	}
	public void setSemiPerimetro(double semiPerimetro) {
		this.semiPerimetro = semiPerimetro;
	}
	public double getAreaABC() {
		return areaTriangulo;
	}
	public void setAreaTriangulo(double areaABC) {
		this.areaTriangulo = areaABC;
	}

	
	@Override
	public double area() {
		setSemiPerimetro((getLadoA()+getLadoB()+getLadoC())/2) ;
		setAreaTriangulo(Math.sqrt(getSemiPerimetro() * (getSemiPerimetro() - getLadoA()) * (getSemiPerimetro() - getLadoB()) * (getSemiPerimetro() - getLadoC())));

		return (getAreaTriangulo());
	}

}
