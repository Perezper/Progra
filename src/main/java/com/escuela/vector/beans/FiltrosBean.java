package com.escuela.vector.beans;

import java.util.List;

public class FiltrosBean {
	

	private static final long serialVersionUID = -5940213609925930422L;
	/*
	private String os;
	private String respVector;
	private String tecno;
	private String desde;
	private String hasta;
	private String folio;
	private String proyecto;
	*/
	
	private List<String> os;
	private List<String> respVector;
	private List<String> tecno;
	private List<String> desde;
	private List<String> hasta;
	private List<String> folio;
	private List<String> proyecto;
	private List<String> estado;
	public List<String> getEstado() {
		return estado;
	}
	public void setEstado(List<String> estado) {
		this.estado = estado;
	}
	public List<String> getOs() {
		return os;
	}
	public void setOs(List<String> os) {
		this.os = os;
	}
	public List<String> getRespVector() {
		return respVector;
	}
	public void setRespVector(List<String> respVector) {
		this.respVector = respVector;
	}
	public List<String> getTecno() {
		return tecno;
	}
	public void setTecno(List<String> tecno) {
		this.tecno = tecno;
	}
	public List<String> getDesde() {
		return desde;
	}
	public void setDesde(List<String> desde) {
		this.desde = desde;
	}
	public List<String> getHasta() {
		return hasta;
	}
	public void setHasta(List<String> hasta) {
		this.hasta = hasta;
	}
	public List<String> getFolio() {
		return folio;
	}
	public void setFolio(List<String> folio) {
		this.folio = folio;
	}
	public List<String> getProyecto() {
		return proyecto;
	}
	public void setProyecto(List<String> proyecto) {
		this.proyecto = proyecto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
