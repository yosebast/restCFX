package org.okis.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.okis.beans.Brokers;

public class ListadoBrokersOutDTOImpl  implements Serializable, ListadoBrokersOutDTO {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public List<Brokers> getListadoBrokers() {
		return listadoBrokers;
	}





	public void setListadoBrokers(List<Brokers> listadoBrokers) {
		this.listadoBrokers = listadoBrokers;
	}





	private List<Brokers> listadoBrokers;





	public List<Brokers> listadoBrokers(Brokers in) {
		// TODO Auto-generated method stub
		
		//obtengo los brokers por entidades
		
		 listadoBrokers = new ArrayList<Brokers>();
		
		List<Brokers> lista = new ArrayList<Brokers>();
		
		
		
		lista.add(new Brokers(1, "Agustin", "santander"));
		lista.add(new Brokers(1, "sebatian", "Bankia"));
		lista.add(new Brokers(3, "Arturo", "BBVA"));
		lista.add(new Brokers(4, "Oscar", "Popular"));
		
		
		for (Brokers brokers : lista) {
			
			if(brokers != null && brokers.getIdBroker()== in.getIdBroker() && brokers.getEntidad().equals(in.getEntidad())){
				
				listadoBrokers.add(brokers);
			}
			
		}
		
		
		
				
		return listadoBrokers;
	}

}
