package org.okis.dtos;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.okis.beans.Acciones;

public class ListadoAccionesOutDTOImpl implements  Serializable, ListadoAccionesOutDTO {	


	
	public List<Acciones> getListadoAcc() {
		return listadoAcc;
	}




	public void setListadoAcc(List<Acciones> listadoAcc) {
		this.listadoAcc = listadoAcc;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Acciones> listadoAcc;




	@Override
	public List<Acciones> listaAcciones(Acciones accion) {
		// TODO Auto-generated method stub
		
	//determino cuantas acciones estan asociadas a esta accion
		
		listadoAcc = new ArrayList<Acciones>();
		
		listadoAcc.add(new Acciones("Santander", 2));
		listadoAcc.add(new Acciones("BAnkia", 5));
		return listadoAcc;
	}
	
	
	
	
}
