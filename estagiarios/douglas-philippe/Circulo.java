

public class Circulo {

	private final double PI = 3.14;
	private double raio;
	private double AreaCirculo;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAreaCirculo() {
		return PI*raio*raio;
	}
}
