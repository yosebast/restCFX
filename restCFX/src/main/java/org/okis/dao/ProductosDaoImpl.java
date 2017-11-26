package org.okis.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.okis.beans.Productos;
import org.okis.model.ProductoRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductosDaoImpl extends JdbcDaoSupport implements IProductosDao {

	
	private Logger logger = Logger.getLogger(ProductosDaoImpl.class);
			
	@Override
	public List<Productos> listadoProductos() {		
		// TODO Auto-generated method stub
		
		
		logger.debug("Entra al metodo dao");
		
		
		String sql = "select * from Productos";
		
		List<Productos> listado = getJdbcTemplate().query(sql, new ProductoRowMapper());
		
		return listado;
	}

}
