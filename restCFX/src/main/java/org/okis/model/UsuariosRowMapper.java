package org.okis.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.okis.beans.Usuarios;
import org.springframework.jdbc.core.RowMapper;

public class UsuariosRowMapper implements RowMapper<Usuarios> {

	@Override
	public Usuarios mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Usuarios u = new Usuarios();
		
		u.setApellidos(rs.getString("apellidos"));
		u.setClave(rs.getString("clave"));
		u.setEdad(rs.getInt("edad"));
		u.setEmail(rs.getString("email"));
		u.setFotoUrl(rs.getString("fotoUrl"));
		u.setIdusuario(rs.getInt("idusuario"));
		u.setNombre(rs.getString("nombre"));
		u.setReg_date(rs.getDate("reg_date"));
		u.setTlf(rs.getString("tlf"));		
		return u;
	}

}
