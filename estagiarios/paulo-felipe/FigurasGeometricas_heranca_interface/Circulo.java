package FigurasGeometricas_heranca_interface;

public class Circulo implements FiguraGeometrica{

    protected double raio;

    public Circulo(double raio) {
        this.raio=raio;
    }

    public double calculaArea() {
        return Math.pow(this.raio, 2)*Math.PI;
    }
    
}