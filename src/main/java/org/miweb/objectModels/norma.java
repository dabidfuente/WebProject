package org.miweb.objectModels;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class norma {

	private String nombreNorma="PCI DSS v3.2.1";
	
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
	
	public void cargaNorma(ResultSet rs) {
		capitulo auxCap = new capitulo();
		
		try {
			if (rs != null) {
				while (rs.next()) {
					auxCap.setNumCapitulo(rs.getString("numRequisito"));
					auxCap.setTituloCapitulo(rs.getString("tituloRequisito"));
					listaCapitulos.add(auxCap);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	public String toString() {
		
		return listaCapitulos.toString();
		
	}
}
