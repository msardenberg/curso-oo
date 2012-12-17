import java.util.Scanner;


public class Plateau {

	public int[] size() {
		
		Scanner scan = new Scanner (System.in);  
		String plateau = scan.nextLine();
		String[] coordenate = plateau.split(" ");
		
		int sizeX = Integer.parseInt(coordenate[0]);
		int sizeY = Integer.parseInt(coordenate[1]);
		int[] plateauSize = {sizeX,sizeY};
		
		return plateauSize;
				
			
	}

	public char[][] create(int x, int y){
		char[][] plateau = new char [x][y];
		for (int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				plateau[i][j]='0';
			}
		}
		return plateau;
	}

	
	public char[][] occupied(int[] move, int[] plateauSize) {
		char[][] occupied = new char [plateauSize[0]][plateauSize[1]];
		occupied[move[0]][plateauSize[1]-move[1]] = 'R';
		return occupied;
	}

}
