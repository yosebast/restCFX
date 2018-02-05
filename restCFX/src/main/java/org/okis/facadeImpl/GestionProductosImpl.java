package org.okis.facadeImpl;

import java.util.List;

import org.okis.facade.GestionProductos;
import org.okis.mapper.ProductoMapper;
import org.okis.mapper.ProductoServicio;

public class GestionProductosImpl implements GestionProductos{
	
	
	private ProductoServicio servicioProducto;
	

	public void setServicioProducto(ProductoServicio servicioProducto) {
		this.servicioProducto = servicioProducto;
	}

	@Override
	public List<ProductoMapper> obtieneAllProductos() {
		// TODO Auto-generated method stub
		
		List<ProductoMapper> listado = servicioProducto.getProductos();
		
		
		return listado;
	}

}
