package org.miweb.bbdd;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.jdbc.*;

import java.util.Properties;
import java.util.logging.*;
import java.io.*;



public class conexion {

	
private Connection conexion=null;
	
	public conexion(){
		
		Properties propiedades = new Properties();
		InputStream entrada = null;
		    
		try{
			//LogManager.getLogManager().readConfiguration(
			//	        new FileInputStream("./log.properties"));
			
			//Logger.getLogger(getClass().getName()).log(
		    //        Level.INFO, "Iniciando Conexion...");
			
			entrada = new FileInputStream("configuracion.properties");

			// cargamos el archivo de propiedades
			propiedades.load(entrada);
			
			MysqlDataSource dataSource = new MysqlDataSource();
				
			dataSource.setServerName(propiedades.getProperty("serverName"));
			dataSource.setDatabaseName(propiedades.getProperty("dataBaseName"));
			dataSource.setUser(propiedades.getProperty("user"));
			dataSource.setPassword(propiedades.getProperty("pass"));
			
			
			
			this.conexion = (Connection) dataSource.getConnection();
			Logger.getLogger(getClass().getName()).log(
		            Level.INFO, "Conexion OK !!!");
			//System.out.println("Conexion establecida!");
			//System.out.println();
			
		
			}
			
			catch (IOException ex) {
				ex.printStackTrace();
			} 
			catch (SQLException sql){
				sql.printStackTrace();
				Logger.getLogger(getClass().getName()).log(
			            Level.SEVERE, "Mensaje crítico...", sql);
			}
			catch (Exception err) {
	        
	        Logger.getLogger(getClass().getName()).log(
	            Level.SEVERE, "Mensaje crítico...", err);
	    }
		
		}	

	
	public void cierraConexion(){
		try {
			this.conexion.close();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public Connection getConexion() {
		return conexion;
	}

	 public static void main(String[] args){ 
		 conexion c1 = new conexion();
		 
		 
	 }
}
