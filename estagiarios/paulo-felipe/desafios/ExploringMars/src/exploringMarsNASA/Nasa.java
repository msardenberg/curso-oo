package exploringMarsNASA;

public class Nasa {
	
	public static void main(String[] args) throws Exception{
		
		MarsBase marsBase = new MarsBase();
		marsBase.reciveInformationAndPrepareSquad("Nasa Instructions.txt");
		marsBase.startLandingRovers();
		marsBase.printRoversOnMars();
		marsBase.getLogReport().showLog();
	}
}
