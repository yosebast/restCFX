package org.okis.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.okis.beans.Bonos;

public class ListadoBonosOutDTOImpl implements Serializable, ListadoBonosOutDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Bonos> listaBonos;

	public List<Bonos> getListaBonos() {
		return listaBonos;
	}

	public void setListaBonos(List<Bonos> listaBonos) {
		this.listaBonos = listaBonos;
	}

	@Override
	public List<Bonos> listaBonos(ListadoBonosInDTO in) {
		// TODO Auto-generated method stub
		
		listaBonos = new ArrayList<Bonos>();
		
		listaBonos.add(new Bonos("Santander", 2));
		return listaBonos;
	}
	
	
	
	
	
	

}
