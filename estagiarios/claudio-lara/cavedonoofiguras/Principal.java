package br.com.ideais.cavedonoo;

public class Principal {

	public static void main(String[] args) {

		String op = " ";
		System.out.println("Digite 1 para Circulo, 2 para Quadrado ou 3 para Triangulo: ");
		op = Teclado.pegaTecladoSwitch();

		if (op.equals("1")) {

			Circulo circulo = new Circulo();

			System.out.println(circulo.calculoArea(circulo.getCirculo()));
		} else if (op.equals("2")) {

			Quadrilatero quadrilatero = new Quadrilatero();

			System.out.println(quadrilatero.calculoArea(quadrilatero
					.getQuadrilatero()));

		} else if (op.equals("3")) {

			Triangulo triangulo = new Triangulo();
			System.out.println(triangulo.calculoArea(triangulo.getTriangulo()));

		}

	}

}
