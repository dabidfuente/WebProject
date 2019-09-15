package org.miweb.objectModels;

import java.util.ArrayList;
import java.util.List;

public class norma {

	String nombreNorma="PCI DSS v3.2.1";
	
	List<capitulo> listaCapitulos = new ArrayList<capitulo>();

	public String getNombreNorma() {
		return nombreNorma;
	}

	public void setNombreNorma(String nombreNorma) {
		this.nombreNorma = nombreNorma;
	}

	public List<capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(List<capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}
	
	
}
