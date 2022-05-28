package Ventana;

public class Vehiculo {
	
	int idVehiculo;
	String nombre;
	String color;
	Persona duenio;
	
	Vehiculo(int idVehiculo,String nombre,String color, Persona duenio ){
		this.idVehiculo=idVehiculo;
		this.nombre=nombre;
		this.color=color;
		this.duenio=duenio;
	}
}
