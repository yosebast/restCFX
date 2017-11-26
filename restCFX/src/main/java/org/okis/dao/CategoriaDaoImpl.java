package org.okis.dao;

import java.util.List;

import javax.sql.DataSource;

import org.okis.beans.Categoria;
import org.okis.model.CategoriaRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CategoriaDaoImpl extends JdbcDaoSupport implements ICategoriaDao {
	
	private DataSource dataSouce;

	public void setDataSouce(DataSource dataSouce) {
		this.dataSouce = dataSouce;
	}

	@Override
	public List<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		
		String sql = "select * from Categoria";
		
		List<Categoria> listado = getJdbcTemplate().query(sql, new CategoriaRowMapper());
		
		return listado;
	}

}
