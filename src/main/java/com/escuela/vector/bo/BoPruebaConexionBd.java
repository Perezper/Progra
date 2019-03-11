package com.escuela.vector.bo;

import java.util.List;

import com.escuela.vector.beans.FiltrosBean;
import com.escuela.vector.beans.FiltrosBean2;
import com.escuela.vector.beans.PruebaConexionBdBean;

/**
 * The Interface BoPruebaConexionBd.
 */
public interface BoPruebaConexionBd {
	
	/**
	 * Prueba conexion.
	 *
	 * @return the prueba conexion bd bean
	 */
	PruebaConexionBdBean pruebaConexion();
	FiltrosBean filtrosConexion();
	FiltrosBean cmbFiltrosConexion();
	FiltrosBean busquedaProyecto(String condicion);
	FiltrosBean aplicarFiltros(String cdnos, String cdnfolio, String cdndesde, String cdnhasta);
	List<FiltrosBean2> listaFiltros();
}
