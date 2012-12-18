package DesafioMars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class ProcessingFile {

    private Scanner read;
    private Formatter write;
    private ChecksCommand verify;
    private static Plateau positions;
  
    
    public ProcessingFile(String name) throws FileNotFoundException {
        read = new Scanner(new File(name));
        write = new Formatter(new File("OUTPUT"+name));
        verify = new ChecksCommand();
    }
    
    public void processa() throws Exception{
        List<Robotic> robotic = new ArrayList<Robotic>();
        String plateauSize,line,command;
        int sizeX, sizeY;
        plateauSize=read.nextLine();
        String[] temp = plateauSize.split(" ");
        sizeX=Integer.parseInt(temp[0]);
        sizeY=Integer.parseInt(temp[1]);
        int coordinateX=0,coordinateY=0;
        char direction;
        Robotic robo;
        int cont=1;
        positions = new Plateau(sizeX,sizeY);
        while(read.hasNextLine()){
            line=read.nextLine();
            String[] temp2 = line.split(" ");
            coordinateX=Integer.parseInt(temp2[0]);
            coordinateY=Integer.parseInt(temp2[1]);
            direction=temp2[2].charAt(0);
            command=read.nextLine();
            robo = new Robotic(coordinateX,coordinateY,direction);
            try{
            	verify.checks(command,robo,positions);
            }catch(Exception e){
            	System.out.println(e.getMessage()+"\nRobotic Rover ["+cont+"] cannot continue with his mission!\n"
                        + "Robotic Rover will not be processed in output file!\n");
            	cont ++;
            	continue;
            }
            positions.mappingRoversOnPlateau(robo);
            robotic.add(robo);
            cont ++;
        }
        writeDatasOfRovers(robotic);
        read.close();
    }
    
    private void writeDatasOfRovers(List<Robotic> robos){
        try{
            for (Robotic r : robos) {
                if(robos.indexOf(r)== robos.size()-1){
                    write.format("%s",r.getPosition().getX()+" "+r.getPosition().getY()+" "+r.getDirection());
                }else{
                    write.format("%s",r.getPosition().getX()+" "+r.getPosition().getY()+" "+r.getDirection()+"\n");
                }
            }
            write.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public List<Position> getPositions() {
        return positions.getPositions();
    }
}