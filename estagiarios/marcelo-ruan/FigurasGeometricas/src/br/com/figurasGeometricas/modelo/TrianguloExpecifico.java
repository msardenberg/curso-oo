package br.com.figurasGeometricas.modelo;

/**
 * Tipos de Tri�ngulos.
 * @author Marcelo e Ruan.
 *
 */
public class TrianguloExpecifico extends Triangulo{

	public TrianguloExpecifico(double ladoA, double ladoB, double ladoC) {
		super(ladoA, ladoB, ladoC);

		if(Math.pow(getLadoA(),2)==Math.pow(getLadoB(), 2)+Math.pow(getLadoC(), 2) || 
				Math.pow(getLadoB(),2)==Math.pow(getLadoA(), 2)+Math.pow(getLadoC(), 2) || 
				Math.pow(getLadoC(),2)==Math.pow(getLadoB(), 2)+Math.pow(getLadoA(), 2) ){
			setTipoGeometrico("Tri�ngulo ret�ngulo");

		}else if(getLadoA()==getLadoB() && getLadoA()==getLadoC()){
			setTipoGeometrico("Tr�ngulo regular");

		}else if(getLadoA() == getLadoB() || getLadoA() == getLadoC() || getLadoB() == getLadoC()){
			setTipoGeometrico("Tri�gulo is�iceles");

		}else{
			setTipoGeometrico("Tri�ngulo escaleno");
		}
	}
}



