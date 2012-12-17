package br.com.missaoMarte.model;

public class Coordinate {

	public Coordinate(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	private Integer x;
	private Integer y;
	
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return this.x + " " +this.y;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null || !(obj instanceof Coordinate)){
//			return false;
//		}
//		
//		Coordinate c = (Coordinate)obj;
//		
//		if(c.getX() == getX() && c.getY() == getY()){
//			return true;
//		}else{
//			return false;
//		}
//	}
	
	
}
