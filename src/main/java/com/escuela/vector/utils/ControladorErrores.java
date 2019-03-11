package com.escuela.vector.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.escuela.vector.beans.MensajeErrores;

/**
 * The Class ControladorErrores.
 */
@ControllerAdvice
public class ControladorErrores {
	
	/**
	 * SQL exception.
	 *
	 * @param request the request
	 * @param e the e
	 * @return the response entity
	 */
	@ExceptionHandler(java.sql.SQLException.class) 
	public ResponseEntity<MensajeErrores> SQLException (HttpServletRequest request, java.sql.SQLException e) {
		MensajeErrores mensaje = new MensajeErrores();
        mensaje.setCodigoError(String.valueOf(e.getErrorCode()));
        mensaje.setMensajeError(e.getMessage());
		return new ResponseEntity<MensajeErrores>(mensaje,HttpStatus.BAD_REQUEST);
	}

}
