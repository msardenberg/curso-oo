package FigurasGeometricas_heranca_composicao;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica circulo = new Circulo(1);
        System.out.println("Circulo: "+circulo.area());

        FiguraGeometrica triangulo = new Triangulo(3,4,5);
        System.out.println("Triangulo: "+triangulo.area());

        FiguraGeometrica quadrilatero = new Quadrilatero(2,5);
        System.out.println("Qaudrilatero: "+quadrilatero.area());

    }
}