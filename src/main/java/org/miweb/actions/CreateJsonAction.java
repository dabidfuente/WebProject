package org.miweb.actions;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.miweb.bbdd.*;
import org.miweb.objectModels.*;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class CreateJsonAction extends ActionSupport {

	private int id_requisito=0;
	private String nom_requisito="";
	ResultSet rs = null;
	private norma normaPCI = null;
	public capitulo capit= null;
	Gson gson = null;
	private String JSON = "";
	List<capitulo> listaCapitulos =null;
	
	public CreateJsonAction() {
 
	}
	
	public String execute() throws Exception {
		
		
		try {
			listaCapitulos = new ArrayList<capitulo>(); 
			
			System.out.println("HOLA");
		    conexion con = new conexion();
		    con.creaConexion(); 
		    select select1 = new select();
		   
		    //select1.pruebaSelect(con.getConexion());
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
			
			listaCapitulos.add(capit);
			normaPCI.setListaCapitulos(listaCapitulos);
			
			System.out.println(capit.getNumCapitulo());
			System.out.println(capit.getTituloCapitulo());
		    con.cierraConexion();
		    
		    gson = new Gson();
		    JSON = gson.toJson(capit);

		    System.out.println(JSON);
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return "success";
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

	public norma getNormaPCI() {
		return normaPCI;
	}

	public void setNormaPCI(norma normaPCI) {
		this.normaPCI = normaPCI;
	}

	public capitulo getCapit() {
		return capit;
	}

	public void setCapit(capitulo capit) {
		this.capit = capit;
	}

	public String getJSON() {
		return JSON;
	}

	public void setJSON(String jSON) {
		JSON = jSON;
	}
    
    
    
}
