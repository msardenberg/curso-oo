package br.com.ideais.mars.model;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import br.com.ideais.mars.check.Check;
import br.com.ideais.mars.check.Headed;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Check check = new Check();		
		Scanner teclado = new Scanner(System.in);
		Robot robot = new Robot();
		
		System.out.println("entre com o X do mapa");
		MapGrid.getInstance().setSizeX(teclado.nextInt());
		System.out.println("entre com o Y do mapa");
		MapGrid.getInstance().setSizeY(teclado.nextInt());
		
		Scanner tecladoRobot = new Scanner(System.in);
		
		robot.setFirstInstructions(tecladoRobot.nextLine());
		
		char[] getInstructions = robot.getFirstInstructions().toCharArray(); 
		
					
		robot.setPositionX(Integer.parseInt( robot.getFirstInstructions().substring(0,1) ));
		robot.setPositionY(Integer.parseInt( robot.getFirstInstructions().substring(1,2) ));
		robot.setLastHead(String.valueOf(getInstructions[2]));
		
		Scanner tecladoInstructionsToRobot = new Scanner(System.in);
		
		robot.setInstructions(tecladoInstructionsToRobot.nextLine());
		
		check.checkGridX(robot.getPositionX());
		check.checkGridY(robot.getPositionY());
		
	//	check.checkBorn(robot.getPositionX(), robot.getPositionY());
		
		getInstructions = robot.getInstructions().toCharArray(); 
			
			for(int i=0;i<robot.getInstructions().length();i++){
												
				if(getInstructions[i] == 'L'){
					Headed headed = Enum.valueOf(Headed.class, robot.getLastHead());
					int num = headed.setLastHeaded(robot);
					robot.spinLeft(num);
					
				}
				if(getInstructions[i] == 'R'){
					Headed headed = Enum.valueOf(Headed.class, robot.getLastHead());
					int num = headed.setLastHeaded(robot);
					robot.spinRight(num);
				
				}
				if(getInstructions[i] == 'M'){
					
					robot.move(robot);
				
			}
			}
		System.out.println(robot.getLastHead());	
		System.out.println(robot.getPositionX());
		System.out.println(robot.getPositionY());
			
		OutputStream outPut = new FileOutputStream("Output");
		OutputStreamWriter outputWriter = new OutputStreamWriter(outPut);
		BufferedWriter bufferedWriter = new BufferedWriter(outputWriter);
		bufferedWriter.write(robot.getPositionX()+" "+robot.getPositionY()+" "+" "+robot.getLastHead());  
		bufferedWriter.close();

	}


		
	}
	

