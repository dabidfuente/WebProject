package org.miweb.actions;

import org.miweb.bbdd.conexion;
import org.miweb.bbdd.select;

import com.opensymphony.xwork2.ActionSupport;

public class CreateJsonAction extends ActionSupport {

	private int id_requisito=0;
	private String nom_requisito="";
	
	
	public CreateJsonAction() {
 
	}
	
	public String execute() throws Exception {
		try {
			
		    
		    conexion con = new conexion();
		     
		    select consulta = new select(con.getConexion());

		    con.cierraConexion();


		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
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
