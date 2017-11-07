package org.okis.dtos;

import java.io.Serializable;

import org.okis.beans.Brokers;

public class ListadoBrokersInDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Brokers broker;

	public Brokers getBroker() {
		return broker;
	}

	public void setBroker(Brokers broker) {
		this.broker = broker;
	}
	
	
	

}
