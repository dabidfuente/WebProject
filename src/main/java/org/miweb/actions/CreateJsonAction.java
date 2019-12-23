package org.miweb.actions;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.miweb.bbdd.*;
import org.miweb.objectModels.*;
import org.json.*;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class CreateJsonAction extends ActionSupport {

	private int id_requisito=0;
	//private String nom_requisito="";
	private ResultSet rs = null;
	private norma normaPCI = null;
	private capitulo capit= null;
	private Gson gson = null;
	private String JSON = "";
	private List<capitulo> listaCapitulos =null;

	
	public CreateJsonAction() {
 
	}
	
	public String execute() throws Exception {
		
		
		try {
			listaCapitulos = new ArrayList<capitulo>(); 

		    norma normaPCI = new norma();
		  
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

		    normaPCI.cargaNorma(rs);
					    

		    con.cierraConexion();

		    //Json
		    JSONObject jsonNorma = new JSONObject();
		    jsonNorma.put("Versión Norma PCI", normaPCI.getNombreNorma());
		    jsonNorma.put("Capitulos", normaPCI.getListaCapitulos());
		    

		    gson = new Gson();
		    JSON = gson.toJson(capit);

		    System.out.println(JSON);
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return "success";
		return "success";
	}
    
    
	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Gson getGson() {
		return gson;
	}

	public void setGson(Gson gson) {
		this.gson = gson;
	}

	public List<capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(List<capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}

	public int getId_requisito() {
		return id_requisito;
	}

	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
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
