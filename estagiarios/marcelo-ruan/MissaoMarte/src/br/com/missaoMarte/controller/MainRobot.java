package br.com.missaoMarte.controller;

import java.io.IOException;
import java.util.List;

import br.com.missaoMarte.model.CommandEnum;
import br.com.missaoMarte.model.Coordinate;
import br.com.missaoMarte.model.Plateau;
import br.com.missaoMarte.model.ReadFile;
import br.com.missaoMarte.model.Robot;


/**
 * Classe de execução do sistema (Main).
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
		
		for (int i = 0; i < listFileLines.size(); i++) {
			
			if(i == 0){   
				String[] linePlateau = listFileLines.get(i).split(" ");
				Integer x = Integer.parseInt(linePlateau[0]);
				Integer y = Integer.parseInt(linePlateau[1]);
				
				Coordinate limiteCoordinate = new Coordinate(x,y);
				plateau = new Plateau(limiteCoordinate);
		
			}else if(i == 1){   
				String[] lineCoordinatesAlpha = listFileLines.get(i).split(" ");
				RobotController.moveRobotByCoordinate(plateau, robotAlpha, lineCoordinatesAlpha, i);
			
			}else if(i == 2){   
			
				for (int j = 0; j < listFileLines.get(i).length(); j++) {
					String lineCommandAlpha = String.valueOf(listFileLines.get(i).charAt(j));
					RobotController.command(robotAlpha, CommandEnum.valueOf(lineCommandAlpha));
					
				}
		
			}else if(i == 3){
				String[] lineCoordinatesBeta = listFileLines.get(i).split(" ");
				RobotController.moveRobotByCoordinate(plateau, robotBeta, lineCoordinatesBeta, i);
			
			}else if(i == 4){
				for (int j = 0; j < listFileLines.get(i).length(); j++) {
					String lineCommandBeta = String.valueOf(listFileLines.get(i).charAt(j));
					RobotController.command(robotBeta, CommandEnum.valueOf(lineCommandBeta));
				}
			}
		}

		System.out.println("\nPosições finais dos Robois:");
		System.out.println("Robô " + robotAlpha.getName() + "  " + robotAlpha.getCoordinate() + " " + robotAlpha.getCardial());		
		System.out.println("Robô " + robotBeta.getName() + "  " + robotBeta.getCoordinate() + " " + robotBeta.getCardial());		
	} 
}
