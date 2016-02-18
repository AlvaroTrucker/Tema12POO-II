package clasesInternas;

public class TestClasesInternas2 {

	public static void main(String[] args) {
		Externa1 e = new Externa1();
		Externa1.Interna1 i = new Externa1.Interna1();
		System.out.println(i.getterVariableClase());

	}

}
class Externa1{
	private int variableInstancia = 5;
	private static int variableClase = 6;
	public static class Interna1{
		/*public int getterVariableInstancia(){
			return variableInstancia;
		} no puedo acceder desde un miembro estatico
		a un miembro no estatico */
		public int getterVariableClase(){
			return variableClase;
		}
	}
}