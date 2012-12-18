package exploringMarsNASA;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MarsBase {
	
	private LogReport logReport = new LogReport();
	private static Mars mars;
	private List<RoboticRover> roversSquad = new ArrayList<RoboticRover>();
	
	public List<RoboticRover> getRoversOnMars(){
		return mars.getPlateau().getRoversInPlateau();
	}
	
	public LogReport getLogReport(){
		return logReport;
	}
	
	public void reciveInformationAndPrepareSquad (String name) throws Exception {
		
        String plateauSize,line ,command;
        int sizeX, sizeY;
        Scanner instructions = new Scanner(new File(name));
        plateauSize=instructions.nextLine();
        String[] temp = plateauSize.split(" ");
        sizeX=Integer.parseInt(temp[0]);
        sizeY=Integer.parseInt(temp[1]);
        mars = new Mars(sizeX,sizeY);
        int cooedinateX=0,coordinateY=0;
        char direction;
      
        while(instructions.hasNextLine()){
            line=instructions.nextLine();
            String[] temp2 = line.split(" ");
            cooedinateX=Integer.parseInt(temp2[0]);
            coordinateY=Integer.parseInt(temp2[1]);
            direction=temp2[2].charAt(0);
            command=instructions.nextLine();
            roversSquad.add(new RoboticRover(cooedinateX,coordinateY,direction, command));
        }
        instructions.close(); 
    }
	
	public void startLandingRovers(){
		for (RoboticRover rover : roversSquad){
			try{
				mars.addRoboticRover(rover);
				processCommandLine(rover);
				
			}catch(Exception e){
				logReport.addLog(e.getMessage());
			}
		}
	}
	
	public void printRoversOnMars(){
		for(RoboticRover rover : mars.getPlateau().getRoversInPlateau()){
			System.out.println(rover.toString());
		}
	}
	
	public static void processCommandLine (RoboticRover rover) throws Exception{
		
	       int indice=0;
	       String command = rover.getCommand();
	    
	       while(indice<command.length()){
	           if(command.charAt(indice)=='M'){
	               int[] nextMove = rover.nextMove();
	               if (nextMove[0]<0||nextMove[0]>mars.getPlateau().getSizeX()|| nextMove[1]<0 || nextMove[1] > mars.getPlateau().getSizeY()){
	            	   
	            	   throw new Exception("Robotic Rover "+rover.getName()+" stops in postion "+rover.getCoordinateX()+" "+
	            			   rover.getCoordinateY()+" because the position "+nextMove[0]+" "+nextMove[1]+ " is out of Mars Plateau limits");
	               }
	               else if(mars.getPlateau().checkPositionIsFree(nextMove[0], nextMove[1])){
	            	   rover.setCoordinateX(nextMove[0]);
	            	   rover.setCoordinateY(nextMove[1]);
	               }
	               else {
	            	   throw new Exception("Robotic Rover "+rover.getName()+" stops in postion "+rover.getCoordinateX()+" "+
	            			   rover.getCoordinateY()+" because there is an rover in position "+nextMove[0]+" "+nextMove[1]+
	            			   " blocking his way");
	               }
	           }else if(command.charAt(indice)=='L' || command.charAt(indice) =='R'){
	               rover.setDirection(rover.spinRover(command.charAt(indice),rover.getDirection()));
	           }
	           indice++;
	       }
	       
	}
}
