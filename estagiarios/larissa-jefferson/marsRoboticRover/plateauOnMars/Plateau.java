package marsRoboticRover.plateauOnMars;

import marsRoboticRover.RoboticRovers.Robot;

public class Plateau {

    Robot[][] plateau;

    public Plateau(int[] sizePlateau) {
        plateau = new Robot[sizePlateau[0] + 1][sizePlateau[1] + 1];
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                plateau[i][j] = null;
            }
        }
    }

    public void saveRobot(Robot robot) {
        plateau[robot.x][robot.y] = robot;
    }

    public boolean validate(int x, int y) throws Exception {
        if (plateau[x][y] != null) {
            return false;
        } 
        if((x>plateau.length || y>plateau[0].length)||(x<0 || y<0)){
            return false;
        }
        return true;
    }

    public void showPlateau() {
        for (int i = plateau.length-1; i > 0; i--) {
            for (int j = plateau[0].length-1; j > 0; j--) {
                if(plateau[i][j] == null)
                    System.out.print("[ * ]");
                else
                    System.out.print(plateau[i][j].toString());
            }
            System.out.println("");
        }
    }
}
