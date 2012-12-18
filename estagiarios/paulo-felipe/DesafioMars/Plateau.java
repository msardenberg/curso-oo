package DesafioMars;

import java.util.ArrayList;
import java.util.List;

public class Plateau {

    private int maxPositionX;
    private int maxPositionY;
    private List<Position> positions;

    public Plateau(int maxPositionX, int maxPositionY) {
        this.maxPositionX = maxPositionX;
        this.maxPositionY = maxPositionY;
        positions = new ArrayList<Position>();
    }

    public void mappingRoversOnPlateau(Robotic robo) throws Exception {
        for (Position p : positions) {
            if (p.equals(robo.getPosition())) {
                throw new Exception("Ganso na hora de pousar");
            }
        }
        positions.add(new Position(robo.getPosition().getX(), robo.getPosition().getY()));
    }

    public List<Position> getPositions() {
        return positions;
    }

    public int getMaxPositionX() {
        return maxPositionX;
    }

    public int getMaxPositionY() {
        return maxPositionY;
    }
}
