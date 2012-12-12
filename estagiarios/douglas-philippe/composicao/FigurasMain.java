package composicao;

public class FigurasMain {

	public static void main(String[] args) {
		AreaCirculo ac = new AreaCirculo(2.);
		AreaCirculo ac2 = new AreaCirculo(3.5);
		AreaCirculo ac3 = new AreaCirculo(2.147);
		
		AreaQuadrilatero aq = new AreaQuadrilatero(2, 2);
		AreaQuadrilatero aq2 = new AreaQuadrilatero(3, 7);
		
		AreaTriangulo at = new AreaTriangulo(3, 4, 5);
		AreaTriangulo at2 = new AreaTriangulo(1, 1, 1);
		
		System.out.println(ac.getArea());
		System.out.println(ac2.getArea());
		System.out.println(ac3.getArea());
		System.out.println("\n");
		System.out.println(aq.getArea());
		System.out.println(aq2.getArea());
		System.out.println("\n");
		System.out.println(at.getArea());
		System.out.println(at2.getArea());
		
	}
}
