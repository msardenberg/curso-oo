
public class FigurasGeometricas {
	
	public static void main(String[] args){
		Circulo circulo = new Circulo(2);
		circulo.area();
		
		Triangulo triangulo = new Triangulo(3,4,5);
		triangulo.area();
		
		Quadrilatero quadrado = new Quadrilatero(2);
		quadrado.area();
		
		Quadrilatero retangulo = new Quadrilatero(2,3);
		retangulo.area();
		
		Quadrilatero trapezio = new Quadrilatero(2,3,4);
		trapezio.area();
		
	}
	

}
