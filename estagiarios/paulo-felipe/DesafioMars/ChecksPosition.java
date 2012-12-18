package DesafioMars;

public class ChecksPosition {

    public boolean isValidPosition(Robotic robotic, Plateau plateau) throws Exception {
        if (plateau.getPositions().isEmpty() && this.isInsideInLimits(robotic, plateau)) {
            return true;
        } else {
            this.isInsideInLimits(robotic, plateau);
            for (Position position : plateau.getPositions()) {
                if (robotic.getPosition().getX() == position.getX() && robotic.getPosition().getY() == position.getY()) {
                    throw new Exception("Position [" + robotic.getPosition().getX() + "," + robotic.getPosition().getY() + "] already have a Robot");
                }
            }
            return true;
        }
    }

    public boolean isInsideInLimits(Robotic robotic, Plateau plateau) throws Exception {
        if (robotic.getPosition().getX() > plateau.getMaxPositionX() || robotic.getPosition().getY() > plateau.getMaxPositionY()
                || robotic.getPosition().getX() < 0 || robotic.getPosition().getY() < 0) {
            throw new Exception("Position ["+ robotic.getPosition().getX() + "," + robotic.getPosition().getY() + "] Out Of Bounds Of Plateau!");
        }
        return true;
    }

    public boolean nextPositionIsValid(Robotic robotic, Plateau plateau) throws Exception {
        Robotic clone = new Robotic(robotic.getPosition().getX(), robotic.getPosition().getY(), robotic.getDirection());
        clone.move();
        if (isValidPosition(clone, plateau)) {
            return true;
        }
        return false;
    }
}