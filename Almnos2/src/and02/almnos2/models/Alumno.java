package and02.almnos2.models;

import java.io.Serializable;

public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String genero;
	
	
	public Alumno(String nombre, String apellido, String genero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}
	
	
	public String toString() {
		return "Alumno:" + nombre + "," + apellido + " genero: " + genero;		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}	
}
