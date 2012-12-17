
public class Movements implements RobotMovements{

	@Override
	public char turnLeft(char direction) {
		char newDirection;
        switch (direction) {
            case 'N': newDirection = 'W'; 
            		break;
            case 'W': newDirection = 'S';
                     break;
            case 'S': newDirection = 'E';
                     break;
            case 'E': newDirection = 'N';
                     break;
            default: newDirection = direction;
        }
        return newDirection;
	}

	@Override
	public char turnRight(char direction) {
		char newDirection;
		switch (direction) {
            case 'N': newDirection = 'E'; 
            		break;
            case 'W': newDirection = 'N';
                     break;
            case 'S': newDirection = 'W';
                     break;
            case 'E': newDirection = 'S';
                     break;
            default: newDirection = direction;
        }
        return newDirection;
	}

	@Override
	public int[] move(int[] position, char direction, int[] actualLocation, char[][] occupied) {
		
		Move move = new Move();
		
		if(direction=='N'){
			int[] newPosition = move.moveNorth(actualLocation,occupied,position);
			return newPosition;
		} else	if(direction=='S'){
			int[] newPosition = move.moveSouth(actualLocation,occupied,position);
			return newPosition;
			
		} else	if(direction=='E'){
			int[] newPosition = move.moveEast(actualLocation,occupied,position);
			return newPosition;
		
		}	
		int[] newPosition = move.moveWest(actualLocation,occupied,position);
		return newPosition;
	
		
	}

	
	

}
