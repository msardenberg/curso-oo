package composicao;

public class Triangulo implements Figuras {
	protected double l1;
	protected double l2;
	protected double l3;
	protected double semiperimetro;

	public Triangulo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public double getArea() {
		
		return new AreaTriangulo(this.l1, this.l2, this.l3).getArea();
	}
}
