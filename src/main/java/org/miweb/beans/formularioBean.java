package org.miweb.beans;

import java.util.List;
import java.util.ArrayList;
import org.miweb.objectModels.*;



public class formularioBean {

	private String idRequisito ="";
	private String requisito ="";
	private List<requisito> listaRequisitos;

	public String getIdRequisito() {
		return idRequisito;
	}
	public void setIdRequisito(String idRequisito) {
		this.idRequisito = idRequisito;
	}
	public String getRequisito() {
		return requisito;
	}
	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	public List<requisito> getListaRequisitos() {
		return listaRequisitos;
	}
	public void setListaRequisitos(List<requisito> listaRequisitos) {
		this.listaRequisitos = listaRequisitos;
	}
	
	
}
