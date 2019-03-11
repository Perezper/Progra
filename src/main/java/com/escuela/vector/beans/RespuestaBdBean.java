package com.escuela.vector.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class RespuestaBdBean.
 */
public class RespuestaBdBean implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3059511194208325885L;
	
	/** The estado operacion. */
	private int estadoOperacion;
	
	/** The resultado query. */
	private List<Map<String, Object>> resultadoQuery;
	
	/**
	 * Gets the estado operacion.
	 *
	 * @return the estado operacion
	 */
	public int getEstadoOperacion() {
		return estadoOperacion;
	}
	
	/**
	 * Sets the estado operacion.
	 *
	 * @param estadoOperacion the new estado operacion
	 */
	public void setEstadoOperacion(int estadoOperacion) {
		this.estadoOperacion = estadoOperacion;
	}
	
	/**
	 * Gets the resultado query.
	 *
	 * @return the resultado query
	 */
	public List<Map<String, Object>> getResultadoQuery() {
		return resultadoQuery;
	}
	
	/**
	 * Sets the resultado query.
	 *
	 * @param resultadoQuery the resultado query
	 */
	public void setResultadoQuery(List<Map<String, Object>> resultadoQuery) {
		this.resultadoQuery = resultadoQuery;
	}

}
