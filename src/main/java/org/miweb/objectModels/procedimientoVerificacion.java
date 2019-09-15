package org.miweb.objectModels;

import java.util.ArrayList;
import java.util.List;

public class procedimientoVerificacion {

	String numProcedimientoVerificacion = "";
	String tituloProcedimientoVerificacion = "";
	
	List<procedimientoVerificacion> listaProcVerificacion = new ArrayList<procedimientoVerificacion>();	
	
	public String getNumProcedimientoVerificacion() {
		return numProcedimientoVerificacion;
	}
	public void setNumProcedimientoVerificacion(String numProcedimientoVerificacion) {
		this.numProcedimientoVerificacion = numProcedimientoVerificacion;
	}
	public String getTituloProcedimientoVerificacion() {
		return tituloProcedimientoVerificacion;
	}
	public void setTituloProcedimientoVerificacion(String tituloProcedimientoVerificacion) {
		this.tituloProcedimientoVerificacion = tituloProcedimientoVerificacion;
	}
	
	
}
