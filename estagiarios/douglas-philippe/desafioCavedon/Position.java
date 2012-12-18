import java.util.Scanner;


public class Position implements Input{

	@Override
	public String wholePosition() {
		Scanner scan = new Scanner (System.in);  
		String position = scan.nextLine();
						
		return position;
	}
	
	@Override
	public int[] location(String position) {
		
		String[] positions = position.split(" ");
		
		int positionX = Integer.parseInt(positions[0]);
		int positionY = Integer.parseInt(positions[1]);
		
		int[] location = {positionX,positionY};
		
		return location;
	}

	
	@Override
	public char coordenate(String position) {
		
		char[] coordenate = new char [position.length()];
		for(int i=0; i<coordenate.length;i++){
			coordenate[i] = position.charAt(i);
		}
		return coordenate[coordenate.length-1];
	}

	@Override
	public char[] movements() {
		Scanner scan = new Scanner (System.in);  
		String allMovements = scan.nextLine();
		char[] movements = new char [allMovements.length()];
		for(int i=0; i<allMovements.length();i++){
			movements[i] = allMovements.charAt(i);
		}
		return movements;
	}



	



	

}
