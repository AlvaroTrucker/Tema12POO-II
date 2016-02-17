package introduccion;

import java.util.ArrayList;
import java.util.List;

public class TestUsuario {

	public static void main(String[] args) {
		List<Usuario> usuariosGenerados = new ArrayList<Usuario>();
		List<Usuario> usuariosValidos = new ArrayList<Usuario>();
		while (usuariosValidos.size() != 5){
			String login = Usuario.generarLoginOPassword();
			String password = Usuario.generarLoginOPassword();
			try {
				Usuario u = new Usuario(login, password);
				usuariosValidos.add(u);
			} catch (usuarioException e) {
				// TODO Auto-generated catch block
				System.out.println("Login incorrecto: "+login);
			}
		}
		System.out.println(usuariosValidos);
		System.out.println("Nº de objetos creados: "+Usuario.getNumeroUsuarios());
	}

}
