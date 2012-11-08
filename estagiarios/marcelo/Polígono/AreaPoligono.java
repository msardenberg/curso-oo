package br.com.exercicios;
import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
	
		tipoPoligonoWhile: while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("----- Menu Principal -----");		
			System.out.println("0 - Sair do Programa");
			System.out.println("1 - Círculo");
			System.out.println("2 - Quadrilátero");
	//		System.out.println("3 - Triângulo");

			String opçao = scan.nextLine();
			int opcaoInt;

			try{
				opcaoInt = Integer.parseInt(opçao);
			}catch (Exception e) {
				System.out.println("Opcão inválida...Tente novamente.");
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
				System.out.println("Opção inválida...Tente novamente.");
				continue tipoPoligonoWhile
				;
			}
		}

	}
}
