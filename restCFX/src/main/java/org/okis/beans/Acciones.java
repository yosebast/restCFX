package org.okis.beans;



public class Acciones {

	private String nombreAccion;
	private double valorAccion;
	
	
	public Acciones(){}
	
	//esto es una prueba para ver el github  no dar importancia a este comentario
	
	
	public Acciones(String nombreAcciones, double valorAccion){
		this.nombreAccion = nombreAcciones;
		this.valorAccion = valorAccion;
	}
	
	
	public String getNombreAccion() {
		return nombreAccion;
	}
	public void setNombreAccion(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}
	public double getValorAccion() {
		return valorAccion;
	}
	public void setValorAccion(double valorAccion) {
		this.valorAccion = valorAccion;
	}
	
	
	
	
	
	
	
}
