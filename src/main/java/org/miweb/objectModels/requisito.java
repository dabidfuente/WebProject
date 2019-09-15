package org.miweb.objectModels;

import java.util.ArrayList;
import java.util.List;

public class requisito {

	String numRequisito="";
	String tituloRequisito ="";
	
	List<subRequisito> listaSubRequisitos = new ArrayList<subRequisito>();

	public String getNumRequisito() {
		return numRequisito;
	}

	public void setNumRequisito(String numRequisito) {
		this.numRequisito = numRequisito;
	}

	public String getTituloRequisito() {
		return tituloRequisito;
	}

	public void setTituloRequisito(String tituloRequisito) {
		this.tituloRequisito = tituloRequisito;
	}

	public List<subRequisito> getListaSubRequisitos() {
		return listaSubRequisitos;
	}

	public void setListaSubRequisitos(List<subRequisito> listaSubRequisitos) {
		this.listaSubRequisitos = listaSubRequisitos;
	}

	
}
