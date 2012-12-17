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
	
	
	public static void command(Robot robot, CommandEnum direction){
	 
		if(CommandEnum.M.equals(direction)){
			if(robot.getCardial().equals(CardialEnum.N)){
				robot.getCoordinate().setY(robot.getCoordinate().getY()+1);
					
			}else if(robot.getCardial().equals(CardialEnum.S)){
				robot.getCoordinate().setY(robot.getCoordinate().getY()-1);
				
			}else if(robot.getCardial().equals(CardialEnum.E)){
				robot.getCoordinate().setX(robot.getCoordinate().getX()+1);
				
			}else if(robot.getCardial().equals(CardialEnum.W)){
				robot.getCoordinate().setX(robot.getCoordinate().getX()-1);
			}
		
		}else if(CommandEnum.L.equals(direction)){
			
			if(robot.getCardial().equals(CardialEnum.N)){
				robot.setCardial(CardialEnum.W);
			}else if(robot.getCardial().equals(CardialEnum.S)){
				robot.setCardial(CardialEnum.E);
			}else if(robot.getCardial().equals(CardialEnum.E)){
				robot.setCardial(CardialEnum.N);
			}else if(robot.getCardial().equals(CardialEnum.W)){
				robot.setCardial(CardialEnum.S);
			}
		
		}else if(CommandEnum.R.equals(direction)){
			
			if(robot.getCardial().equals(CardialEnum.N)){
				robot.setCardial(CardialEnum.E);
			}else if(robot.getCardial().equals(CardialEnum.S)){
				robot.setCardial(CardialEnum.W);
			}else if(robot.getCardial().equals(CardialEnum.E)){
				robot.setCardial(CardialEnum.S);
			}else if(robot.getCardial().equals(CardialEnum.W)){
				robot.setCardial(CardialEnum.N);
			}
		}
		
		System.out.println("Robo: " + robot.getName() + " " + robot.getCoordinate() + " " + robot.getCardial());
	}

	
	public static void moveRobotByCoordinate(Plateau plateau, Robot robot, String[] fileLines, int i){
		Integer x = Integer.parseInt(fileLines[0]);
		Integer y = Integer.parseInt(fileLines[1]);
		CardialEnum cardial = CardialEnum.valueOf(fileLines[2]);
		robot.setCardial(cardial);
		Coordinate toCoordinate = new Coordinate(x, y);

		if (PlateauController.wayIsClearByXY(plateau, robot.getCoordinate(), toCoordinate) ||
				PlateauController.wayIsClearByYX(plateau, robot.getCoordinate(), toCoordinate)) {
			
			robot.setCoordinate(toCoordinate);
			plateau.getMapCoordinates().put(toCoordinate, robot);
		}
	}
}

