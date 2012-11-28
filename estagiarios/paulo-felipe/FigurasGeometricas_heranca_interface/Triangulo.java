package FigurasGeometricas_heranca_interface;

public class Triangulo implements FiguraGeometrica{

    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double perim; //semiPerimetro
    
    public Triangulo(double a,double b, double c) {
        this.lado1=a;
        this.lado2=b;
        this.lado3=c;
        perim = (this.lado1+this.lado2+this.lado3)/2d;
    }

    public double calculaArea() {
        return Math.sqrt(this.perim*
                        (this.perim-this.lado1)*
                        (this.perim-this.lado2)*
                        (this.perim-this.lado3));
    }

}
