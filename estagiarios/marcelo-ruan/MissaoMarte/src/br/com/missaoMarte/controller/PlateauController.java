package br.com.missaoMarte.controller;

import br.com.missaoMarte.model.Coordinate;
import br.com.missaoMarte.model.Plateau;


/**
 * Intelig�ncia de controle do Plateau.
 * @author Marcelo e Ruan
 *
 */
public class PlateauController {

	/**
	 * M�todo que verifica coordenada vaga.
	 * @param plateau
	 * @param coordinate
	 * @return se a coordenada possui um Rob� ou n�o.
	 */
	public boolean isCoordinateEmpty(Plateau plateau, Coordinate coordinate){
		
		return plateau.getMapCoordinates().get(coordinate) == null;
	}
	
	
	/**
	 * M�todo: coordenada no limite.
	 * @param plateau
	 * @param coordinate
	 * @return se a coordenada est� no limite do Plateau ou n�o.
	 */
	public boolean coordinateInLimit(Plateau plateau, Coordinate coordinate){
		return coordinate.getX() <= plateau.getLimitCoordinate().getX() 
		&& coordinate.getY() <= plateau.getLimitCoordinate().getY()
		&& coordinate.getX() >= 0 
		&& coordinate.getY() >= 0; 
	}
}
