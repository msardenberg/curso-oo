import java.util.*;

public class FigurasGeometricas {

	public static void main(String[] args) {
		Circulo circ = new Circulo();
		double[] raio = { 2, 3.5, 2.147 };
		for (int i = 0; i < 3; i++) {
			circ.setRaio(raio[i]);
			System.out.println("Area do Circulo: " + circ.getAreaCirculo());
		}

		Quadrilatero q = new Quadrilatero();
		double[] base = { 2, 3 };
		double[] altura = { 2, 7 };
		for (int i = 0; i < 2; i++) {
			q.setAltura(altura[i]);
			q.setBase(base[i]);
			System.out.println("Area do Quadrilatero " + q.getAreaQuadrilatero());
		}

		Triangulo t = new Triangulo();
		double[] a = { 3, 1 };
		double[] b = { 4, 1 };
		double[] c = { 5, 1 };
		for (int i = 0; i < 2; i++) {
			t.setA(a[i]);
			t.setB(b[i]);
			t.setC(c[i]);
			t.setS(a[i], b[i], c[i]);
			System.out.println("Area do Triangulo " + t.getAreaTriangulo());
		}
	}
}
