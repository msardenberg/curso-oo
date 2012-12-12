package heranca;

public class Triangulo implements Figuras {

	private double l1;
	private double l2;
	private double l3;
	private double semiperimetro;
	
	public Triangulo(double l1, double l2, double l3) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public double area() {
		semiperimetro = (l1+l2+l3)/2;
		return Math.sqrt(semiperimetro * (semiperimetro - l1) * (semiperimetro - l2) * (semiperimetro - l3));
	}
	
	

}
