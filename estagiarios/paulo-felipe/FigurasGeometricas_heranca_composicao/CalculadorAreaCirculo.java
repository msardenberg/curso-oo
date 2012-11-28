package FigurasGeometricas_heranca_composicao;

public class CalculadorAreaCirculo extends CalculadorArea{

    public CalculadorAreaCirculo(double raio) {
        super.getArea=Math.pow(raio, 2)*Math.PI;
    }

}