package com.escuela.vector.beans;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class MensajeErrores.
 */
public class MensajeErrores implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -810583428138567680L;
	
	/** The Mensaje error. */
	private String MensajeError;
	
	/** The Codigo error. */
	private String CodigoError;
	
	/**
	 * Gets the mensaje error.
	 *
	 * @return the mensaje error
	 */
	public String getMensajeError() {
		return MensajeError;
	}
	
	/**
	 * Sets the mensaje error.
	 *
	 * @param mensajeError the new mensaje error
	 */
	public void setMensajeError(String mensajeError) {
		MensajeError = mensajeError;
	}
	
	/**
	 * Gets the codigo error.
	 *
	 * @return the codigo error
	 */
	public String getCodigoError() {
		return CodigoError;
	}
	
	/**
	 * Sets the codigo error.
	 *
	 * @param codigoError the new codigo error
	 */
	public void setCodigoError(String codigoError) {
		CodigoError = codigoError;
	}

}
