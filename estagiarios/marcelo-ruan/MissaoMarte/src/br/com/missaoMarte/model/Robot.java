package br.com.missaoMarte.model;

import br.com.missaoMarte.controller.PlateauController;


public class Robot {


	/**
	 * Coordenadas iniciais: (0,0) voltado para o North.
	 */
	public Robot(String name){
		this.coordinate = new Coordinate(0,0);
		this.cardial = CardialEnum.N;
		this.name = name;
	}

	private String name;
	private Coordinate coordinate;
	private CardialEnum cardial;
	private Plateau plateau;


	public CardialEnum getCardial() {
		return cardial;
	}

	public void setCardial(CardialEnum cardial) {
		this.cardial = cardial;
	}

	public String getName() {
		return name;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}


	public void commandMoveRobot(Coordinate coordinate, Plateau plateau, PlateauController plateauController){

		if(getCardial().equals(CardialEnum.N)){
			coordinate.setY(coordinate.getY()+1);

		}else if(getCardial().equals(CardialEnum.S)){
			coordinate.setY(coordinate.getY()-1);

		}else if(getCardial().equals(CardialEnum.E)){
			coordinate.setX(coordinate.getX()+1);

		}else if(getCardial().equals(CardialEnum.W)){
			coordinate.setX(coordinate.getX()-1);
		}
	}

	public void commandLeftRobot(Coordinate coordinate, CardialEnum cardial){

		if(getCardial().equals(CardialEnum.N)){
			setCardial(CardialEnum.W);

		}else if(getCardial().equals(CardialEnum.S)){
			setCardial(CardialEnum.E);

		}else if(getCardial().equals(CardialEnum.E)){
			setCardial(CardialEnum.N);

		}else if(getCardial().equals(CardialEnum.W)){
			setCardial(CardialEnum.S);
		}
	}

	public void commandRightRobot(Coordinate coordinate, CardialEnum cardial){

		if(getCardial().equals(CardialEnum.N)){
			setCardial(CardialEnum.E);

		}else if(getCardial().equals(CardialEnum.S)){
			setCardial(CardialEnum.W);

		}else if(getCardial().equals(CardialEnum.E)){
			setCardial(CardialEnum.S);

		}else if(getCardial().equals(CardialEnum.W)){
			setCardial(CardialEnum.N);
		}
	}
}


