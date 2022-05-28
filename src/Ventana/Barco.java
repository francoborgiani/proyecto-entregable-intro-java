package Ventana;

public class Barco extends Vehiculo {

	double eslora;
	double manga;
	
	Barco(int idVehiculo,String nombre,String color, Persona duenio,double eslora,double manga ){
		super(idVehiculo,nombre,color, duenio);
		this.eslora=eslora;
		this.manga=manga;
	}
}
