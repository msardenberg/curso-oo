package composicao;

public class AreaTriangulo {
	
	protected double l1;
	protected double l2;
	protected double l3;
	protected double semiperimetro;

	public AreaTriangulo(double l1, double l2, double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public double getArea() {
		semiperimetro = (l1 + l2 + l3) / 2;
		return Math.sqrt(semiperimetro * (semiperimetro - l1)
				* (semiperimetro - l2) * (semiperimetro - l3));
	}
}
