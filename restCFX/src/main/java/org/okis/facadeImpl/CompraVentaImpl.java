package org.okis.facadeImpl;

import org.okis.dtos.ListadoCategoriasInDTO;
import org.okis.dtos.ListadoCategoriasOutDTO;
import org.okis.dtos.ListadoCategoriasOutDTOImpl;
import org.okis.facade.ICompraVenta;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class CompraVentaImpl implements ICompraVenta {

	

	private ListadoCategoriasOutDTO lisCategorias;	
	
	public void setLisCategorias(ListadoCategoriasOutDTO lisCategorias) {
		this.lisCategorias = lisCategorias;
	}

	public ListadoCategoriasOutDTO getLisCategorias() {
		return lisCategorias;
	}


	@Transactional
	public ListadoCategoriasOutDTOImpl listaCategorias(ListadoCategoriasInDTO in) {
		// TODO Auto-generated method stub
		
		
		 lisCategorias.listaCategorias();
		 
		 return (ListadoCategoriasOutDTOImpl) lisCategorias;
	}





}
