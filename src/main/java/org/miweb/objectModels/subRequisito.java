package org.miweb.objectModels;

import java.util.ArrayList;
import java.util.List;

public class subRequisito {
	
	String numSubRequisito="";
	String tituloSubRequisito="";
	
	List<procedimientoVerificacion> listaProcVerificacion = new ArrayList<procedimientoVerificacion>();
	
	
	public String getNumSubRequisito() {
		return numSubRequisito;
	}
	public void setNumSubRequisito(String numSubRequisito) {
		this.numSubRequisito = numSubRequisito;
	}
	public String getTituloSubRequisito() {
		return tituloSubRequisito;
	}
	public void setTituloSubRequisito(String tituloSubRequisito) {
		this.tituloSubRequisito = tituloSubRequisito;
	}
	public List<procedimientoVerificacion> getListaProcVerificacion() {
		return listaProcVerificacion;
	}
	public void setListaProcVerificacion(List<procedimientoVerificacion> listaProcVerificacion) {
		this.listaProcVerificacion = listaProcVerificacion;
	}
	
	

}
