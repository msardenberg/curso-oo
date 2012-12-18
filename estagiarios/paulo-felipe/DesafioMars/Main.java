package DesafioMars;

import java.io.FileNotFoundException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, Exception{
        ProcessingFile processa = new ProcessingFile("plateau.txt");
        processa.processa();
        System.out.println(processa.getPositions());
    } 
}