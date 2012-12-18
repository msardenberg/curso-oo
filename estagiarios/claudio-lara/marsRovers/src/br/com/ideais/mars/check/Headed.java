package br.com.ideais.mars.check;

import br.com.ideais.mars.model.Robot;

public enum Headed {
	
	E{
		public int setLastHeaded(Robot robot) {
			return robot.indexValueE();
			
		};
	},
	
	W{
		public int setLastHeaded(Robot robot){
			return robot.indexValueW();
			
		};
	},
	N{
		public int setLastHeaded(Robot robot){
			return robot.indexValueN();
			
			
		};
		
	},
	S{
		public int setLastHeaded(Robot robot){
			return robot.indexValueS();
							
		};
	};
	
	public Robot checkDo (Robot robot){
			robot.setLastHead(robot.getLastHead());
			System.out.println("deu ruim!");
			return robot;
		}
	public abstract int setLastHeaded(Robot robot);		
	
		
	}
	
