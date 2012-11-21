package Poligono;
import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
	
		tipoPoligonoWhile: while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("----- Menu Principal -----");		
			System.out.println("0 - Sair do Programa");
			System.out.println("1 - C�rculo");
			System.out.println("2 - Quadril�tero");
	//		System.out.println("3 - Tri�ngulo");

			String op�ao = scan.nextLine();
			int opcaoInt;

			try{
				opcaoInt = Integer.parseInt(op�ao);
			}catch (Exception e) {
				System.out.println("Opc�o inv�lida...Tente novamente.");
				continue tipoPoligonoWhile;
			}

			switch (opcaoInt) {
			case 0:
				System.out.println("Fechando programa...");
				break tipoPoligonoWhile;
			case 1: 
				Circulo circulo = new Circulo();
				circulo.calculaAreaCirculo();
				continue tipoPoligonoWhile;

			case 2:
				Quadrilatero quadrilatero = new Quadrilatero();
				quadrilatero.calculaAreaQuadrilatero();
				continue tipoPoligonoWhile;
			case 3:
				Triangulo triangulo = new Triangulo();
				continue tipoPoligonoWhile;
			default:
				System.out.println("Op��o inv�lida...Tente novamente.");
				continue tipoPoligonoWhile
				;
			}
		}

	}
}
