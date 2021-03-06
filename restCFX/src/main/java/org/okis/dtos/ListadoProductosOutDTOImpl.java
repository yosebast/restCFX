package org.okis.dtos;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.okis.beans.Productos;
import org.okis.dao.IProductosDao;
import org.okis.mapper.ProductoMapper;

public class ListadoProductosOutDTOImpl implements ListadoProductosOutDTO {
	
	Logger logger = Logger.getLogger(ListadoProductosOutDTOImpl.class);
	
	private IProductosDao productDao;

	public void setProdDao(IProductosDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<ProductoMapper> listadoProductos() {
		// TODO Auto-generated method stub
		
		logger.debug("entra al DTO");
		
		List<Productos> listadoProductos = productDao.listadoProductos();
		
		List<ProductoMapper> listadoMapper = new ArrayList<>();
		
		byte[] contents = null;
		InputStream blobInputStream = null;
		Blob blob = null;
		
		for (Productos productos : listadoProductos) {
			
			ProductoMapper pm = new ProductoMapper();
			
			blob = productos.getUrlFoto();
			
			try {
				blobInputStream = blob.getBinaryStream();
				contents = IOUtils.toByteArray(blobInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			pm.setCategoria(productos.getCategoria());
			pm.setEstado(productos.getNomImagen());
			pm.setFechaPublicacion(productos.getFechaPublicacion());
			pm.setIdProducto(productos.getIdProducto());
			pm.setNomImagen(productos.getNomImagen());
			pm.setPrecio(productos.getPrecio());
			pm.setSeccion(productos.getSeccion());
			pm.setSubcategoria(productos.getSubcategoria());
			pm.setTitulo(productos.getTitulo());
			pm.setUrlFoto1(contents);
			pm.setVisitas(productos.getVisitas());
			
			listadoMapper.add(pm);
		}
		
		
		return listadoMapper;
	}
	
	
	
	

}
