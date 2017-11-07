package org.okis.dtos;

import java.util.List;

import org.okis.beans.Productos;
import org.okis.mapper.ProductoMapper;

public interface ListadoProductosOutDTO {
	
	public List<ProductoMapper> listadoProductos();
}
