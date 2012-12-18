package DesafioMars;

public class Robotic {

    private char direction;
    private Position position;

    public Robotic(int coordenadaX, int coordenadaY, char direcao) throws Exception{
        position = new Position(coordenadaX,coordenadaY);
        setDirection(direcao);
    }

    public void move(){
       if(this.direction=='N'){
           this.position.setY(this.position.getY()+1);
       }else if(this.direction=='S'){
            this.position.setY(this.position.getY()-1);
       }else if(this.direction=='W'){
            this.position.setX(this.position.getX()-1);
       }else if(this.direction=='E'){
            this.position.setX(this.position.getX()+1);
       }
    }
    
    public Position getPosition() {
        return position;
    }

    public void setDirection(char direcao) throws Exception {
            this.direction = direcao;
    }

    public char getDirection() {
        return direction;
    }
}