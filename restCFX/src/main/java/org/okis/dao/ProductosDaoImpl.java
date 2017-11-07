package org.okis.dao;

import java.util.List;

import org.okis.beans.Productos;
import org.okis.model.ProductoRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductosDaoImpl extends JdbcDaoSupport implements IProductosDao {

	@Override
	public List<Productos> listadoProductos() {		
		// TODO Auto-generated method stub
		
		String sql = "select * from Productos";
		
		List<Productos> listado = getJdbcTemplate().query(sql, new ProductoRowMapper());
		
		return listado;
	}

}
