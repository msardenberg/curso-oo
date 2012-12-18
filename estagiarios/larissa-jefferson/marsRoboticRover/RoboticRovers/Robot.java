package marsRoboticRover.RoboticRovers;

import marsRoboticRover.RoboticRovers.CardinalPoints;
import marsRoboticRover.plateauOnMars.Plateau;

public class Robot {

    public Integer x;
    public Integer y;
    public String orientation;
    public Orientation orientationPoint;

    public Robot(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation + "";
        orientationPoint = new Orientation(new CardinalPoints().getEsquerda(this.orientation),
                new CardinalPoints().getDireita(this.orientation));
    }

    public Robot(String[] posicaoRobo) {
        this.x = Integer.parseInt(posicaoRobo[0]);
        this.y = Integer.parseInt(posicaoRobo[1]);
        this.orientation = posicaoRobo[2];
        orientationPoint = new Orientation(new CardinalPoints().getEsquerda(orientation),
                new CardinalPoints().getDireita(orientation));
    }

    private void turnLeft() {
        orientation = orientationPoint.esquerda;
        orientationPoint = new Orientation(new CardinalPoints().getEsquerda(orientation),
                new CardinalPoints().getDireita(orientation));
    }

    private void turnRight() {
        orientation = orientationPoint.direita;
        orientationPoint = new Orientation(new CardinalPoints().getEsquerda(orientation),
                new CardinalPoints().getDireita(orientation));
    }
    
    private void move(Plateau plato) throws Exception {
        switch (orientation.charAt(0)) {
            case 'E':
                if (plato.validate(x + 1, y)) {
                    x++;
                }
                break;
            case 'W':
                if (plato.validate(x - 1, y)) {
                    x--;
                }
                break;
            case 'N':
                if (plato.validate(x, y + 1)) {
                    y++;
                }
                break;
            case 'S':
                if (plato.validate(x, y - 1)) {
                    y--;
                }
                break;
        }
    }
    

    public void executeInstrution(String instrucoes, Plateau plano) throws Exception {
        for (int i = 0; i < instrucoes.length(); i++) {
            switch (instrucoes.charAt(i)) {
                case 'L':
                    turnLeft();
                    break;
                case 'R':
                    turnRight();
                    break;
                case 'M':
                    move(plano);
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return ("[" + x + " " + y + " " + orientation + "]");
    }
}
