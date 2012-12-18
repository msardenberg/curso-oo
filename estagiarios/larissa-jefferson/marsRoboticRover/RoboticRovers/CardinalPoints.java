package marsRoboticRover.RoboticRovers;

public class CardinalPoints {
    Orientation norte;
    Orientation sul;
    Orientation leste;
    Orientation oeste;
    
    CardinalPoints(){
        sul= new Orientation("E", "W");
        norte = new Orientation("W", "E");
        oeste = new Orientation("S", "N");
        leste = new Orientation("N", "S");
    }
    
    public String getEsquerda(String coordenada){
        String ponto = "";
        switch(coordenada.charAt(0)){
            case 'N':
                ponto = norte.esquerda;
                break;
            case 'S':
                ponto = sul.esquerda;
                break;
            case 'E':
                ponto = leste.esquerda;
                break;
            case 'W':
                ponto = oeste.esquerda;
                break;
        }
        return ponto;
    }
    
    public String getDireita(String coordenada){
        String ponto = "";
        switch(coordenada.charAt(0)){
            case 'N':
                ponto = norte.direita;
                break;
            case 'S':
                ponto = sul.direita;
                break;
            case 'E':
                ponto = leste.direita;
                break;
            case 'W':
                ponto = oeste.direita;
                break;
        }
        return ponto;
    }
}
