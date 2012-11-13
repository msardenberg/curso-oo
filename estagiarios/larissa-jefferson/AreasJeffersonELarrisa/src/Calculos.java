

public class Calculos {

	static final double PI=3.14;
	
	public static void main(String[] args){
				
		System.out.println("A area do circulo1: " + circulo(2.0));
		System.out.println("A area do circulo2: " + circulo(3.5));
		System.out.println("A area do circulo3: " + circulo(2.147) +"\n");
		
		System.out.println("A area do triangulo1: " + triangulo(3,4,5));
		System.out.println("A area do triangulo2: " + triangulo(1,1,1)+"\n");
		
		System.out.println("A area do quadrilatero1: " + quadrilatero(2, 2));
		System.out.println("A area do quadrilatero2: " + quadrilatero(3, 7)+"\n");
	}
		public static double circulo(double raio){
			return PI*Math.pow(raio,2); 	
		}
		
		public static double triangulo(double lado1, double lado2, double lado3){
			double semiPerimetro = ((lado1+lado2+lado3)/2);
			return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) *(semiPerimetro - lado2) *(semiPerimetro - lado3));
		}
		
		public static double quadrilatero(double lado1, double lado2){
			return lado1*lado2;
			
		}
		
	
}
