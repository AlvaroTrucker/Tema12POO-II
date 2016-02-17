package introduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestJuego {

	public static void main(String[] args) {
		Juego juego = new Juego("programacion","informatica");
		try (Scanner sc = new Scanner(new File("usuarios.txt"))) {
			String login;
			String password="";
			Usuario u;
			String linea;
			while (sc.hasNextLine()){
				linea = sc.nextLine();
				String [] valores = linea.split("\\s+");
				login = valores[0];
				if (valores.length==2)
					password = valores[1];
				else password = Usuario.generarLoginOPassword();
				try {
					u = new Usuario(login,password);
					juego.addUsuario(u);
					juego.variarPuntuacion((int) (Math.random()*99));
				} catch (usuarioException e) {
					// TODO Auto-generated catch block
					System.out.println(login+" no valido");
				}
			}
			System.out.println("Inicialmente");
			System.out.println(juego);
			System.out.println("Eliminando un usuario");
			//juego.eliminarUsuario();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero inexistente");
		}

	}

}
