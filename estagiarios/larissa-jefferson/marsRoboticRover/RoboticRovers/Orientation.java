package marsRoboticRover.RoboticRovers;

public class Orientation {
    String direita;
    String esquerda;
    
    Orientation(){
    }
    
    Orientation(String pontoEsquerda, String pontoDireita) {
        esquerda = pontoEsquerda;
        direita = pontoDireita;
    }
}
