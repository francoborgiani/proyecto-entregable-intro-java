package Ventana;

public class Avion extends Vehiculo {
	
	double longitud;
	int cantPasajeros;
	
	Avion(int idVehiculo,String nombre,String color,Persona duenio, double longitud,int cantPasajeros){
		super(idVehiculo,nombre,color, duenio);
		this.longitud=longitud;
		this.cantPasajeros=cantPasajeros;
	}
}
