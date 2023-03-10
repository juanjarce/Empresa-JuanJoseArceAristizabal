package co.edu.uniquindio.empresa.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.uniquindio.empresa.model.Empresa;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistroEmpleado extends JFrame {
	
	public Empresa miEmpresa;
	private JPanel contentPane;
	private JTextField inputNombres;
	private JTextField inputApellidos;
	private JTextField inputIdentificacion;
	private JTextField inputEdad;
	private JTextField inputSalario;
	
	/**
	 * Create the frame.
	 */
	public RegistroEmpleado(Empresa miEmpresa) {
		this.miEmpresa = miEmpresa;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		generarPanelSuperior();
		generarPanelMedio();
	}
	
	public void generarPanelSuperior(){
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("REGISTRO EMPLEADOS");
		panel.add(lblNewLabel);
		
	}
	public void generarPanelMedio() {
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(10,2));
		{
			JLabel lblNewLabel_1 = new JLabel("Nombres:");
			panel_1.add(lblNewLabel_1);
		}
		{
			inputNombres = new JTextField();
			panel_1.add(inputNombres);
			inputNombres.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Apellidos:");
			panel_1.add(lblNewLabel_2);
		}
		{
			inputApellidos = new JTextField();
			panel_1.add(inputApellidos);
			inputApellidos.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Identificacion:");
			panel_1.add(lblNewLabel_3);
		}
		{
			inputIdentificacion = new JTextField();
			panel_1.add(inputIdentificacion);
			inputIdentificacion.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Edad:");
			panel_1.add(lblNewLabel_4);
		}
		{
			inputEdad = new JTextField();
			panel_1.add(inputEdad);
			inputEdad.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Salario:");
			panel_1.add(lblNewLabel_5);
		}
		{
			inputSalario = new JTextField();
			panel_1.add(inputSalario);
			inputSalario.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("CREAR EMPLEADO");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.crearEmpleado(inputNombres.getText(), inputApellidos.getText(), inputIdentificacion.getText(), Integer.parseInt(inputEdad.getText()), Double.parseDouble(inputSalario.getText()));
						JOptionPane.showMessageDialog(null, mensaje);
						inputNombres.setText(null);
						inputApellidos.setText(null);
						inputIdentificacion.setText(null);
						inputEdad.setText(null);
						inputSalario.setText(null);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			{
				JLabel lblNewLabel_10 = new JLabel("");
				panel_1.add(lblNewLabel_10);
			}
			{
				JLabel lblNewLabel_11 = new JLabel("");
				panel_1.add(lblNewLabel_11);
			}
			panel_1.add(btnNewButton);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("");
			panel_1.add(lblNewLabel_6);
		}
		{
			JButton btnNewButton_1 = new JButton("ELIMINAR EMPLEADO");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.eliminarEmpleado(JOptionPane.showInputDialog(null, "Ingrese la identificacion del empleado"));
						JOptionPane.showMessageDialog(null, mensaje);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			panel_1.add(btnNewButton_1);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("");
			panel_1.add(lblNewLabel_7);
		}
		{
			JButton btnNewButton_2 = new JButton("MODIFICAR EMPLEADO");
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.actualizarEmpleado(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado"), JOptionPane.showInputDialog(null, "Ingrese los apellidos del empleado"), JOptionPane.showInputDialog(null, "Ingrese la identificacion del empleado"), Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del empleado")), Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado")));
						JOptionPane.showMessageDialog(null, mensaje);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			panel_1.add(btnNewButton_2);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("");
			panel_1.add(lblNewLabel_8);
		}
		{
			JButton btnNewButton_3 = new JButton("BUSCAR EMPLEADO");
			btnNewButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.devolverDatosEmpleado(JOptionPane.showInputDialog(null, "Ingrese la identificacion del empleado"));
						JOptionPane.showMessageDialog(null, mensaje);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			panel_1.add(btnNewButton_3);
		}
		{
			JLabel lblNewLabel_9 = new JLabel("");
			panel_1.add(lblNewLabel_9);
		}
	}

}
