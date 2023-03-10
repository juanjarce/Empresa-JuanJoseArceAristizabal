package co.edu.uniquindio.empresa.model;

import java.util.Objects;

public abstract class Persona {
	
	private String nombres;
	private String apellidos;
	private String identificacion;
	private Integer edad;

	public Persona() {
		
	}
	/**
	 * Constructor de la clase Persona
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param edad
	 */
	public Persona(String nombres, String apellidos, String identificacion, Integer edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.edad = edad;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(identificacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(identificacion, other.identificacion);
	}
	
	
	
}
