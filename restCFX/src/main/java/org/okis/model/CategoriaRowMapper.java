package org.okis.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.okis.beans.Categoria;
import org.springframework.jdbc.core.RowMapper;

public class CategoriaRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Categoria cat = new Categoria();
		
		cat.setIdcategoria(rs.getInt("idcategoria"));
		cat.setNomcategoria(rs.getString("nomcategoria"));
		cat.setDescripcion(rs.getString("descripcion"));
				
		return cat;
	}

}
