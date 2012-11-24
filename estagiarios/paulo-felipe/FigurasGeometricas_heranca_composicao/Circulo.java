package FigurasGeometricas_heranca_composicao;

public class Circulo extends FiguraGeometrica{

    protected double raio;

    public Circulo(double raio) {
        this.raio=raio;
        super.calculadorArea = new CalculadorAreaCirculo(this.raio);
    }

}