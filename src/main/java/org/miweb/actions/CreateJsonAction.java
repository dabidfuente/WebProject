package org.miweb.actions;

import java.sql.ResultSet;
import org.miweb.bbdd.*;
import org.miweb.objectModels.*;


import com.opensymphony.xwork2.ActionSupport;

public class CreateJsonAction extends ActionSupport {

	private int id_requisito=0;
	private String nom_requisito="";
	ResultSet rs = null;
	private norma normaPCI = null;
	private capitulo capit= null;
	
	
	public CreateJsonAction() {
 
	}
	
	public String execute() throws Exception {
		try {
			
		    
		    conexion con = new conexion();
		    con.creaConexion(); 
		    select select1 = new select();
		    
		    rs = select1.SelectTablaCapitulos(con.getConexion());
		    
		    
			if (rs != null) {
				normaPCI = new norma();
				capit = new capitulo();
				
				while (rs.next()) {
					//Cambiar el nombre en BBDD
					capit.setNumCapitulo(rs.getString("numRequisito"));
					capit.setTituloCapitulo(rs.getString("tituloRequisito"));
					
				}
			}
			
		    con.cierraConexion();
		    


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

	public String getNom_requisito() {
		return nom_requisito;
	}

	public void setNom_requisito(String nom_requisito) {
		this.nom_requisito = nom_requisito;
	}
    
    
    
}
