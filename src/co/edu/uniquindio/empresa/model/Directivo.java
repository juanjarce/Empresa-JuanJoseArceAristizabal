package co.edu.uniquindio.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{

	private String categoria;
	public List<Empleado> listaEmpleadosSubordinados;
	
	public Directivo() {
		
	}
	/**
	 * Constructor de la clase Directivo
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param edad
	 * @param salario
	 * @param categoria
	 */
	public Directivo(String nombres, String apellidos, String identificacion, int edad, double salario, String categoria) {
		super(nombres, apellidos, identificacion, edad, salario);
		this.categoria = categoria;
		this.listaEmpleadosSubordinados = new ArrayList<Empleado>();
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Empleado> getListaEmpleadosSubordinados() {
		return listaEmpleadosSubordinados;
	}
	public void setListaEmpleadosSubordinados(List<Empleado> listaEmpleadosSubordinados) {
		this.listaEmpleadosSubordinados = listaEmpleadosSubordinados;
	}
	/**
	 * Metodo para verificar si un directivo ya tiene a un empleado com subordinado
	 * @param empleado
	 * @return
	 */
	public boolean verificarContieneEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		
		boolean centinela = false;
		for(Empleado subordinado : listaEmpleadosSubordinados) {
			if(subordinado.getIdentificacion().equals(empleado.getIdentificacion())) {
				centinela = true;
			}
		}
		return centinela;
	}
}
