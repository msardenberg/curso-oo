
package marsRoboticRover;

import java.io.FileNotFoundException;
import java.io.IOException;
import marsRoboticRover.RoboticRovers.Robot;
import marsRoboticRover.plateauOnMars.Plateau;

public class RobosMain {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        ReceptorInstruction receptor = new ReceptorInstruction("rota");
        Plateau plateau = new Plateau(receptor.sizePlateau());
        Robot robot;
        
        while(receptor.hasInstruction()){            
            robot = new Robot(receptor.positionRobot());
            robot.executeInstrution(receptor.instruction(), plateau);
            plateau.saveRobot(robot);
            System.out.println("-" + robot.toString());
        }
        plateau.showPlateau();
        receptor.endInstruction();
    }
}
