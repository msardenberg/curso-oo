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
	public static boolean isCoordinateEmpty(Plateau plateau, Coordinate coordinate){
		return plateau.getMapCoordinates().get(coordinate) == null;
	}
	
	
	/**
	 * Método: coordenada no limite.
	 * @param plateau
	 * @param coordinate
	 * @return se a coordenada está no limite do Plateau ou não.
	 */
	public static boolean coordinateInLimit(Plateau plateau, Coordinate coordinate){
		return coordinate.getX() <= plateau.getLimitCoordinate().getX() 
		&& coordinate.getY() <= plateau.getLimitCoordinate().getY()
		&& coordinate.getX() >= 0 
		&& coordinate.getY() >= 0; 
	}

	
	public static int iterateX(Coordinate fromCoordinate, Coordinate toCoordinate){
		if(fromCoordinate.getX() > toCoordinate.getX()){
			return -1;
		}
		
		return 1;
	}

	public static int iterateY(Coordinate fromCoordinate, Coordinate toCoordinate){
		if(fromCoordinate.getY() > toCoordinate.getY()){
			return -1;
		}

		return 1;
	}
	
	
	/**
	 * Método caminho alternativo por XY.
	 * @param plateau
	 * @param fromCoordinate
	 * @param toCoordinate
	 * @return caminho válido ou não.
	 */
	public static boolean wayIsClearByXY(Plateau plateau, Coordinate fromCoordinate, Coordinate toCoordinate){

		if(!coordinateInLimit(plateau, toCoordinate) || !isCoordinateEmpty(plateau, toCoordinate)){
			return false;
		}
		

		while(fromCoordinate.getX() != toCoordinate.getX()){
			fromCoordinate.setX(fromCoordinate.getX()+ iterateX(fromCoordinate, toCoordinate));
			if (isCoordinateEmpty(plateau, fromCoordinate)) {
				continue;
			}else {
				return false;
			}
		}
		
		while(fromCoordinate.getY()!= toCoordinate.getY()){
			fromCoordinate.setY(fromCoordinate.getY()+ iterateY(fromCoordinate, toCoordinate));
			if(isCoordinateEmpty(plateau, fromCoordinate)){
				continue;
			}else {
				return false;
			}
		}
		
		return true;
	}
	

	/**
	 * Método caminho alternativo por YX.
	 * @param plateau
	 * @param fromCoordinate
	 * @param toCoordinate
	 * @return caminho válido ou não.
	 */
	public static boolean wayIsClearByYX(Plateau plateau, Coordinate fromCoordinate, Coordinate toCoordinate){
		if(!coordinateInLimit(plateau, toCoordinate) || !isCoordinateEmpty(plateau, toCoordinate)){
			return false;
		}

		while(fromCoordinate.getY()!= toCoordinate.getY()){
			fromCoordinate.setY(fromCoordinate.getY()+ iterateY(fromCoordinate, toCoordinate));
			if(isCoordinateEmpty(plateau, fromCoordinate)){
				continue;
			}else {
				return false;
			}
		}
		while(fromCoordinate.getX() != toCoordinate.getX()){
			fromCoordinate.setX(fromCoordinate.getX()+ iterateX(fromCoordinate, toCoordinate));
			if (isCoordinateEmpty(plateau, fromCoordinate)) {
				continue;
			}else {
				return false;
			}
		}		
		return true;
	}
}
