package co.edu.uniquindio.empresa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Empresa {
	
	public String nombre;
	public String nit;
	public List<Persona> listaPersonas;
	
	public Empresa() {
		super();
	}
	/**
	 * Constructor de la clase Empresa
	 * @param nombre
	 * @param nit
	 */
	public Empresa(String nombre, String nit) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.listaPersonas = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaEmpleados(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nit=" + nit + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nit);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(nit, other.nit);
	}
	
	public Empleado obtenerEmpleado(String identificacion) {
		Empleado empleado = null;
		for(Persona persona:listaPersonas) {
			try {
				Empleado empleadoaux = (Empleado) persona;
				if(empleadoaux.getIdentificacion().equals(identificacion)) {
					empleado=empleadoaux;
				}
			}
			catch(Exception e){	
			}
		}
		return empleado;
	}
	public boolean verificarEmpleado(String identificacion)
	{
		boolean centinela=false;
		for(Persona persona:listaPersonas){
			try {
				Empleado empleadoaux = (Empleado) persona;
				if(empleadoaux.getIdentificacion().equals(identificacion)) {
					centinela=true;
				}
			}
			catch(Exception e){	
			}
		}
		return centinela;
	}
	public String crearEmpleado(String nombres, String apellidos, String identificacion, int edad, double salario) throws Exception
	{
		String mensaje;
		if(verificarEmpleado(identificacion)==false) {
			listaPersonas.add(new Empleado(nombres, apellidos, identificacion, edad, salario));
			mensaje="El empleado fue creado exitosamente";
		}
		else {
			throw new Exception("El empleado ya existe");
		}
		return mensaje;
	}
	public String eliminarEmpleado(String identificacion) throws Exception
	{
		String mensaje;
		Empleado empleado = obtenerEmpleado(identificacion);
		if(empleado==null) {
			throw new Exception("El empleado no extiste");
		}
		else {
			listaPersonas.remove(empleado);
			mensaje="El empleado fue borrado exitosamente";
		}
		return mensaje;
	}
	public String actualizarEmpleado(String nombres, String apellidos, String identificacion, int edad, double salario) throws Exception
	{
		String mensaje;
		Empleado empleado = obtenerEmpleado(identificacion);
		if(empleado == null) {
			throw new Exception("El empleado no existe");
		}
		else {
			empleado.setNombres(nombres);
			empleado.setApellidos(apellidos);
			empleado.setEdad(edad);
			empleado.setSalario(salario);
			mensaje="El empleado fue modificado exitosamente";
		}
		return mensaje;
	}
	public String devolverDatosEmpleado(String identificacion) throws Exception
	{
		String mensaje;
		Empleado empleado = obtenerEmpleado(identificacion);
		if(empleado==null){
			throw new Exception("El Empleado no esta registrado");
		}
		else{
			mensaje="Nombres:"+" "+empleado.getNombres()+"\n"+"Apellidos:"+" "+empleado.getApellidos()+"\n"+"Identificacion:"+" "+empleado.getIdentificacion()+"\n"+"Edad:"+" "+empleado.getEdad()
			+"\n"+"Salario:"+" "+"$"+" "+empleado.getSalario();
		}
		return mensaje;
	}
	
	public Directivo obtenerDirectivo(String identificacion) {
		Directivo directivo = null;
		for(Persona persona:listaPersonas) {
			try {
				Directivo directivoaux = (Directivo) persona;
				if(directivoaux.getIdentificacion().equals(identificacion)) {
					directivo = directivoaux;
				}
			}catch(Exception e) {
			}
		}
		return directivo;
	}
	public boolean verificarDirectivo(String identificacion)
	{
		boolean centinela=false;
		for(Persona persona:listaPersonas){
			try {
				Directivo directivoaux = (Directivo) persona;
				if(directivoaux.getIdentificacion().equals(identificacion)) {
					centinela = true;
				}
			}catch(Exception e) {
			}
		}
		return centinela;
	}
	public String crearDirectivo(String nombres, String apellidos, String identificacion, int edad, double salario, String categoria) throws Exception
	{
		String mensaje;
		if(verificarDirectivo(identificacion)==false && verificarEmpleado(identificacion)==false) {
			listaPersonas.add(new Directivo(nombres, apellidos, identificacion, edad, salario, categoria));
			mensaje="El directivo fue creado exitosamente";
		}
		else {
			throw new Exception("El empleado ya existe");
		}
		return mensaje;
	}
	public String eliminarDirectivo(String identificacion) throws Exception
	{
		String mensaje;
		Directivo directivo = obtenerDirectivo(identificacion);
		if(directivo==null) {
			throw new Exception("El directivo no extiste");
		}
		else {
			listaPersonas.remove(directivo);
			mensaje="El directivo fue borrado exitosamente";
		}
		return mensaje;
	}
	public String actualizarDirectivo(String nombres, String apellidos, String identificacion, int edad, double salario, String categoria) throws Exception
	{
		String mensaje;
		Directivo directivo = obtenerDirectivo(identificacion);
		if(directivo == null) {
			throw new Exception("El directivo no existe");
		}
		else {
			directivo.setNombres(nombres);
			directivo.setApellidos(apellidos);
			directivo.setEdad(edad);
			directivo.setSalario(salario);
			directivo.setCategoria(categoria);
			mensaje="El directivo fue modificado exitosamente";
		}
		return mensaje;
	}
	public String devolverDatosDirectivo(String identificacion) throws Exception
	{
		String mensaje;
		Directivo directivo = obtenerDirectivo(identificacion);
		if(directivo==null){
			throw new Exception("El directivo no esta registrado");
		}
		else{
			mensaje="Nombres:"+" "+directivo.getNombres()+"\n"+"Apellidos:"+" "+directivo.getApellidos()+"\n"+"Identificacion:"+" "+directivo.getIdentificacion()+"\n"+"Edad:"+" "+directivo.getEdad()+"\n"+"Categoria:"+" "+directivo.getCategoria()
			+"\n"+"Salario:"+" "+"$"+" "+directivo.getSalario()+"\n"+"Empleados Suboridnados:"+" "+directivo.getListaEmpleadosSubordinados().toString();
		}
		return mensaje;
	}
	
	public Cliente obtenerCliente(String identificacion) {
		Cliente cliente = null;
		for(Persona persona:listaPersonas) {
			try {
				Cliente clienteaux = (Cliente) persona;
				if(clienteaux.getIdentificacion().equals(identificacion)) {
					cliente = clienteaux;
				}
			}catch(Exception e) {
			}
		}
		return cliente;
	}
	public boolean verificarCliente(String identificacion)
	{
		boolean centinela=false;
		for(Persona persona:listaPersonas){
			try {
				Cliente clienteaux = (Cliente) persona;
				if(clienteaux.getIdentificacion().equals(identificacion)) {
					centinela = true;
				}
			}catch(Exception e) {
			}
		}
		return centinela;
	}
	public String crearCliente(String nombres, String apellidos, String identificacion, int edad, String telefono) throws Exception
	{
		String mensaje;
		if(verificarCliente(identificacion)==false) {
			listaPersonas.add(new Cliente(nombres, apellidos, identificacion, edad, telefono));
			mensaje="El cliente fue creado exitosamente";
		}
		else {
			throw new Exception("El cliente ya existe");
		}
		return mensaje;
	}
	public String eliminarCliente(String identificacion) throws Exception
	{
		String mensaje;
		Cliente cliente = obtenerCliente(identificacion);
		if(cliente==null) {
			throw new Exception("El cliente no extiste");
		}
		else {
			listaPersonas.remove(cliente);
			mensaje="El cliente fue borrado exitosamente";
		}
		return mensaje;
	}
	public String actualizarCliente(String nombres, String apellidos, String identificacion, int edad, String telefono) throws Exception
	{
		String mensaje;
		Cliente cliente = obtenerCliente(identificacion);
		if(cliente == null) {
			throw new Exception("El cliente no existe");
		}
		else {
			cliente.setNombres(nombres);
			cliente.setApellidos(apellidos);
			cliente.setIdentificacion(identificacion);
			cliente.setEdad(edad);
			cliente.setTelefono(telefono);
			mensaje="El cliente fue modificado exitosamente";
		}
		return mensaje;
	}
	public String devolverDatosCliente(String identificacion) throws Exception
	{
		String mensaje;
		Cliente cliente = obtenerCliente(identificacion);
		if(cliente==null){
			throw new Exception("El cliente no esta registrado");
		}
		else{
			mensaje="Nombres:"+" "+cliente.getNombres()+"\n"+"Apellidos:"+" "+cliente.getApellidos()+"\n"+"Identificacion:"+" "+cliente.getIdentificacion()+"\n"+"Edad:"+" "+cliente.getEdad()+"años"+"\n"+"Telefono:"+" "+cliente.getTelefono();
		}
		return mensaje;
	}
	/**
	 * Metodo para asociar a un empleado subordiando a un directivo
	 * @param identificacionDirectivo
	 * @param identificacionEmpleado
	 * @return
	 * @throws Exception
	 */
	public String asociarEmpleadoDirectivo(String identificacionDirectivo, String identificacionEmpleado) throws Exception {
		String mensaje;
		Directivo directivo = obtenerDirectivo(identificacionDirectivo);
		Empleado empleado = obtenerEmpleado(identificacionEmpleado);
		if(directivo==null)throw new Exception("El directivo no esta registrado");
		if(empleado==null) throw new Exception("El empleado no esta registrado");
		else {
			if(directivo.verificarContieneEmpleado(empleado)==false) {
				directivo.listaEmpleadosSubordinados.add(empleado);
				mensaje="Empleado asociado correctamente al directivo";
			}
			else {
				throw new Exception("El empleado ya esta asignado al directivo");
			}
		}
		return mensaje;
	}
}
