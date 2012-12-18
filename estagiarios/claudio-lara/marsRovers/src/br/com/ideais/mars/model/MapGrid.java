package br.com.ideais.mars.model;

public class MapGrid {
	private static MapGrid unique; 
	
	private MapGrid(){
	}
	
	public static MapGrid getInstance(){
		if(unique==null){
		 unique = new MapGrid();
		}
		return unique;
	}
	
		
	private  int sizeX;
	private  int sizeY;
	
	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	

}
