package br.com.missaoMarte.controller;

import br.com.missaoMarte.model.CardialEnum;
import br.com.missaoMarte.model.CommandEnum;
import br.com.missaoMarte.model.Coordinate;
import br.com.missaoMarte.model.Plateau;
import br.com.missaoMarte.model.Robot;

/**
 * Controla as ações possiveis do robô
 * @author Marcelo e Ruan
 *
 */
public class RobotController {

	public static void toCoordinate(Robot robot, Integer x, Integer y, CardialEnum cardial){
		robot.getCoordinate().setX(x);
		robot.getCoordinate().setY(y);
		robot.setCardial(cardial);
	}


	public void commandController(Robot robot, CommandEnum command, Coordinate coordinate, 
			Plateau plateau, PlateauController plateauController, CardialEnum cardial){

		if(CommandEnum.M.equals(command)){
			robot.commandMoveRobot(coordinate, plateau, plateauController);

		}else if(CommandEnum.L.equals(command)){
			robot.commandLeftRobot(coordinate, cardial);

		}else if(CommandEnum.R.equals(command)){
			robot.commandRightRobot(coordinate, cardial);

		}

		System.out.println("Robo: " + robot.getName() + " " + robot.getCoordinate() + " " + robot.getCardial());
	}


	public void moveRobotByCoordinate(Plateau plateau, PlateauController plateauController, Robot robot, String[] fileLines, int i){

		Integer x = Integer.parseInt(fileLines[0]);
		Integer y = Integer.parseInt(fileLines[1]);
		CardialEnum cardial = CardialEnum.valueOf(fileLines[2]);
		robot.setCardial(cardial);
		Coordinate toCoordinate = new Coordinate(x, y);

		if (plateauController.isCoordinateEmpty(plateau, robot.getCoordinate()) && 
					plateauController.coordinateInLimit(plateau, robot.getCoordinate())){ 

			robot.setCoordinate(toCoordinate);
			plateau.getMapCoordinates().put(toCoordinate, robot);
		}
	}
}

