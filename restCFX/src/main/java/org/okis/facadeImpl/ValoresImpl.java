package org.okis.facadeImpl;


import org.okis.beans.Acciones;
import org.okis.beans.Brokers;
import org.okis.dtos.ListadoAccionesInDTO;
import org.okis.dtos.ListadoAccionesOutDTO;
import org.okis.dtos.ListadoAccionesOutDTOImpl;
import org.okis.dtos.ListadoBonosInDTO;
import org.okis.dtos.ListadoBonosOutDTO;
import org.okis.dtos.ListadoBonosOutDTOImpl;
import org.okis.dtos.ListadoBrokersInDTO;
import org.okis.dtos.ListadoBrokersOutDTO;
import org.okis.dtos.ListadoBrokersOutDTOImpl;
import org.okis.facade.IValores;

public class ValoresImpl implements IValores {
	
	//inicio acciones//
	private Acciones accion;	
	private ListadoAccionesOutDTO laoDTO;
	
	public void setLaoDTO(ListadoAccionesOutDTO laoDTO) {
		this.laoDTO = laoDTO;
	}

	//fin acciones
	
	//inicio brokers
	private Brokers  broker;
	
	private ListadoBrokersOutDTO listaOUT;
	
	
	public void setListaOUT(ListadoBrokersOutDTO listaOUT) {
		this.listaOUT = listaOUT;
	}
	
	
	//fin brokers
	
	
	//inicio bonos
	
	private ListadoBonosOutDTO listaBono;
	
	public void setListaBono(ListadoBonosOutDTO listaBono) {
		this.listaBono = listaBono;
	}
	
	//fin bonos

	





	


	@Override
	public ListadoAccionesOutDTOImpl obtenerListadoValores(ListadoAccionesInDTO in) throws Exception {
		// TODO Auto-generated method stub
		
		accion = in.getAccion();
		
		laoDTO.listaAcciones(accion);
		
		return (ListadoAccionesOutDTOImpl) laoDTO;
	}
	
	@Override
	public ListadoBrokersOutDTOImpl obtieneListadoBrokers(ListadoBrokersInDTO in) throws Exception {
		
		broker = in.getBroker();
		
		listaOUT.listadoBrokers(broker);
		
		return (ListadoBrokersOutDTOImpl) listaOUT;	
		
		
	}



	@Override
	public ListadoBonosOutDTOImpl obtieneListadoBonos(ListadoBonosInDTO in) throws Exception {
		// TODO Auto-generated method stub
		
		listaBono.listaBonos(in);
		return (ListadoBonosOutDTOImpl) listaBono;
	}
	
	
	

}
