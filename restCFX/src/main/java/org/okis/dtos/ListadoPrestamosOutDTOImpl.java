package org.okis.dtos;


import java.util.List;

import org.okis.beans.Prestamo;
import org.okis.dao.PrestamoDao;

public class ListadoPrestamosOutDTOImpl implements  ListadoPrestamosOutDTO{
	

	/**
	 * 
	 */

	private PrestamoDao prestamodao;
	

	public PrestamoDao getPrestamodao() {
		return prestamodao;
	}


	public void setPrestamodao(PrestamoDao prestamodao) {
		this.prestamodao = prestamodao;
	}
	
	
	//siempre hay que poner el getter y setter del que es serializable
	
	private List<Prestamo> ListaPres;	


	public List<Prestamo> getListaPres() {
		return ListaPres;
	}


	public void setListaPres(List<Prestamo> listaPres) {
		ListaPres = listaPres;
	}

	
	

	@Override
	public List<Prestamo> listadoPrestamos() {
		// TODO Auto-generated method stub
		
	ListaPres = 	prestamodao.listadoPrestamos();
		return ListaPres;
	}
	
	

}
