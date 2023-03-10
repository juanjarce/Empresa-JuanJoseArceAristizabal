package co.edu.uniquindio.empresa.model;

import java.util.Objects;

public class Empleado extends Persona{

	private Double salario;
	
	public Empleado() {
		
	}
	/**
	 * Constructor para la clase Empleado
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param edad
	 * @param salario
	 */
	public Empleado(String nombres, String apellidos, String identificacion, int edad, Double salario) {
		super(nombres, apellidos, identificacion, edad);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombres=" + getNombres() + ", apellidos=" + getApellidos() + ", identificacion=" + getIdentificacion()
				+ ", edad=" + getEdad() + ", sueldo=" + salario + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(getIdentificacion());
	}
}
