package FigurasGeometricas_heranca_composicao;

public class Quadrilatero extends FiguraGeometrica{

    protected double base;
    protected double altura;

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
        super.calculadorArea = new CalculadorAreaQuadrilatero(this.base,this.altura);

    }
}