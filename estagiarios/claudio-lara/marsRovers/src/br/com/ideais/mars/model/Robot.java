package br.com.ideais.mars.model;

import br.com.ideais.mars.interfaces.SpinAndMove;

public class Robot implements SpinAndMove{
	private int positionX;
	private int positionY;
	private String firstInstructions;
	public String getFirstInstructions() {
		return firstInstructions;
	}

	public void setFirstInstructions(String firstInstructions) {
		this.firstInstructions = firstInstructions;
	}

	private char[] compass = { 'N', 'E', 'S', 'W' };
	private String lastHead;

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	private String instructions;

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public String getLastHead() {
		return lastHead;
	}

	public void setLastHead(String lastHead) {
		this.lastHead = lastHead;
	}

	public int indexValueN() {
		return 0;
	}

	public int indexValueE() {
		
		return 1;
	}

	public int indexValueW( ) {
		return 3;
	}

	public int indexValueS( ) {
		return 2;
	}

	public void spinLeft(int indexVet) {
		indexVet--;

		if (indexVet < 0) {
			indexVet = 3;
		}

		this.lastHead = String.valueOf(compass[indexVet]);
	}

	public void spinRight(int indexVet) {
		indexVet++;

		if (indexVet > 3) {
			indexVet = 0;
		}

		this.lastHead = String.valueOf(compass[indexVet]);
	}

public int[][] move(Robot robot) {
		
		int[][] map = new int[MapGrid.getInstance().getSizeX()][MapGrid.getInstance().getSizeY()];
		if(robot.positionX<0 || robot.positionY<0 ){
			map[robot.positionX][robot.positionY] = 1;
		}
		else if(robot.positionX>map.length || robot.positionY>map.length){
			map[robot.positionX-1][robot.positionY-1] = 1;
			}	
		
		if (robot.lastHead.equals("N")) {
			robot.positionY++;
			
				if(robot.positionX<0 || robot.positionY<0){
					map[robot.positionX][robot.positionY] = 1;
				}else if(robot.positionX>map.length || robot.positionY>map.length){
					map[robot.positionX-1][robot.positionY-1] = 1;}
				
				return map;
			}
		
		if (robot.lastHead.equals("E")) {
			robot.positionX++;
			if(robot.positionX<0 || robot.positionY<0){
				map[robot.positionX][robot.positionY] = 1;
			}else if(robot.positionX>map.length || robot.positionY>map.length){
				map[robot.positionX-1][robot.positionY-1] = 1;}
			
			return map;
		}
		if (robot.lastHead.equals("W")) {
			robot.positionX--;
			if(robot.positionX<0 || robot.positionY<0){
				map[robot.positionX][robot.positionY] = 1;
			}else if(robot.positionX>map.length || robot.positionY>map.length){
				map[robot.positionX-1][robot.positionY-1] = 1;}
			
			return map;
		}
		if (robot.lastHead.equals("S")) {
			robot.positionY--;
			if(robot.positionX<0 || robot.positionY<0){
				map[robot.positionX][robot.positionY] = 1;
			}else if(robot.positionX>map.length || robot.positionY>map.length){
				map[robot.positionX-1][robot.positionY-1] = 1;}
			
			return map;
		}
		else
			throw new RuntimeException();

	}


}
