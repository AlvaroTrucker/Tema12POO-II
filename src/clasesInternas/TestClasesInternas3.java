package clasesInternas;

public class TestClasesInternas3 {

	public static void main(String[] args) {
		Externa2 e = new Externa2();
		
		//recogemos los dos valores de la coleccion
		//int[] coleccion

	}

}
class Externa2{
	private int variableInstanciaExterna = 2;
	public int[] metodo(){
		int[] valoresADevolver = new int[2];
		class Interna2{
			private int variableInstanciaInterna = 3;
		}
		Interna2 in = new Interna2();
		valoresADevolver[0] = variableInstanciaExterna;
		valoresADevolver[1] = in.variableInstanciaInterna;
		return valoresADevolver;
	}
}