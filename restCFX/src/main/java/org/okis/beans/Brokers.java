package org.okis.beans;

public class Brokers {

	
	private Integer idBroker;
	private String  nombreBroker;
	private String  entidad;
	
	public Brokers(){
		
	}
	
	
	
	public Brokers(Integer idBroker, String nombreBroker, String entidad) {
		super();
		this.idBroker = idBroker;
		this.nombreBroker = nombreBroker;
		this.entidad = entidad;
	}



	public Integer getIdBroker() {
		return idBroker;
	}
	public void setIdBroker(Integer idBroker) {
		this.idBroker = idBroker;
	}
	public String getNombreBroker() {
		return nombreBroker;
	}
	public void setNombreBroker(String nombreBroker) {
		this.nombreBroker = nombreBroker;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	
	
	
}
