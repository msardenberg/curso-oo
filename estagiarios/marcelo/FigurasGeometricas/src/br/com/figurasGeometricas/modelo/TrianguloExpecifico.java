package br.com.figurasGeometricas.modelo;

/**
 * Tipos de Triângulos.
 * @author Marcelo e Ruan.
 *
 */
public class TrianguloExpecifico extends Triangulo{

	public TrianguloExpecifico(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);

		if(Math.pow(getLadoA(),2)==Math.pow(getLadoB(), 2)+Math.pow(getLadoC(), 2) || 
				Math.pow(getLadoB(),2)==Math.pow(getLadoA(), 2)+Math.pow(getLadoC(), 2) || 
				Math.pow(getLadoC(),2)==Math.pow(getLadoB(), 2)+Math.pow(getLadoA(), 2) ){
			setTipoGeometrico("Triângulo retângulo");

		}else if(getLadoA()==getLadoB() && getLadoA()==getLadoC()){
			setTipoGeometrico("Trângulo regular");

		}else if(getLadoA() == getLadoB() || getLadoA() == getLadoC() || getLadoB() == getLadoC()){
			setTipoGeometrico("Triâgulo isóiceles");

		}else{
			setTipoGeometrico("Triângulo escaleno");
		}
	}
}



