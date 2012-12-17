package heranca;

public class Quadrilatero implements Figuras {

	private double base;
	private double altura;
	
	public Quadrilatero(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

}
