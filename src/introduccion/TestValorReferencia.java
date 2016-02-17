package introduccion;

public class TestValorReferencia {

	public static void main(String[] args) {
		Persona p = new Persona("juanito",22);
		System.out.println("Antes de llamar a cambiarObjetos: "+p);
		cambiarObjetos(p);
		System.out.println("Despues de llamar a cambiarObjetos: "+p);
		int a = 5;
		int b = 10;
		System.out.printf("%s, %d, %d%n", "Antes del metodo cambiar", a, b);
		cambiarTiposPrimitivos(a, b);
		System.out.printf("%s, %d, %d%n", "Despues del metodo cambiar", a, b);
	}
	
	public static void cambiarObjetos(Persona p1){
		System.out.println("Dentro del metodo cambiar"+p1);
		p1.setNombre("joaquinito");
		p1.setEdad(12);
	}
	
	public static void cambiarTiposPrimitivos(int a, int b){
		int aux = a;
		a = b;
		b = aux;
		System.out.printf("%s, %d, %d%n", "Dentro del metodo cambiar", a, b);
	}

}
