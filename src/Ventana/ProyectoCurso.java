package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ProyectoCurso implements ActionListener {

	private JFrame frmRegistro;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDepartamento;
	private JTextField textFieldHijos;
	private JTextField textFieldFechaNac;
	private JLabel lblNewLabel;
	JButton buttonRegistro, buttonMostrar, buttonCrearVehiculo;
	List<Persona> listaPersona = new ArrayList<Persona>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoCurso window = new ProyectoCurso();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// INIZIALIZAR APP
	public ProyectoCurso() {
		initialize();
	}

	// INTERFAZ GRÁFICA DE LA APP
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setBackground(new Color(240, 255, 255));
		frmRegistro.getContentPane().setLayout(null);

		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setBounds(10, 106, 138, 20);
		lblnombre.setFont(new Font("Corbel", Font.PLAIN, 16));
		frmRegistro.getContentPane().add(lblnombre);

		JLabel lblapellido = new JLabel("Apellido:");
		lblapellido.setFont(new Font("Corbel", Font.PLAIN, 16));
		lblapellido.setBounds(10, 137, 138, 20);
		frmRegistro.getContentPane().add(lblapellido);

		JLabel lbldepartamento = new JLabel("Departamento:");
		lbldepartamento.setFont(new Font("Corbel", Font.PLAIN, 16));
		lbldepartamento.setBounds(10, 168, 138, 20);
		frmRegistro.getContentPane().add(lbldepartamento);

		JLabel lblcantHijos = new JLabel("Cantidad de hijos:");
		lblcantHijos.setFont(new Font("Corbel", Font.PLAIN, 16));
		lblcantHijos.setBounds(10, 199, 138, 20);
		frmRegistro.getContentPane().add(lblcantHijos);

		JLabel lblfechaNac = new JLabel("Fecha de nacimiento:");
		lblfechaNac.setFont(new Font("Corbel", Font.PLAIN, 16));
		lblfechaNac.setBounds(10, 230, 142, 20);
		frmRegistro.getContentPane().add(lblfechaNac);

		JLabel lblregistroTitle = new JLabel("Resgistro de personas");
		lblregistroTitle.setForeground(Color.DARK_GRAY);
		lblregistroTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblregistroTitle.setFont(lblregistroTitle.getFont().deriveFont(40f));
		lblregistroTitle.setBounds(10, 11, 450, 84);
		frmRegistro.getContentPane().add(lblregistroTitle);

		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldNombre.setBounds(158, 104, 180, 20);
		frmRegistro.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldApellido.setBounds(158, 135, 180, 20);
		frmRegistro.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);

		textFieldDepartamento = new JTextField();
		textFieldDepartamento.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldDepartamento.setBounds(158, 166, 180, 20);
		frmRegistro.getContentPane().add(textFieldDepartamento);
		textFieldDepartamento.setColumns(10);

		textFieldHijos = new JTextField();
		textFieldHijos.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldHijos.setBounds(158, 197, 180, 20);
		frmRegistro.getContentPane().add(textFieldHijos);
		textFieldHijos.setColumns(10);

		textFieldFechaNac = new JTextField();
		textFieldFechaNac.setText("01/01/1990");
		textFieldFechaNac.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldFechaNac.setBounds(158, 228, 180, 20);
		frmRegistro.getContentPane().add(textFieldFechaNac);
		textFieldFechaNac.setColumns(10);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ProyectoCurso.class.getResource("/Ventana/logo_chico.png")));
		lblNewLabel.setBounds(445, 11, 128, 97);
		frmRegistro.getContentPane().add(lblNewLabel);

		buttonMostrar = new JButton("Mostrar");
		buttonMostrar.setBounds(158, 259, 81, 23);
		buttonMostrar.addActionListener(this);
		frmRegistro.getContentPane().add(buttonMostrar);

		buttonRegistro = new JButton("Registro");
		buttonRegistro.setBounds(243, 259, 95, 23);
		buttonRegistro.addActionListener(this);
		frmRegistro.getContentPane().add(buttonRegistro);

		buttonCrearVehiculo = new JButton("Crear Vehículo");
		buttonCrearVehiculo.addActionListener(this);
		buttonCrearVehiculo.setBounds(158, 293, 180, 23);
		frmRegistro.getContentPane().add(buttonCrearVehiculo);
		frmRegistro.setBackground(Color.DARK_GRAY);

		// RUTA DEL LOGO
		frmRegistro.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ferna\\Pictures\\Logo.png"));

		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 615, 500);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@SuppressWarnings("null")
	@Override
	public void actionPerformed(ActionEvent e) {
		Utils utils = new Utils();

		int idPersona = listaPersona.size();
		String nombre = null;
		String apellido = null;
		String deptoResidencia = null;
		byte cantHijos = 0;
		LocalDate fechaNacimiento = null;

		// VENTANA PARA CREAR VEHICULO
		if (buttonCrearVehiculo == e.getSource()) {
			CreadorVehiculos ven = new CreadorVehiculos();
			ven.getClass().getConstructors();
		}

		if (buttonRegistro == e.getSource()) {

			// INGRESO DE DATOS DE UNA PERSONA
			String nombreInput = textFieldNombre.getText();
			String apellidoInput = textFieldApellido.getText();
			String deptoInput = textFieldDepartamento.getText();
			String hijosInput = textFieldHijos.getText();
			String nacimientoInput = textFieldFechaNac.getText();

			// DEFINICIÓN DE VARIABLES PARA VALIDAR CAMPOS DE LA CLASE PERSONA
			nombre = nombreInput;
			apellido = apellidoInput;
			deptoResidencia = deptoInput;
			Integer cantHijosInteger = 0; 
			

			fechaNacimiento = LocalDate.parse(nacimientoInput, utils.formatter);

			// VALIDACIÓN DE CAMPOS DE LA CLASE PERSONA
			try {
				// NOMBRE PERSONA
				Excepciones.validateStringNotEmpty(nombreInput, "El nombre de una persona no puede estar vacío");

				// APELLIDO PERSONA
				Excepciones.validateStringNotEmpty(apellidoInput, "El apellido de una persona no puede estar vacío");

				// DEPARTAMENTO PERSONA
				Excepciones.validateStringNotEmpty(deptoInput,
				"El departamento de residencia de una persona no puede estar vacío");
				
				// HIJOS PERSONA 
				Excepciones.validateStringNotEmpty(hijosInput, "Cantidad de Hijos no puede estar vacía");
				cantHijosInteger = Integer.parseInt(hijosInput);

				Excepciones.isInByteRange(cantHijosInteger, "La cantidad de hijos no puede ser mayor a 255 o menor a 0");

				cantHijos = Byte.parseByte(cantHijosInteger.toString());

				
				// INSTANCIACIÓN DE UNA PERSONA
				Persona persona = new Persona(
						idPersona, nombre, apellido, deptoResidencia, cantHijos, fechaNacimiento);
	
				// AGREGAR PERSONA A LA LISTA
				listaPersona.add(persona);
			} catch (Exception ex) {
				// VENTANA CON MENSAJE DE ERROR
				JOptionPane.showMessageDialog(null, ex);
			}
		}
		if (buttonMostrar == e.getSource()) {
			String texto = "";

			// PARSEO DE LISTA A TEXTO
			for (int i = 0; i < listaPersona.size(); i++) {
				Persona persona = listaPersona.get(i);
				Boolean tieneHijos = !(persona.getCantHijos() == 1);

				texto += ("Persona " + (i + 1) + " \n Nombre: " + persona.getNombre()
						+ " " + persona.getApellido() + ", vive en " + persona.getDeptoResidencia()
						+ " y tiene " + persona.getCantHijos() + " hijo" + (tieneHijos ? "s" : "") + " \n \n");
			}
			JOptionPane.showMessageDialog(null, texto);
		}

	}
}
