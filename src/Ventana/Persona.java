package Ventana;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {

	private int idPersona;
	private String nombre;
	private String apellido;
	private String deptoResidencia;
	private byte cantHijos;
	private LocalDate fechaNacimiento;
	static List<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
	static List<Persona> listaPersona = new ArrayList<Persona>();
	
	
	Persona(int idPersona, String nombre, String apellido, String deptoResidencia, byte cantHijos, LocalDate fechaNacimiento){
		this.setIdPersona(idPersona);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDeptoResidencia(deptoResidencia);
		this.setCantHijos(cantHijos);
		this.setFechaNacimiento(fechaNacimiento);
		
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDeptoResidencia() {
		return deptoResidencia;
	}


	public void setDeptoResidencia(String deptoResidencia) {
		this.deptoResidencia = deptoResidencia;
	}


	public byte getCantHijos() {
		return cantHijos;
	}


	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
}
