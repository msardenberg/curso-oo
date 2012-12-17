package br.com.missaoMarte.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class ReadFile {
	
	public static List<String> fileToList(String fullFileName) throws IOException{
		
		List<String> fileToLines = new ArrayList<String>();
		FileReader fileReader = new FileReader(fullFileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while(bufferedReader.ready()){
			fileToLines.add(bufferedReader.readLine());
		}
		bufferedReader.close();

		return fileToLines;
	}
}
