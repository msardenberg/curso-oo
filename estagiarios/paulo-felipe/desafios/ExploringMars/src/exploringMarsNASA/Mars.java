package exploringMarsNASA;

	
	public class Mars {
		
	private Plateau plateau = new Plateau();
	
	public Mars(int sizeX, int sizeY){
		plateau = new Plateau(sizeX, sizeY);
	}
	
	public Plateau getPlateau(){
		return plateau;
	}
	
	public void addRoboticRover(RoboticRover rover) throws Exception{
		plateau.addRoboticRover(rover);
	}
	
	public void showRovresInMars(){
		for(RoboticRover rover : plateau.getRoversInPlateau()){
			System.out.println("Rover name: "+rover.getName());
			System.out.println("Rover Co-ordinate X: "+rover.getCoordinateX());
			System.out.println("Rover Co-ordinate Y: "+rover.getCoordinateY());
			System.out.println("Rover Direction: "+ rover.getDirection()+"\n");
		}
	}
	
}
