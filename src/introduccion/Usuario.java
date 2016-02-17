package introduccion;

public class Usuario {
	private String login;
	private String password;
	private static int numeroUsuarios = 0;
	
	/**
	 * @param login
	 * @param password
	 * @throws usuarioException 
	 */
	public Usuario(String login, String password) throws usuarioException {
		if(validarUsuario(login)){
			this.login = login;
			this.password = password;
			numeroUsuarios++;
		}
		else throw new usuarioException();
	}

	public static int getNumeroUsuarios() {
		return numeroUsuarios;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	private static boolean validarUsuario(String login){
		return login.matches("[A-Za-z].*");
	}
	
	public static String generarLoginOPassword(){
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLm"
				+ "MnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!"
				+ "<&{}";
		final int tamanoMaximo = 22;
		String usuario = "";
		int tamano = (int) (Math.random()*(tamanoMaximo+1));
		for (int i = 0; i < tamano; i++) {
			int elegirCaracter = (int) (Math.random()*FUENTE_CARACTERES.length());
			usuario += FUENTE_CARACTERES.charAt(elegirCaracter);
		}
		return usuario;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + "]";
	}
	
	public static void main(String[] args) {
		//probamos el metodo generarUsuario
		for (int i = 0; i < 20; i++) {
			String login = generarLoginOPassword();
			System.out.println(generarLoginOPassword()+" es login valido: "+validarUsuario(login));
		}
	}
	
}

class usuarioException extends Exception{
	
}