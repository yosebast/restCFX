package org.okis.model;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.okis.beans.Productos;
import org.springframework.jdbc.core.RowMapper;

public class ProductoRowMapper implements RowMapper<Productos> {


	public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Productos p = new Productos();		
		p.setCategoria(rs.getInt("idcategoria"));
		p.setEstado(rs.getString("estado"));		
		p.setFechaPublicacion(rs.getDate("fechaPublicacion"));
		p.setIdProducto(rs.getInt("idproducto"));
		p.setNomImagen(rs.getString("nomImagen"));
		p.setPrecio(rs.getDouble("precio"));
		p.setSeccion(rs.getInt("idseccion"));
		p.setSubcategoria(rs.getInt("idsubcategoria"));
		p.setTitulo(rs.getString("titulo"));
		p.setUrlFoto(rs.getBlob("urlFoto1"));		
		p.setVisitas(rs.getInt("visitas"));
		
		return p;
	}
	
	
	
	
	

}
