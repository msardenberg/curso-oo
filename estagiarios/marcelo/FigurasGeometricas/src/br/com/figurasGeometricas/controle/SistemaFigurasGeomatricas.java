package br.com.figurasGeometricas.controle;
import java.text.DecimalFormat;

import br.com.figurasGeometricas.modelo.Circulo;
import br.com.figurasGeometricas.modelo.FiguraGeometrica;
import br.com.figurasGeometricas.modelo.Quadrilatero;
import br.com.figurasGeometricas.modelo.TrianguloExpecifico;

/**
 * Calcula �rea de figuras geom�tricas. 
 * @author Marcelo e Ruan.
 *
 */
public class SistemaFigurasGeomatricas {

	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		FiguraGeometrica circulo = new Circulo(2);
		FiguraGeometrica quadrilatero = new Quadrilatero(2, 2);
		FiguraGeometrica triangulo = new TrianguloExpecifico(3,4,5); //
		
		System.out.println("�rea do c�rculo: " + decimal.format(circulo.area()));
		System.out.println("�rea do quadril�tero: " + decimal.format(quadrilatero.area()));
		System.out.println("�rea do " + triangulo.getTipoGeometrico() + ": " + decimal.format(triangulo.area()));
	}
}
