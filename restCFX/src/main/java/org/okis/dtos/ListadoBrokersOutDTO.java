package org.okis.dtos;

import java.util.List;

import org.okis.beans.Acciones;
import org.okis.beans.Bonos;
import org.okis.beans.Brokers;

public interface ListadoBrokersOutDTO {
	
	public List<Brokers> listadoBrokers(Brokers in);
	

}
