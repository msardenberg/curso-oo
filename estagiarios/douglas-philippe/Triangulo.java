public class Triangulo {

	private double a;
	private double b;
	private double c;
	private double s;
	private double AreaTriangulo;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setS(double a, double b, double c) {
		this.s = (a + b + c) / 2;
	}

	public double getS() {
		return (a + b + c) / 2;
	}

	public double getAreaTriangulo() {
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

}
