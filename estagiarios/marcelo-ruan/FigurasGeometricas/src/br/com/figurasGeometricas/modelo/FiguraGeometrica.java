package br.com.figurasGeometricas.modelo;

/**
 * Atributos e comportamentos em comuns � figuras geom�tricas.
 * @author Marcelo e Ruan
 *
 */
public abstract class FiguraGeometrica {

	private String tipoGeometrico;

	public String getTipoGeometrico() {
		return tipoGeometrico;
	}

	public void setTipoGeometrico(String tipoGeometrico) {
		this.tipoGeometrico = tipoGeometrico;
	}


	public abstract double area();

}
