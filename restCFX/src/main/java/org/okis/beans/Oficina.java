package org.okis.beans;

public class Oficina {

	private Integer numero;
	private String direccion;
	private Integer codPostal;
	
	public Oficina(){}
	
	public Oficina(Integer numero, String direccion, Integer codPostal) {
		super();
		this.numero = numero;
		this.direccion = direccion;
		this.codPostal = codPostal;
	}



	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	public Integer getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(Integer codPostal) {
		this.codPostal = codPostal;
	}
	
/*public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Oficina d = new Oficina();
		
		System.out.println(new ObjectMapper().writeValueAsString(d));
	}*/
	
}
