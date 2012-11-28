package br.com.ideais.cavedonoo;

import java.util.Scanner;

public class Teclado {

	public static double pegaTeclado(){
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
	}
	public static String pegaTecladoSwitch(){
		Scanner tecladoString = new Scanner(System.in);
		return tecladoString.nextLine();
	}
}
