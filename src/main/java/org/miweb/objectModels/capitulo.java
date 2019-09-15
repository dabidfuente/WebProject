package org.miweb.objectModels;

import java.util.ArrayList;
import java.util.List;

public class capitulo {

	String numCapitulo="";
	String tituloCapitulo ="";
	
	List<requisito> listaRequisitos = new ArrayList<requisito>();

	public String getNumCapitulo() {
		return numCapitulo;
	}

	public void setNumCapitulo(String numCapitulo) {
		this.numCapitulo = numCapitulo;
	}

	public String getTituloCapitulo() {
		return tituloCapitulo;
	}

	public void setTituloCapitulo(String tituloCapitulo) {
		this.tituloCapitulo = tituloCapitulo;
	}

	public List<requisito> getListaRequisitos() {
		return listaRequisitos;
	}

	public void setListaRequisitos(List<requisito> listaRequisitos) {
		this.listaRequisitos = listaRequisitos;
	}
	
	

}
