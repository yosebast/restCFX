package org.okis.beans;

import java.io.File;



import org.springframework.stereotype.Component;



public class Cuentas {

	private Integer numero;	
	private String titular;

	public Cuentas(){}
	
	
	
	
	
	public Cuentas(Integer numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}




	public Integer getNumero() {
		return numero;
	}

	
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	
	

	public String getTitular() {
		return titular;
	}

	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	
	public static void main(String[] args) {
		
		
		 String filePath = "C:" + File.separator + "Entorno"+File.separator+"ficheros"+File.separator;                
	
	System.out.println(filePath);
	}
	
	
	
	
}
