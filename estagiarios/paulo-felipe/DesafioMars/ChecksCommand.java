package DesafioMars;


public class ChecksCommand implements ExceptionsMars{

    MergeInstructionAndDirection merge;
    ChecksPosition checksPosition;

    public ChecksCommand() {
        merge = new MergeInstructionAndDirection();
        checksPosition = new ChecksPosition();
    }

    public void checks(String command, Robotic robot,Plateau plateau) throws Exception{
        int index=0;
        System.out.println("-> "+robot.getPosition().getX()+" "+robot.getPosition().getY()+" "+robot.getDirection());
        while(index<command.length()){
            if(checksPosition.isValidPosition(robot, plateau)){
                if(command.charAt(index)=='M'){
                    if(checksPosition.nextPositionIsValid(robot, plateau)){
                        robot.move();
                        System.out.println(command.charAt(index)+": "+robot.getPosition().getX()+" "+robot.getPosition().getY()+" "+robot.getDirection());
                    }
                }else if(command.charAt(index)=='L'){
                    robot.setDirection(merge.mergeLeftInstruction(robot.getDirection()));
                    System.out.println(command.charAt(index)+": "+robot.getPosition().getX()+" "+robot.getPosition().getY()+" "+robot.getDirection());
                }else if(command.charAt(index)=='R'){
                    robot.setDirection(merge.mergeRightInstruction(robot.getDirection()));
                    System.out.println(command.charAt(index)+": "+robot.getPosition().getX()+" "+robot.getPosition().getY()+" "+robot.getDirection());
                }else{
                    launchException();
                }
            }
            index++;
        }
        System.out.println();
    }

    public void launchException() {
        throw new UnsupportedOperationException("Invalid Command Found!!");
    }    
}