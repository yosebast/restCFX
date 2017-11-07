package org.okis.dtos;

import java.io.Serializable;

import org.okis.beans.Acciones;

public class ListadoAccionesInDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Acciones accion;


	public Acciones getAccion() {
		return accion;
	}


	public void setAccion(Acciones accion) {
		this.accion = accion;
	}
	
	
	
	
	
	
	
	
	

}
