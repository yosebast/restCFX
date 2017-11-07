package org.okis.beans;

public class Prestamo {

	
	private Integer idPrestamo;
	
	private String titular;
	
	private Integer cantidad;
	
	public Prestamo(){}
	
	public Prestamo(Integer idPrestamo, String titular, Integer cantidad){
		
		this.idPrestamo = idPrestamo;
		this.titular = titular;
		this.cantidad = cantidad;
		
		
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
}
