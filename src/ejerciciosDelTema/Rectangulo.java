package ejerciciosDelTema;

public class Rectangulo {
	//atributos
	private double ancho = 1;
	private double alto = 1;
	private static int numeroRectangulos;

	public Rectangulo(){
		double ancho = 1;
		double alto = 1;
		numeroRectangulos++;
	}
	
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		numeroRectangulos++;
	}
	
	//metodo para calcular el area del rectangulo
	public double calcularArea(){
		return ancho * alto;
	}
	
	//metodo para calcular el perimetro del rectangulo
	public double calcularPerimetro(){
		return ((ancho*2) + (alto*2));
	}
	
	public static int devolverNumeroRectangulos(){
		return numeroRectangulos;
	}
}
