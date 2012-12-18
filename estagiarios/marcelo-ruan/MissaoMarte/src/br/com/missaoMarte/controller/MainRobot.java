package br.com.missaoMarte.controller;

import java.io.IOException;
import java.util.List;

import br.com.missaoMarte.model.CommandEnum;
import br.com.missaoMarte.model.Coordinate;
import br.com.missaoMarte.model.Plateau;
import br.com.missaoMarte.model.ReadFile;
import br.com.missaoMarte.model.Robot;


/**
 * Classe de execu��o do sistema (Main).
 * @author Marcelo e Ruan
 *
 */
public class MainRobot {

	public static void main(String[] args) throws IOException {

		List<String> listFileLines = ReadFile.fileToList("fileWorkNasa\\InputFile.txt");

		System.out.println("Teste para leitura de arquivo: " + listFileLines);
		System.out.println("");

		Plateau plateau = null;
		Robot robotAlpha = new Robot("Marcelo");
		Robot robotBeta = new Robot("Ruan");
		RobotController robotController = new RobotController();
		PlateauController plateauController = new PlateauController();

		for (int i = 0; i < listFileLines.size(); i++) {

			if(i == 0){
				String[] linePlateau = listFileLines.get(i).split(" ");
				Integer x = Integer.parseInt(linePlateau[0]);
				Integer y = Integer.parseInt(linePlateau[1]);

				Coordinate limiteCoordinate = new Coordinate(x,y);
				plateau = new Plateau(limiteCoordinate);

			}else if(i == 1){
				String[] lineCoordinatesAlpha = listFileLines.get(i).split(" ");
				robotController.moveRobotByCoordinate(plateau, plateauController, robotAlpha, lineCoordinatesAlpha, i);

			}else if(i == 2){

				for (int j = 0; j < listFileLines.get(i).length(); j++) {
					String lineCommandAlpha = String.valueOf(listFileLines.get(i).charAt(j));
					robotController.commandController(robotAlpha, CommandEnum.valueOf(lineCommandAlpha),
							robotAlpha.getCoordinate(), plateau, plateauController, robotAlpha.getCardial());
				}

			}else if(i == 3){
				String[] lineCoordinatesBeta = listFileLines.get(i).split(" ");
				robotController.moveRobotByCoordinate(plateau, plateauController, robotBeta, lineCoordinatesBeta, i);

			}else if(i == 4){

				for (int j = 0; j < listFileLines.get(i).length(); j++) {
					String lineCommandBeta = String.valueOf(listFileLines.get(i).charAt(j));
					robotController.commandController(robotBeta, CommandEnum.valueOf(lineCommandBeta),
							robotBeta.getCoordinate(), plateau, plateauController, robotBeta.getCardial());
				}
			}
		}

		System.out.println("\nPosi��es finais dos Robois:");
		System.out.println("Rob� " + robotAlpha.getName() + " " + robotAlpha.getCoordinate() + " " + robotAlpha.getCardial());	
		System.out.println("Rob� " + robotBeta.getName() + " " + robotBeta.getCoordinate() + " " + robotBeta.getCardial());	
	}
}