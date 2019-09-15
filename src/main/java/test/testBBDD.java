package test;

import org.miweb.bbdd.conexion;
import org.miweb.bbdd.select;

public class testBBDD {

	public static void main(String[] args) {
        System.out.println("Inicio");
        System.out.println("Conexion");
        
        conexion con = new conexion();
        System.out.println("Conexion creada");
        
        select consulta = new select();
        consulta.pruebaSelect(con.getConexion());
        con.cierraConexion();
        
        
        System.out.println("------------");
        con.cierraConexion();
        System.out.println("Conexion cerrada");
        
        
    }
	
}
