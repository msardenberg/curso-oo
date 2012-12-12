package heranca;

public class FigurasMain {

	public static void main(String[] args) {
		Figuras c1 = new Circulo(2);
		Figuras c2 = new Circulo(3.5);
		Figuras c3 = new Circulo(2.147);
		Figuras q1 = new Quadrilatero(2, 2);
		Figuras q2 = new Quadrilatero(3, 7);
		Figuras t1 = new Triangulo(3,4,5);
		Figuras t2 = new Triangulo(1,1,1);

		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println(c3.area());
		System.out.println("\n");
		System.out.println(q1.area());
		System.out.println(q2.area());
		System.out.println("\n");
		System.out.println(t1.area());
		System.out.println(t2.area());
		
	}

}
