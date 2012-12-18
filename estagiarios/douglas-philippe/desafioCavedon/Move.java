
public class Move {

	public int[] moveNorth(int[] actualLocation, char[][] occupied,	int[] position) {
		int y = actualLocation[1]+1;
		int[] newPosition = {actualLocation[0],y};
		if(position[1]>=y && occupied[actualLocation[0]][y] != 'R'){
			return newPosition;
		}
		else
			System.out.println("Movimento invalido!");
			return null;
	}

	public int[] moveSouth(int[] actualLocation, char[][] occupied,	int[] position) {
		int y = actualLocation[1]-1;
		int[] newPosition = {actualLocation[0],y}; 
		if(y>=0 && occupied[actualLocation[0]][y] != 'R'){
			return newPosition;
		}
		else
			System.out.println("Movimento invalido!");
			return null;
		
	}


	public int[] moveEast(int[] actualLocation, char[][] occupied, int[] position) {
		int x = actualLocation[0]+1;
		int[] newPosition = {x,actualLocation[1]};
		if(position[0]>=x && occupied[x][actualLocation[1]] != 'R'){
			return newPosition;
		}
		else
			System.out.println("Movimento invalido!");
			return null;
	}
	
	
	

	public int[] moveWest(int[] actualLocation, char[][] occupied, int[] position) {
		int x = actualLocation[0]-1;
		int[] newPosition = {x,actualLocation[1]}; 
		if(x>=0 && occupied[x][actualLocation[1]] != 'R'){
			return newPosition;
		}
		else
			System.out.println("Movimento invalido!");
			return null;

	}

}

