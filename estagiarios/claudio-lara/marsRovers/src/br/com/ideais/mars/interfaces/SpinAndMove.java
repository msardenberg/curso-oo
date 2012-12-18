package br.com.ideais.mars.interfaces;

import br.com.ideais.mars.model.Robot;

public interface SpinAndMove  {
	
	public void spinRight(int indexVet);
	public void spinLeft(int indexVet);
	public int[][] move(Robot robot);

}
