package br.com.ideais.mars.check;

import br.com.ideais.mars.model.MapGrid;

public class Check {

	private int[][] map = new int[MapGrid.getInstance().getSizeX()][MapGrid.getInstance().getSizeY()]; 

	public boolean checkGridX(int positionX) {

		if (positionX < 0 || positionX > MapGrid.getInstance().getSizeX()) {
			System.out.println();
			return false;

		}

		return true;

	}

	public boolean checkGridY(int positionY) {

		if (positionY < 0 || positionY > MapGrid.getInstance().getSizeY()) {
			System.out.println(MapGrid.getInstance().getSizeX());
			return false;
		}

		return true;

	}

	private int count;

	public boolean checkBorn(int positionRobotX, int positionRobotY) {
		for (int x = 0; x < MapGrid.getInstance().getSizeX(); x++) {
			for (int y = 0; y < MapGrid.getInstance().getSizeY(); y++) {
				if (map[positionRobotX][positionRobotY] != 0) {
					count++;
				}
			}
		}
		if (count > 0) {
			return false;
		}
		return true;
	}

}
