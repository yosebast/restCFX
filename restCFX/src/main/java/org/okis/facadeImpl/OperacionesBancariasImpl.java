package org.okis.facadeImpl;


import java.util.List;

import org.okis.beans.Prestamo;
import org.okis.beans.Productos;
import org.okis.dtos.ListadoPrestamosInDTO;
import org.okis.dtos.ListadoPrestamosOutDTO;
import org.okis.dtos.ListadoPrestamosOutDTOImpl;
import org.okis.dtos.ListadoProductosInDTO;
import org.okis.dtos.ListadoProductosOutDTO;
import org.okis.facade.IOperacionesBancarias;
import org.okis.mapper.ProductoMapper;
import org.springframework.transaction.annotation.Transactional;

public class OperacionesBancariasImpl implements IOperacionesBancarias {
	
	private ListadoPrestamosOutDTO listaPrestamo;
	
	public void setListaPrestamo(ListadoPrestamosOutDTO listaPrestamo) {
		this.listaPrestamo = listaPrestamo;
	}
	
	
	private ListadoProductosOutDTO listaProductos;

	public void setListaProductos(ListadoProductosOutDTO listaProductos) {
		this.listaProductos = listaProductos;
	}



	@Transactional
	public List<Prestamo> obtenerListadoPrestamos(ListadoPrestamosInDTO in) throws Exception {
		// TODO Auto-generated method stub
		
		
		 List<Prestamo> lisPrestamo = listaPrestamo.listadoPrestamos();
		 
		 return  lisPrestamo;
	}



	@Transactional
	public List<ProductoMapper> listaProductos(ListadoProductosInDTO in) throws Exception {
		// TODO Auto-generated method stub
		
		List<ProductoMapper> lista = listaProductos.listadoProductos();
		return lista;
	}

}
