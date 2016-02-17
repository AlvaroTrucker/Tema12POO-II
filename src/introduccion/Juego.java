package introduccion;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	private String nombreJuego;
	private String categoria;
	private int puntuacion;
	private List<Usuario> listaUsuarios;
	
	/**
	 * @param nombreJuego
	 * @param categoria
	 */
	public Juego(String nombreJuego, String categoria) {
		this.nombreJuego = nombreJuego;
		this.categoria = categoria;
		this.puntuacion = 0;
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	
	public void addUsuario(Usuario u){
		this.listaUsuarios.add(u);
	}
	
	public void eliminarUsuario(Usuario u){
		this.listaUsuarios.remove(u);
	}
	
	public void variarPuntuacion(int puntuacion){
		this.puntuacion += puntuacion;
	}

	public String getNombreJuego() {
		return nombreJuego;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Juego [nombreJuego=" + nombreJuego + ", categoria=" + categoria + ", puntuacion=" + puntuacion
				+ ", listaUsuarios=" + listaUsuarios + "]";
	}
}
