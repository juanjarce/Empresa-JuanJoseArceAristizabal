package co.edu.uniquindio.empresa.test;

import co.edu.uniquindio.empresa.model.Empleado;
import co.edu.uniquindio.empresa.model.Empresa;

public class Test {

	public static void main(String args[]) {
		
		Empresa empresa = new Empresa("Catavento", "12345");
		
		try {
			String mensaje = empresa.crearDirectivo("Cesar Augusto", "Arce Vargas", "18494175", 50, 8000000, "gerente");
			System.out.println(mensaje);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		try {
			String mensaje = empresa.crearEmpleado("Juan Jose", "Arce Aristizabal", "1092851015", 18, 1000000);
			System.out.println(mensaje);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			String mensaje = empresa.devolverDatosEmpleado("1092851015");
			System.out.println(mensaje);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			String mensaje = empresa.asociarEmpleadoDirectivo("1848484", "12345");
			System.out.println(mensaje);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			String mensaje = empresa.asociarEmpleadoDirectivo("18494175", "195848");
			System.out.println(mensaje);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		try {
			String mensaje = empresa.asociarEmpleadoDirectivo("18494175", "1092851015");
			System.out.println(mensaje);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		
		try {
			String mensaje = empresa.crearEmpleado("Juan Jose", "Arce Aristizabal", "1092851015", 18, 1000000);
			System.out.println(mensaje);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		Empleado empleado1 = new Empleado("Nallybe", "Aristizabal", "41945090", 42, 5000000.0);
		Empleado empleado2 = new Empleado("Nallybe", "Aristizabal", "41945090", 42, 5000000.0);
		
		boolean centinela = empleado1.equals(empleado2);
		System.out.println(centinela);
		
	}
}
