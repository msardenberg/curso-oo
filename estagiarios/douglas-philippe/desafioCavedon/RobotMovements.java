
public interface RobotMovements {
	char turnLeft(char direction);
	char turnRight(char direction);
	int[] move(int[] position, char direction, int[] atualLocation, char[][] occupied); 
}
