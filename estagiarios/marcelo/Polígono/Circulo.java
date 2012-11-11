package Poligono;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Circulo {

	DecimalFormat decimal = new DecimalFormat("0.00");
	private double areaCirculo;
	private double raio;


	public double getAreaCirculo() {
		return areaCirculo;
	}

	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void calculaAreaCirculo(){
		Scanner scan = new Scanner(System.in);
		
		raioWhile: while(true){
			System.out.print("informe o Raio do c�rculo: ");
			String raioString = scan.nextLine();
			try{
				setRaio(Double.parseDouble(raioString));
				break raioWhile;
			}catch (Exception e) {
				System.out.println("Informe um Raio v�lido");
				continue raioWhile;
			}
		}
		setAreaCirculo(Math.PI * Math.pow(getRaio(),2));
		System.out.println("�rea do c�rculo: " + decimal.format(getAreaCirculo()));
	}

}

