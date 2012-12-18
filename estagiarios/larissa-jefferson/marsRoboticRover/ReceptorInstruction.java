package marsRoboticRover;

import java.io.*;

public class ReceptorInstruction {

    private BufferedReader file;
    private boolean hasInstruction;

    ReceptorInstruction(String name) throws FileNotFoundException {
        this.file = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        this.hasInstruction = true;
    }
        
    boolean hasInstruction() throws IOException {
        if (!file.ready()) {
            this.hasInstruction = false;
        }
        return this.hasInstruction;
    }

    public int[] sizePlateau() throws IOException {
        int[] dimension = new int[2];
        String[] instruction = file.readLine().split(" ");
        for (int i = 0; i < dimension.length; i++) {
            dimension[i] = Integer.parseInt(instruction[i]);
        }
        return dimension;
    }

    public String[] positionRobot() throws IOException {
        String[] posicoes = file.readLine().split(" ");
        return posicoes;
    }

    public String instruction() throws IOException {
        String instrucao = file.readLine();
        return instrucao;
    }

    public void endInstruction() throws IOException {
        file.close();
    }
}
