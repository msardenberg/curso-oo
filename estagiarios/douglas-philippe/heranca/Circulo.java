package heranca;

public class Circulo implements Figuras {

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return raio*raio*Math.PI;
	}
	
	
	

}

