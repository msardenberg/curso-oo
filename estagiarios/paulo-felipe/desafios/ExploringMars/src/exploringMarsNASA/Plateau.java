package exploringMarsNASA;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	private List<RoboticRover> roversInPlateau = new ArrayList<RoboticRover>();
	private int sizeX;
	private int sizeY;
	
	public Plateau(){
		
	}
		
	public Plateau (int sizeX, int sizeY){
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	public int getSizeX(){
		return this.sizeX;
	}
	public int getSizeY(){
		return this.sizeY;
	}
	public List<RoboticRover> getRoversInPlateau(){
		return roversInPlateau;
	}
	
	
	public void addRoboticRover(RoboticRover rover) throws Exception{
		if (checkPositionIsFree(rover.getCoordinateX(), rover.getCoordinateY())){
			if (rover.getCoordinateX() < 0 || rover.getCoordinateX() > getSizeX() || rover.getCoordinateY() < 0 || rover.getCoordinateY() > getSizeY()){
	        	throw new Exception("The Robotic Rover "+rover.getName()+" position is out of Plateau Mars limits, the rover will not be land on Mars");
			}
		}else{
			throw new Exception("Error tryng to add Robotic Rover name "+rover.getName()+
					" : Position "+rover.getCoordinateX()+" "+ rover.getCoordinateY()+ " is occupied");
        }
		roversInPlateau.add(rover);
	}
	
	public boolean checkPositionIsFree(int coordinateX,int coordinateY) {
		boolean result= true;
		for(RoboticRover rover : roversInPlateau){
			if(coordinateX==rover.getCoordinateX() && coordinateY==rover.getCoordinateY()){
				result = false;
			}
		}
		return result;
	}
	
}
