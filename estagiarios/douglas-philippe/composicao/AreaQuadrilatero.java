package composicao;

public class AreaQuadrilatero {

	protected double base;
	protected double altura;
	
	public AreaQuadrilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea() {
		return base * altura;
	}
	
}
