package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreadorVehiculos implements ActionListener {

	private JFrame frmCreadorDeVehiculos;
	String[] tipoVehiculo = { "Seleccionar", "Avion", "Barco" };
	private JTextField fieldNombre;
	private JTextField fieldColor;
	private JTextField fieldLongitud;
	private JTextField fieldPasajeros;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	boolean interruptor;
	private JLabel lblEslora;
	private JLabel lblManga;
	private JTextField fieldEslora;
	private JTextField fieldManga;
	List<Vehiculo> listaVehiculos = Ventana.Persona.vehiculos;
	List<Persona> personas = Ventana.Persona.listaPersona;
	String[] arrayPersonas = new String[personas.size()];
	private JButton buttoncCrearVehiculo, buttonMosVehiculo;
	Persona duenio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreadorVehiculos window = new CreadorVehiculos();
					window.frmCreadorDeVehiculos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreadorVehiculos() {
		super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmCreadorDeVehiculos = new JFrame();
		frmCreadorDeVehiculos.setTitle("Creador de vehiculos");
		frmCreadorDeVehiculos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ferna\\Pictures\\Logo.png"));
		frmCreadorDeVehiculos.getContentPane().setBackground(new Color(240, 255, 255));
		frmCreadorDeVehiculos.getContentPane().setLayout(null);
		frmCreadorDeVehiculos.setVisible(true);
		// frmCreadorDeVehiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblDuenio = new JLabel("Dueño");
		lblDuenio.setFont(new Font("Corbel", Font.BOLD, 12));
		lblDuenio.setBounds(10, 35, 57, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblDuenio);

		comboBox = new JComboBox(tipoVehiculo);
		comboBox.setFont(new Font("Corbel", Font.PLAIN, 12));
		comboBox.addActionListener(this);
		comboBox.setToolTipText("Tipo de vehículo");
		comboBox.setBounds(121, 54, 126, 22);
		frmCreadorDeVehiculos.getContentPane().add(comboBox);
		frmCreadorDeVehiculos.setBounds(100, 100, 450, 360);

		for (int i = 0; i < arrayPersonas.length; i++) {
			arrayPersonas[i] = personas.get(i).getNombre() + " " + personas.get(i).getIdPersona();
			duenio = personas.get(i);

		}
		comboBox_1 = new JComboBox(arrayPersonas);
		comboBox_1.setFont(new Font("Corbel", Font.PLAIN, 12));
		comboBox.addActionListener(this);
		comboBox_1.setBounds(121, 29, 126, 22);
		frmCreadorDeVehiculos.getContentPane().add(comboBox_1);

		JLabel lblTipo = new JLabel("Seleccione el tipo");
		lblTipo.setFont(new Font("Corbel", Font.BOLD, 12));
		lblTipo.setBounds(10, 60, 101, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblTipo);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Corbel", Font.BOLD, 12));
		lblNombre.setBounds(10, 85, 46, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblNombre);

		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Corbel", Font.BOLD, 12));
		lblColor.setBounds(10, 110, 46, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblColor);

		JLabel lblLongitud = new JLabel("Longitud");
		lblLongitud.setFont(new Font("Corbel", Font.BOLD, 12));
		lblLongitud.setBounds(10, 140, 57, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblLongitud);

		JLabel lblCantPasajeros = new JLabel("Pasajeros");
		lblCantPasajeros.setFont(new Font("Corbel", Font.BOLD, 12));
		lblCantPasajeros.setBounds(10, 165, 57, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblCantPasajeros);

		lblEslora = new JLabel("Eslora");
		lblEslora.setFont(new Font("Corbel", Font.BOLD, 12));
		lblEslora.setBounds(10, 190, 57, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblEslora);

		lblManga = new JLabel("Manga");
		lblManga.setFont(new Font("Corbel", Font.BOLD, 12));
		lblManga.setBounds(10, 215, 57, 14);
		frmCreadorDeVehiculos.getContentPane().add(lblManga);

		fieldNombre = new JTextField();
		fieldNombre.setBounds(121, 80, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldNombre);
		fieldNombre.setColumns(10);

		fieldColor = new JTextField();
		fieldColor.setColumns(10);
		fieldColor.setBounds(121, 105, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldColor);

		fieldLongitud = new JTextField();
		fieldLongitud.setColumns(10);
		fieldLongitud.setBounds(121, 135, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldLongitud);

		fieldPasajeros = new JTextField();
		fieldPasajeros.setColumns(10);
		fieldPasajeros.setBounds(121, 160, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldPasajeros);

		fieldEslora = new JTextField();
		fieldEslora.setColumns(10);
		fieldEslora.setBounds(121, 185, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldEslora);

		fieldManga = new JTextField();
		fieldManga.setColumns(10);
		fieldManga.setBounds(121, 210, 126, 20);
		frmCreadorDeVehiculos.getContentPane().add(fieldManga);

		buttoncCrearVehiculo = new JButton("Crear vehículo");
		buttoncCrearVehiculo.setFont(new Font("Corbel", Font.PLAIN, 12));
		buttoncCrearVehiculo.addActionListener(this);
		buttoncCrearVehiculo.setBounds(121, 241, 126, 23);
		frmCreadorDeVehiculos.getContentPane().add(buttoncCrearVehiculo);

		buttonMosVehiculo = new JButton("Mostrar Vehículos");
		buttonMosVehiculo.addActionListener(this);
		buttonMosVehiculo.setFont(new Font("Corbel", Font.PLAIN, 12));
		buttonMosVehiculo.setBounds(121, 275, 126, 23);
		frmCreadorDeVehiculos.getContentPane().add(buttonMosVehiculo);

	}

	// HABILITAR O DESHABILITAR CAMPOS SEGÚN EL TIPO DE VEHÍCULO
	public boolean getFieldLongitudEnabled() {
		return fieldLongitud.isEnabled();
	}

	public void setFieldLongitudEnabled(boolean enabled) {
		fieldLongitud.setEnabled(enabled);
	}

	public boolean getFieldPasajerosEnabled() {
		return fieldPasajeros.isEnabled();
	}

	public void setFieldPasajerosEnabled(boolean enabled_1) {
		fieldPasajeros.setEnabled(enabled_1);
	}

	public boolean getFieldEsloraEnabled() {
		return fieldEslora.isEnabled();
	}

	public void setFieldEsloraEnabled(boolean enabled_2) {
		fieldEslora.setEnabled(enabled_2);
	}

	public boolean getFieldMangaEnabled() {
		return fieldManga.isEnabled();
	}

	public void setFieldMangaEnabled(boolean enabled_3) {
		fieldManga.setEnabled(enabled_3);
	}

	// VENTANA PARA ADICIÓN DE UN VEHÍCULO
	@Override
	public void actionPerformed(ActionEvent e) {
		String texto = "";
		if (e.getSource() == comboBox) {
			if (comboBox.getSelectedItem() == "Barco") {
				setFieldLongitudEnabled(false);
				setFieldPasajerosEnabled(false);
				setFieldEsloraEnabled(true);
				setFieldMangaEnabled(true);
			} else {
				setFieldLongitudEnabled(true);
				setFieldPasajerosEnabled(true);
				setFieldEsloraEnabled(false);
				setFieldMangaEnabled(false);
			}
		}

		// VEHICULO BARCO
		if (comboBox.getSelectedItem() == "Barco") {
			if (e.getSource() == buttoncCrearVehiculo) {
				// INSTANCIACIÓN DE UN BARCO
				String nombre = fieldNombre.getText();
				String color = fieldColor.getText();
				Double eslora = Double.parseDouble(fieldEslora.getText());
				Double manga = Double.parseDouble(fieldManga.getText());

				// VALIDACIONES PARA CREAR UN BARCO
				try {
					// NOMBRE
					Excepciones.validateStringNotEmpty(nombre, "El nombre de un barco no puede estar vacío");
					// COLOR
					Excepciones.validateStringNotEmpty(color, "El color de un barco no puede estar vacío");
					// ESLORA
					Excepciones.numberIsPositive(eslora.intValue(), "La eslora del barco no puede ser menor o igual a 0");
					// MANGA 
					Excepciones.numberIsPositive(manga.intValue(), "La manga del barco no puede ser menor o igual a 0");					

					// INSTANCIA CLASE BARCO
					Barco barco = new Barco(listaVehiculos.size(), nombre, color, duenio,
							eslora, manga);
					// GUARDAR EN MEMORIA 
					listaVehiculos.add(barco);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}

			}
		}

		// VEHICULO AVIÓN
		if (comboBox.getSelectedItem() == "Avion") {
			if (e.getSource() == buttoncCrearVehiculo) {
				String nombre = fieldNombre.getText();
				String color = fieldColor.getText();
				Double longitud = Double.parseDouble(fieldLongitud.getText());
				Integer pasajeros = Integer.parseInt(fieldPasajeros.getText());

				// VALIDACIONES PARA CREAR UN AVIÓN
				try {
					// NOMBRE
					Excepciones.validateStringNotEmpty(nombre, "El nombre de un avión no puede estar vacío");
					// COLOR
					Excepciones.validateStringNotEmpty(color, "El color de un avión no puede estar vacío");
					// LONGITUD
					Excepciones.numberIsPositive(longitud.intValue(), "La longitud del avión no puede ser menor o igual a 0");
					// PASAJEROS
					Excepciones.numberIsPositive(pasajeros, "El número de pasajeros no puede ser menor o igual a 0");

					// INSTANCIA DE LA CLASE AVIÓN
					Avion avion = new Avion(listaVehiculos.size(), nombre, color, duenio, longitud, pasajeros);
					// GUARDAR EN MEMORIA AVIÓN
					listaVehiculos.add(avion);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}

			}
		}

		// VENTANA PARA MOSTRAR VEHÍCULOS
		if (e.getSource() == buttonMosVehiculo) {

			// PARSEO DEL MENSAJE A MOSTRAR
			for (Vehiculo i : listaVehiculos) {
				texto += "ID: " + i.idVehiculo + " " + "Nombre: " + i.nombre + " Dueño: " + duenio.getNombre() + "\n";
			}
			// MOSTRAR MENSAJE EN VENTANA
			JOptionPane.showMessageDialog(null, texto);

		}
	}
}
