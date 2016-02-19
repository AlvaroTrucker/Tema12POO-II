package ejerciciosDelTema;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(2.0,2.0);
		Rectangulo r2 = new Rectangulo(3.0,3.0);
		Rectangulo r3 = new Rectangulo();
		
		System.out.println("Area r1: "+r1.calcularArea());
		System.out.println("Perimetro r1: "+r1.calcularPerimetro());
		
		System.out.println("Area r2: "+r2.calcularArea());
		System.out.println("Perimetro r2: "+r2.calcularPerimetro());
		
		System.out.println("Area r3: "+r3.calcularArea());
		System.out.println("Perimetro r3: "+r3.calcularPerimetro());
		
		System.out.println("Numero de rectangulos: "+Rectangulo.devolverNumeroRectangulos());

	}
}
