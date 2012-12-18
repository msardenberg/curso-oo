package exploringMarsNASA;


public class RoboticRover {
	
	
	private String name;
    private Position position;
    private char direction;
    private String command;
    private static int code = 1;
    
//-------CONSTRUCTORS -------
    
    public RoboticRover(){
    	
    }
    
    public RoboticRover (int coordinateX, int coordinateY, char direction, String command) throws Exception {
        this.name= "XPTO-"+code;
        position = new Position();
        position.setCoordinateX(coordinateX);
        position.setCoordinateY(coordinateY);        
        setDirection(direction);
        setCommand(command);
        code++;
    }
    
//-------- MÉTODOS --------   
    
    public char spinRover(char instruction,char direction){
        if(instruction=='L'){
            if(direction=='N'){
                return 'W';
            }else if(direction=='S'){
                return 'E';
            }else if(direction=='E'){
                return 'N';
            }else if(direction=='W'){
                return 'S';
            }
        }
        else if(instruction=='R'){
        	if(direction=='N'){
        		return 'E';
        	}else if(direction=='S'){
        		return 'W';
        	}else if(direction=='E'){
                return 'S';
            }else if(direction=='W'){
                return 'N';
            }
        }
       return 0;
    }
    
    public int[] nextMove(){
    	int auxX = this.position.getCoordinateX();
    	int auxY = this.position.getCoordinateY();
        if(this.direction=='N'){
            auxY++;
        }else if(this.direction=='S'){
            auxY--;
        }else if(this.direction=='W'){
            auxX--;
        }else if(this.direction=='E'){
            auxX++;
        }
        int[] result = {auxX,auxY}; 
        
        return result;
     }
    
//------- SETTERS -------
    
    public void setCoordinateX (int coordinateX){
    	this.position.setCoordinateX(coordinateX);
    }
    public void setCoordinateY (int coordinateY){
    	this.position.setCoordinateY(coordinateY);
    }
    public void setDirection(char direction) throws Exception{
    	 if(direction!= 'N' && direction!= 'S' && direction!= 'W' && direction!= 'E'){
             throw new Exception("Direção invalida!");
         }
    	 this.direction = direction;
    }
    public void setCommand(String command) {
		this.command = command;
	}
    
    @Override
    public String toString() {
    	String rover = "Rover name: "+name+
    			     "\nRover Co-ordinate X: "+position.getCoordinateX()+
    			     "\nRover Co-ordinate Y: "+position.getCoordinateY()+
			         "\nRover Direction: "+ direction+"\n";
    	return rover;
    }
    
//------- GETTERS -------
    
    public int getCoordinateX(){
    	return position.getCoordinateX();
    }
    public int getCoordinateY(){
    	return position.getCoordinateY();
    }
    public int getCode(){
    	return code;
    }
    public String getName(){
    	return name;
    }
    public char getDirection(){
    	return direction;
    }

	public String getCommand() {
		return command;
	}
}