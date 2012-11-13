
public class Quadrilatero {
	private double lado1, lado2, altura;
	
	public Quadrilatero() {
	}
	

	public Quadrilatero(double lado1) {
		super();
		this.lado1 = lado1;
		lado2 = lado1;
		altura = lado1;
	}


	public Quadrilatero(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		altura = 0;
	}
	
	public Quadrilatero(double lado1, double lado2, double altura) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	public void area(){
		if(lado1 == lado2 && lado1 == altura){
			System.out.println("eh quadrado: "+ Math.pow(lado1, 2));
		}
		else if(altura == 0)
			System.out.println("eh retangulo: " +lado1 * lado2);
		else
			System.out.println("eh trapezio: " +(lado1+lado2)*altura/2);

}
}