package br.com.exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quadrilatero {

	DecimalFormat decimal = new DecimalFormat("0.00");
	private double ladoA;
	private double ladoB;
	private double areaQuadrilatero;

	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getAreaQuadrilatero() {
		return areaQuadrilatero;
	}
	public void setAreaQuadrilatero(double areaQuadrilatero) {
		this.areaQuadrilatero = areaQuadrilatero;
	}

	public void getLados(){
		Scanner scan = new Scanner(System.in);

		getLadoAWhile: while(true){

			System.out.println("Informe o comprimento: ");
			String ladoAString = scan.nextLine();
			try{
				double ladoADouble = Double.parseDouble(ladoAString);
				if(ladoADouble < 0){
					System.out.println("* Números negativos não são válidos *");
					continue getLadoAWhile;
				}
				setLadoA(ladoADouble);
				break getLadoAWhile;
			}catch (Exception e) {
				System.out.println("* Informe um valor válido *");
				continue getLadoAWhile;
			}
		}
		getLadoBWhile: while(true){

			System.out.println("Informe a largura: ");
			String ladoBString = scan.nextLine();
			try{
				double ladoBDouble = Double.parseDouble(ladoBString);
				if(ladoBDouble < 0){
					System.out.println("* Números negativos não são válidos *");
					continue getLadoBWhile;
				}
				setLadoB(ladoBDouble);
				break getLadoBWhile;
			}catch (Exception e) {
				System.out.println("* Informe um valor válido *");
				continue getLadoBWhile;
			}
		}
	}
			public String getTipoQuadrilatero(){
				String tipoQuadrilatero;
				if (getLadoA()==getLadoB()) {
					tipoQuadrilatero = "Quadrado";
				}else {
					tipoQuadrilatero = "Retângulo";
				}
				return tipoQuadrilatero;
			}

			public void calculaAreaQuadrilatero(){
				getLados();
				setAreaQuadrilatero(getLadoA() * getLadoB());

				System.out.println("Tipo do Quadrilátero: " + getTipoQuadrilatero());
				System.out.println("Área: " + decimal.format(getAreaQuadrilatero()));
			}

		}
