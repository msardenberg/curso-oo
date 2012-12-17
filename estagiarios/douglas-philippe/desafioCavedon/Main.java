import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    	Robot robot = new Robot();
    	
		System.out.println("tamanho do plateau? exemplo:n m");

		int[] plateauSize = robot.plateau.size();
		char[][] plateau = robot.plateau.create(plateauSize[0],plateauSize[1]);

		System.out.println("Serao quantos robos?");
		Scanner scanner = new Scanner (System.in);  
		String scan = scanner.nextLine();
		int quantity = Integer.parseInt(scan);
		
		for(int j=0; j<quantity; j++){
			
				
		    	System.out.println("Posicao inicial? exemplo:1 3 N");
		    	String position = robot.input.wholePosition();
		    	int[] initialLocation = robot.input.location(position);
		    	char direction = robot.input.coordenate(position);
		    	
		    	System.out.println("Movimentos? exemplo:MRRLM");
		    	char[] movements = robot.input.movements();
		
				int[] move = plateauSize;
				char newDirection=direction;
				char[][] occupied= plateau;
						
				for(int i=0; i<movements.length ; i++){
					if(movements[i]!='M'){
						if(movements[i]=='L'){
							newDirection = robot.robotMovement.turnLeft(newDirection);
						}else {
							newDirection = robot.robotMovement.turnRight(newDirection);
						}
					} else {
						move = robot.robotMovement.move(plateauSize, newDirection, initialLocation, occupied);
						occupied = robot.plateau.occupied(move,plateauSize);
								
					}
				}
				System.out.println(move[0] + " " + move[1] + " " + newDirection);	
		}
	}
	
}