package composicao;

public class AreaCirculo  {

	protected double raio;
	
	
	public AreaCirculo(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return raio*raio*Math.PI;
	}

}
