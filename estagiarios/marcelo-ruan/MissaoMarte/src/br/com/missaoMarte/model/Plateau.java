package br.com.missaoMarte.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Planície a ser explorada em Marte.
 * @author Marcelo e Ruan
 *
 */
public class Plateau {

	
	/**
	 * Constroi o Plateau com o tamanho máximo.
	 */
	public Plateau(Coordinate limitCoordinate) {
		this.limitCoordinate = limitCoordinate;
	}
	
	private Coordinate limitCoordinate;
	
	private Map<Coordinate, Robot> mapCoordinates = new HashMap<Coordinate, Robot>();


	
	public Coordinate getLimitCoordinate() {
		return limitCoordinate;
	}

	public void setLimitCoordinate(Coordinate limitCoordinate) {
		this.limitCoordinate = limitCoordinate;
	}

	public Map<Coordinate, Robot> getMapCoordinates() {
		return mapCoordinates;
	}

	public void setMapCoordinates(Map<Coordinate, Robot> mapCoordinates) {
		this.mapCoordinates = mapCoordinates;
	}

	
}
