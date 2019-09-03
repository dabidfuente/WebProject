package org.miweb.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class conexionBBDD {

	private Connection conexion;
	
	
	private Connection creaConexion() {
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/miwebbbdd", "root", "DabidRoot");
				
		 }
		 catch (Exception e) {
			
		 }
		
		 return conexion;
	}
	
	private void cierraConexion(){
		try {
			conexion.close();
		}
		catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
        System.out.println("Inicio");
        System.out.println("Conexion");
        
        conexionBBDD con = new conexionBBDD();
        con.creaConexion();
        System.out.println("Conexion creada");
        
        DAO query1 = new DAO();
        
        System.out.println("------------");
        con.cierraConexion();
        System.out.println("Conexion cerrada");
        
        
    }
}
