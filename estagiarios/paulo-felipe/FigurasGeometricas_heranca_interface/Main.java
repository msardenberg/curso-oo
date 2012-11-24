package FigurasGeometricas_heranca_interface;

public class Main {

    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(1);
        System.out.println("Circulo: "+circulo.calculaArea());

        FiguraGeometrica triangulo = new Triangulo(3,4,5);
        System.out.println("Triangulo: "+triangulo.calculaArea());

        FiguraGeometrica quadrilatero = new Quadrilatero(2,5);
        System.out.println("Qaudrilatero: "+quadrilatero.calculaArea());
    }
}