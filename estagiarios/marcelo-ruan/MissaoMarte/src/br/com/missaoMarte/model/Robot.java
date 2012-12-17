package br.com.missaoMarte.model;

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
}
