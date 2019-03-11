package com.escuela.vector.dao;

import com.escuela.vector.beans.RespuestaBdBean;

/**
 * The Interface DaoPruebaConexionBd.
 */
public interface DaoPruebaConexionBd {

	/**
	 * Prueba conexion.
	 *
	 * @return the respuesta bd bean
	 */
	RespuestaBdBean pruebaConexion();
	RespuestaBdBean filtrosConexion();
	RespuestaBdBean cmbTecnologia();
	RespuestaBdBean cmbRecursos();
	RespuestaBdBean cmbEjecutor();
	RespuestaBdBean cmbQat();
	RespuestaBdBean cmbProveedor();
	RespuestaBdBean cmbPagada();
	RespuestaBdBean cmbProyecto();
	RespuestaBdBean cmbOs();
	RespuestaBdBean busquedaProyecto(String condicion);
}
