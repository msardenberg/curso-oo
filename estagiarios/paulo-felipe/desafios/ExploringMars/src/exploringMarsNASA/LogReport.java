package exploringMarsNASA;

import java.util.ArrayList;
import java.util.List;

public class LogReport {
	public static List<String> logs = new ArrayList<String>();
	
	public void addLog(String log){
		logs.add(log);
	}
	
	public void showLog(){
		for(String log : logs){
			System.out.println(log+"\n");
		}
	}
}
