package org.okis.dtos;


import java.util.List;



import org.okis.beans.Cuentas;






public class ListadoCuentasOutDTO {	
	
	
private List<Cuentas> cuentascorrientes;


public List<Cuentas> getCuentascorrientes() {
	return cuentascorrientes;
}

public void setCuentascorrientes(List<Cuentas> cuentascorrientes) {
	this.cuentascorrientes = cuentascorrientes;
}
	
/*
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
List<Cuentas> cuenta = new ArrayList<Cuentas>();
	
	
			cuenta.add(new Cuentas(123456789, "sebast"));
			cuenta.add(new Cuentas(15684899, "vlady"));
			cuenta.add(new Cuentas(745785478, "ceca"));
			
	
	
	ListadoCuentasOutDTO d = new ListadoCuentasOutDTO();
	
	d.setCuentascorrientes(cuenta);
	
	System.out.println(new ObjectMapper().writeValueAsString(d));
}*/

	
/*
public static  List<Cuentas> cuenta = new ArrayList<Cuentas>();
	
	static {
		
		try {
			
			cuenta.add(new Cuentas(123456789, "sebast"));
			cuenta.add(new Cuentas(15684899, "vlady"));
			cuenta.add(new Cuentas(745785478, "ceca"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/

	
}
