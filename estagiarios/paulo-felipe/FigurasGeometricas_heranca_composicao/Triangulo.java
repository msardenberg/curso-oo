package FigurasGeometricas_heranca_composicao;

public class Triangulo extends FiguraGeometrica{

    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double perim; //semiPerimetro
    
    public Triangulo(double a,double b, double c) {
        this.lado1=a;
        this.lado2=b;
        this.lado3=c;
        perim = (this.lado1+this.lado2+this.lado3)/2d;
        super.calculadorArea=new CalculadorAreaTriangulo(this.lado1,this.lado2,this.lado3,this.perim);
    }

}
