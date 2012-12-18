package DesafioMars;

public class MergeInstructionAndDirection implements ExceptionsMars{

    public char mergeRightInstruction(char direction) throws Exception{
        if (direction == 'N') {
            return 'E';
        } else if (direction == 'S') {
            return 'W';
        } else if (direction == 'E') {
            return 'S';
        } else if (direction == 'W') {
            return 'N';
        } else{
            launchException();
        }
        return 0;
    }
    public char mergeLeftInstruction(char direction) throws Exception{
            if (direction == 'N') {
                return 'W';
            } else if (direction == 'S') {
                return 'E';
            } else if (direction == 'E') {
                return 'N';
            } else if (direction == 'W') {
                return 'S';
            } else{
                launchException();
            }
            return 0;
    }

    public void launchException() {
        throw new UnsupportedOperationException("Invalid Direction Found!!");
    }
}