package br.com.missaoMarte.controller;

import br.com.missaoMarte.model.Coordinate;
import br.com.missaoMarte.model.Plateau;


/**
 * Inteligência de controle do Plateau.
 * @author Marcelo e Ruan
 *
 */
public class PlateauController {

	/**
	 * Método que verifica coordenada vaga.
	 * @param plateau
	 * @param coordinate
	 * @return se a coordenada possui um Robô ou não.
	 */
	public boolean isCoordinateEmpty(Plateau plateau, Coordinate coordinate){
		
		return plateau.getMapCoordinates().get(coordinate) == null;
	}
	
	
	/**
	 * Método: coordenada no limite.
	 * @param plateau
	 * @param coordinate
	 * @return se a coordenada está no limite do Plateau ou não.
	 */
	public boolean coordinateInLimit(Plateau plateau, Coordinate coordinate){
		return coordinate.getX() <= plateau.getLimitCoordinate().getX() 
		&& coordinate.getY() <= plateau.getLimitCoordinate().getY()
		&& coordinate.getX() >= 0 
		&& coordinate.getY() >= 0; 
	}
}
