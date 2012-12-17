package composicao;

public class Circulo implements Figuras {

	protected double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {

		return new AreaCirculo(this.raio).getArea();
	}

}
