package org.miweb.actions;

import java.sql.ResultSet;
import org.miweb.bbdd.*;
import org.miweb.objectModels.*;
import org.json.*;


import com.opensymphony.xwork2.ActionSupport;

public class CreateJsonAction extends ActionSupport {

	private int id_requisito=0;
	//private String nom_requisito="";
	ResultSet rs = null;
	public norma normaPCI = null;
	private capitulo capit= null;
	
	
	public CreateJsonAction() {
 
	}
	
	public String execute() throws Exception {
		try {
			
		    norma normaPCI = new norma();
		    
		    conexion con = new conexion();
		    con.creaConexion();
		    select select1 = new select();
		    
		    rs = select1.SelectTablaCapitulos(con.getConexion());
		    normaPCI.cargaNorma(rs);
					    
		    con.cierraConexion();

		    //Json
		    JSONObject jsonNorma = new JSONObject();
		    jsonNorma.put("Versión Norma PCI", normaPCI.getNombreNorma());
		    jsonNorma.put("Capitulos", normaPCI.getListaCapitulos());
		    
		    
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
    
    
	public int getId_requisito() {
		return id_requisito;
	}

	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
	}

	/*
	 * public String getNom_requisito() { return nom_requisito; }
	 * 
	 * public void setNom_requisito(String nom_requisito) { this.nom_requisito =
	 * nom_requisito; }
	 */
    
    
}
