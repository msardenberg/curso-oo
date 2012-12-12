package composicao;

public class Quadrilatero implements Figuras {

	protected double base;
	protected double altura;

	public Quadrilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return new AreaQuadrilatero(this.base,this.altura).getArea();
	}
}
