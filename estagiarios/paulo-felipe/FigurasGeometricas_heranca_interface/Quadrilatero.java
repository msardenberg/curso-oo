package FigurasGeometricas_heranca_interface;

public class Quadrilatero implements FiguraGeometrica{

    protected double base;
    protected double altura;

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }

    public double calculaArea() {
        return this.base*this.altura;
    }
}