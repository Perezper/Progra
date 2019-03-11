package com.escuela.vector.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.escuela.vector.beans.RespuestaBdBean;
import com.escuela.vector.dao.DaoPruebaConexionBd;
@Service
public class DaoPruebaConexionBdImpl implements DaoPruebaConexionBd {
	
	@Autowired
	private JdbcTemplate conexion;

	@Override
	public RespuestaBdBean pruebaConexion() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList("SELECT * FROM TBL_ARCHIVOGMS"));
		
		return retorno;
	}
	
	@Override
	public RespuestaBdBean filtrosConexion() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList("sELECT distinct * from filtros where substr(OS,1,7) = 'CON-VEC'"));
		return retorno;
	}
	
	@Override
	public RespuestaBdBean cmbTecnologia() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(" SELECT DISTINCT TECNOLOGIA FROM TBL_ARCHIVOGSE"));
		return retorno;
	}
	
	@Override
	public RespuestaBdBean cmbRecursos() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(" SELECT DISTINCT ESTADO FROM TBL_ARCHIVOGMS"));
		return retorno;
	}
	
	//
	// IMPORTANTE : FALTA EDITAR
	// LA CONSULTA NO ES LA CORRECTA
	//
	@Override
	public RespuestaBdBean cmbEjecutor() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(""));
		return retorno;
	}
	
	//
	// IMPORTANTE : FALTA EDITAR
	// LA CONSULTA NO ES LA CORRECTA
	//
	@Override
	public RespuestaBdBean cmbQat() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(""));
		return retorno;
	}

	//
	// IMPORTANTE : FALTA EDITAR
	// LA CONSULTA NO ES LA CORRECTA
	//
	@Override
	public RespuestaBdBean cmbProveedor() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(""));
		return retorno;
	}
	
	//
	// IMPORTANTE : FALTA EDITAR
	// LA CONSULTA NO ES LA CORRECTA
	//
	@Override
	public RespuestaBdBean cmbPagada() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(""));
		return retorno;
	}
	
	@Override
	public RespuestaBdBean cmbProyecto() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(" SELECT * PROYECTO FROM TBL_ARCHIVOGMS"));
		return retorno;
	}
	
	//
	// IMPORTANTE : FALTA EDITAR
	// LA CONSULTA NO ES LA CORRECTA
	//
	@Override
	public RespuestaBdBean cmbOs() {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList("select distinct substr(OS,1,7)||' ' as OS from filtros"));
		return retorno;
	}
	
	@Override
	public RespuestaBdBean busquedaProyecto(String condicion) {
		RespuestaBdBean retorno = new RespuestaBdBean();
		retorno.setResultadoQuery(conexion.queryForList(condicion));
		return retorno;
	}
}
