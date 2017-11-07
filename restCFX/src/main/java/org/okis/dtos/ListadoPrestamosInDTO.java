package org.okis.dtos;

import java.io.Serializable;

import org.okis.beans.Prestamo;

public class ListadoPrestamosInDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Prestamo prestamo;

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	
	

}
