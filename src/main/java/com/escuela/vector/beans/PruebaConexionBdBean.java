package com.escuela.vector.beans;

import java.io.Serializable;

/**
 * The Class PruebaConexionBdBean.
 */
public class PruebaConexionBdBean implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5940213609925930422L;
	
	/** The campo uno. */
	private String campoUno;
	
	/** The campo dos. */
	private String campoDos;
	
	/** The campo tres. */
	private String campoTres;
	
	/**
	 * Gets the campo uno.
	 *
	 * @return the campo uno
	 */
	public String getCampoUno() {
		return campoUno;
	}
	
	/**
	 * Sets the campo uno.
	 *
	 * @param campoUno the new campo uno
	 */
	public void setCampoUno(String campoUno) {
		this.campoUno = campoUno;
	}
	
	/**
	 * Gets the campo dos.
	 *
	 * @return the campo dos
	 */
	public String getCampoDos() {
		return campoDos;
	}
	
	/**
	 * Sets the campo dos.
	 *
	 * @param campoDos the new campo dos
	 */
	public void setCampoDos(String campoDos) {
		this.campoDos = campoDos;
	}
	
	/**
	 * Gets the campo tres.
	 *
	 * @return the campo tres
	 */
	public String getCampoTres() {
		return campoTres;
	}
	
	/**
	 * Sets the campo tres.
	 *
	 * @param campoTres the new campo tres
	 */
	public void setCampoTres(String campoTres) {
		this.campoTres = campoTres;
	}
	
	
}
