package org.miweb.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {

	ResultSet rs=null;
	public select(){
		
	}
	
	public void pruebaSelect(Connection con){
		try{
			Statement s = (Statement) con.createStatement();
			rs = (ResultSet) s.executeQuery ("select * from miwebbbdd.capitulos");
			//rs = (ResultSet) s.executeQuery ("select * from clientes where nombre like '%david%'");
			rs.toString();
			System.out.println("Listamos los datos de BBDD");
			System.out.println("----------------------------------");
			while (rs.next())
			{
				
			    System.out.println (rs.getInt (1) + " " + rs.getString (2));
			}
		}
		
		catch(SQLException sql){
			sql.printStackTrace();
		}
	}
	

	public static ResultSet SelectTablaCapitulos(Connection con) {
			ResultSet rs = null;
			try {
				Statement s = (Statement) con.createStatement();
				rs = (ResultSet) s.executeQuery ("select * from miwebbbdd.capitulos");
				return rs;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	
}
