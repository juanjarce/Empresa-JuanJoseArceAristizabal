package co.edu.uniquindio.empresa.model;

import java.util.Objects;

public class Cliente extends Persona{
	
	private String telefono;
	
	public Cliente() {
		
	}
	/**
	 * Constructor de la clase Cliente
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param edad
	 * @param telefono
	 */
	public Cliente(String nombres, String apellidos, String identificacion, int edad, String telefono) {
		super(nombres, apellidos, identificacion, edad);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombres=" + getNombres() + ", apellidos=" + getApellidos() + ", identificacion=" + getIdentificacion()
				+ ", edad=" + getEdad() + ", telefono=" + telefono + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(getIdentificacion());
	}
}
