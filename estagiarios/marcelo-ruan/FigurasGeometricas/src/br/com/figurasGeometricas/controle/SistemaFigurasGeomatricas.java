package br.com.figurasGeometricas.controle;
import java.text.DecimalFormat;

import br.com.figurasGeometricas.modelo.Circulo;
import br.com.figurasGeometricas.modelo.FiguraGeometrica;
import br.com.figurasGeometricas.modelo.Quadrilatero;
import br.com.figurasGeometricas.modelo.TrianguloExpecifico;

/**
 * Calcula área de figuras geométricas. 
 * @author Marcelo e Ruan.
 *
 */
public class SistemaFigurasGeomatricas {

	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		FiguraGeometrica circulo = new Circulo(2);
		FiguraGeometrica quadrilatero = new Quadrilatero(2, 2);
		FiguraGeometrica triangulo = new TrianguloExpecifico(3,4,5); //
		
		System.out.println("Área do círculo: " + decimal.format(circulo.area()));
		System.out.println("Área do quadrilátero: " + decimal.format(quadrilatero.area()));
		System.out.println("Área do " + triangulo.getTipoGeometrico() + ": " + decimal.format(triangulo.area()));
	}
}
