package org.okis.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.okis.beans.Usuarios;
import org.okis.model.UsuariosRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UsuariosDaoImpl extends JdbcDaoSupport implements IUsuarioDao {

	
	private Logger logger = Logger.getLogger(UsuariosDaoImpl.class);
	@Override
	public List<Usuarios> listadoUsuarios() {
		// TODO Auto-generated method stub
		
		logger.debug("Entra al metodo listadoUsuarios");
		
		
		
		String sql = "select * from Usuarios";
		
			List<Usuarios> listado = getJdbcTemplate().query(sql, new UsuariosRowMapper());
		
		return listado;
	}

}
