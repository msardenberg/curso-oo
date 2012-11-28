package FigurasGeometricas_heranca_composicao;

public class CalculadorAreaTriangulo extends CalculadorArea{
    
    public CalculadorAreaTriangulo(double lado1, double lado2, double lado3, double p) {
       super.getArea=Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }
       
}