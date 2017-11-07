package org.okis.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.okis.beans.Prestamo;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PrestamoDaoImpl extends JdbcDaoSupport implements PrestamoDao {

	@Override
	public List<Prestamo> listadoPrestamos() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM PRESTAMO";
		
		List<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for (Map<String, Object> map : rows) {
			Prestamo prestamo = new Prestamo();
			
			prestamo.setIdPrestamo(((Long) map.get("idPrestamo")).intValue());
			prestamo.setCantidad(((Long) map.get("cantidad")).intValue());
			prestamo.setTitular((String)map.get("titular"));
			
			prestamos.add(prestamo);
		}
		
		
		return prestamos;
	}
	
	
	
	

}
