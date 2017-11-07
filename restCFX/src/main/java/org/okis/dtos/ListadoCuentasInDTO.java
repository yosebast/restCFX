package org.okis.dtos;

import java.io.IOException;
import java.io.Serializable;




import org.okis.beans.Cuentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class ListadoCuentasInDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
		
	
	private  Cuentas cuenta;



	public Cuentas getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuentas cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Cuentas cuenta = new Cuentas(43434, "gghg");
		
		
		ListadoCuentasInDTO d = new ListadoCuentasInDTO();
		
		d.setCuenta(cuenta);
		
		System.out.println(new ObjectMapper().writeValueAsString(d));
	}
	

}
