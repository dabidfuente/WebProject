package org.miweb.bbdd;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.mysql.jdbc.*;

import java.util.Properties;
import java.util.logging.*;
import java.io.*;



public class conexion {

	
private Connection conexion=null;
	
	MysqlDataSource dataSource = null;
	
	
	public conexion(){
		
		dataSource = new MysqlDataSource();
		
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("miwebbbdd");
		dataSource.setUser("root");
		dataSource.setPassword("DabidRoot");

	}

	public void creaConexion() {
		
			try {
				this.conexion = (Connection) dataSource.getConnection();
			}
			
			catch (SQLException sql){
				sql.printStackTrace();
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
}
