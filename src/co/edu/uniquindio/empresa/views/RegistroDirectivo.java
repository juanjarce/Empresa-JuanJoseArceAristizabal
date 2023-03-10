package co.edu.uniquindio.empresa.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.uniquindio.empresa.model.Empresa;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistroDirectivo extends JFrame {

	public Empresa miEmpresa;
	private JPanel contentPane;
	private JTextField inputNombres;
	private JTextField inputApellidos;
	private JTextField inputIdentificacion;
	private JTextField inputEdad;
	private JTextField inputSalario;
	private JTextField inputCategoria;

	/**
	 * Create the frame.
	 */
	public RegistroDirectivo(Empresa miEmpresa) {
		
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

	private void generarPanelSuperior() {
		// TODO Auto-generated method stub
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DIRECTIVOS");
		panel.add(lblNewLabel);
	}

	private void generarPanelMedio() {
		// TODO Auto-generated method stub
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(11,2));
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
			JLabel lblNewLabel_2 = new JLabel("Apellidos");
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
			JLabel lblNewLabel_6 = new JLabel("Categoria:");
			panel_1.add(lblNewLabel_6);
		}
		{
			inputCategoria = new JTextField();
			panel_1.add(inputCategoria);
			inputCategoria.setColumns(10);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("");
			panel_1.add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("");
			panel_1.add(lblNewLabel_8);
		}
		{
			JButton btnNewButton = new JButton("CREAR DIRECTIVO");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.crearDirectivo(inputNombres.getText(), inputApellidos.getText(), inputIdentificacion.getText(), Integer.parseInt(inputEdad.getText()), Double.parseDouble(inputSalario.getText()), inputCategoria.getText());
						JOptionPane.showMessageDialog(null, mensaje);
						inputNombres.setText(null);
						inputApellidos.setText(null);
						inputIdentificacion.setText(null);
						inputEdad.setText(null);
						inputSalario.setText(null);
						inputCategoria.setText(null);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			panel_1.add(btnNewButton);
		}
		{
			JLabel lblNewLabel_9 = new JLabel("");
			panel_1.add(lblNewLabel_9);
		}
		{
			JButton btnNewButton_1 = new JButton("ELIMINAR DIRECTIVO");
			btnNewButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.eliminarDirectivo(JOptionPane.showInputDialog(null, "Ingrese la identificacion del directivo:"));
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
			JLabel lblNewLabel_10 = new JLabel("");
			panel_1.add(lblNewLabel_10);
		}
		{
			JButton btnNewButton_2 = new JButton("MODIFICAR DIRECTIVO");
			btnNewButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.actualizarDirectivo(JOptionPane.showInputDialog(null, "Ingrese los nombres del directivo"), JOptionPane.showInputDialog(null, "Ingrese los apellidos del directivo"), JOptionPane.showInputDialog(null, "Ingrese la identificacion del directivo"), Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del directivo")), Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del directivo")), JOptionPane.showInputDialog(null, "Ingrese la categoria del directivo"));
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
			JLabel lblNewLabel_11 = new JLabel("");
			panel_1.add(lblNewLabel_11);
		}
		{
			JButton btnNewButton_3 = new JButton("BUSCAR DIRECTIVO");
			btnNewButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.devolverDatosDirectivo(JOptionPane.showInputDialog(null, "Ingrese la identificacion del directivo"));
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
			JButton btnNewButton_4 = new JButton("ASIGNAR EMPLEADO");
			btnNewButton_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						String mensaje = miEmpresa.asociarEmpleadoDirectivo(JOptionPane.showInputDialog(null, "Ingrese la identificacion del directivo:"), JOptionPane.showInputDialog(null, "Ingrese la identificacion del empleado:"));
						JOptionPane.showMessageDialog(null, mensaje);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			});
			panel_1.add(btnNewButton_4);
		}
		
	}

}
