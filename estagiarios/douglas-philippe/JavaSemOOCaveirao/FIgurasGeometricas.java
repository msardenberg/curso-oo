public class FigurasGeometricas {

	public static void main(String[] args) {
		double[] raio={2,3.5,2.147};
		final double PI=3.14;
		double[] base={2,3};
		double[] altura={2,7};
		double[] a={3,1};
		double[] b={4,1};
		double[] c={5,1};
		double area, s;
		
		for(int i=0;i<3;i++){
			area=raio[i]*raio[i]*PI;
			System.out.println("Area do circulo"+(i+1)+" "+ area);
		}
		
		for(int j=0;j<2;j++){
			area=base[j]*altura[j];
			System.out.println("Area do Quadrilatero"+(j+1)+" "+area);
		}
		
		for(int k=0;k<2;k++){
			s=(a[k]+b[k]+c[k])/2;
			System.out.println("Triangulo"+(k+1)+" "+ Math.sqrt(s*(s-a[k])*(s-b[k])*(s-c[k])));
		}
	}
}

