package com.escuela.vector.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.vector.beans.FiltrosBean;
import com.escuela.vector.beans.FiltrosBean2;
import com.escuela.vector.beans.PruebaConexionBdBean;
import com.escuela.vector.beans.RespuestaBdBean;
import com.escuela.vector.bo.BoPruebaConexionBd;
import com.escuela.vector.dao.DaoPruebaConexionBd;

/**
 * The Class BoPruebaConexionBdImpl.
 */
@Service
public class BoPruebaConexionBdImpl implements BoPruebaConexionBd {
	
	/** The dao prueba conexion. */
	@Autowired
	private DaoPruebaConexionBd daoPruebaConexion;

	/* (non-Javadoc)
	 * @see com.escuela.vector.bo.BoPruebaConexionBd#pruebaConexion()
	 */
	@Override
	public PruebaConexionBdBean pruebaConexion() {
		RespuestaBdBean respuesta=daoPruebaConexion.pruebaConexion();
		PruebaConexionBdBean retorno = new PruebaConexionBdBean();
		for (int i = 0; i < respuesta.getResultadoQuery().size(); i++) {
			retorno.setCampoUno(respuesta.getResultadoQuery().get(i).get("NOMBRE").toString());
		}
		return retorno;
	}
	
	@Override
	public FiltrosBean filtrosConexion() {
		RespuestaBdBean respuesta = daoPruebaConexion.filtrosConexion();
		FiltrosBean retorno = new FiltrosBean();
		//List<FiltrosBean> retorno2 = new ArrayList<FiltrosBean>();
		List<String> proyecto = new ArrayList<String>();
		List<String> desde = new ArrayList<String>();
		List<String> hasta = new ArrayList<String>();
		List<String> folio = new ArrayList<String>();
		List<String> os = new ArrayList<String>();
		List<String> respVector = new ArrayList<String>();
		List<String> tecno = new ArrayList<String>();
		for (int i = 0; i < respuesta.getResultadoQuery().size(); i++) {
			/*retorno.setProyecto(respuesta.getResultadoQuery().get(i).get("PROYECTO").toString());
			retorno.setDesde(respuesta.getResultadoQuery().get(i).get("FECHA_DESDE").toString());
			retorno.setHasta(respuesta.getResultadoQuery().get(i).get("FECHA_HASTA").toString());
			//retorno.setOs(respuesta.getResultadoQuery().get(i).get("OS").toString());
			//retorno.setRespVector(respuesta.getResultadoQuery().get(i).get("RESPONSABLE").toString());
			//retorno.setFolio(respuesta.getResultadoQuery().get(i).get("FOLIO_SAP").toString());
			//retorno.setTecno(respuesta.getResultadoQuery().get(i).get("TECNOLOGIA").toString());
			retorno2.add(i, retorno);
			retorno2.get(i).setFolio(i+"");
			*/
			//txt = respuesta.getResultadoQuery().get(i).get("OS").toString().length();
			//tempo = respuesta.getResultadoQuery().get(i).get("OS").toString().substring(0,txt-1);
			//proyecto.add(respuesta.getResultadoQuery().get(i).get("PROYECTO").toString());
			//desde.add(respuesta.getResultadoQuery().get(i).get("FECHA_DESDE").toString());
			//hasta.add(respuesta.getResultadoQuery().get(i).get("FECHA_HASTA").toString());
			//folio.add(respuesta.getResultadoQuery().get(i).get("FOLIO_SAP").toString());
			//os.add(tempo);
			//respVector.add(respuesta.getResultadoQuery().get(i).get("RESPONSABLE").toString());
			//tecno.add(respuesta.getResultadoQuery().get(i).get("TECNOLOGIA").toString());
			proyecto.add(consulta(i,"PROYECTO",respuesta));
			desde.add(consulta(i,"FECHA_DESDE",respuesta));
			hasta.add(consulta(i,"FECHA_HASTA",respuesta));
			folio.add(consulta(i,"FOLIO_SAP",respuesta));
			os.add(consulta(i,"OS",respuesta));
			respVector.add(consulta(i,"RESPONSABLE",respuesta));
			tecno.add(consulta(i,"TECNOLOGIA",respuesta));
			//estado.add(consulta(i,"ESTADO",respuesta));
			
		}
		
		retorno.setProyecto(proyecto);
		retorno.setHasta(hasta);
		retorno.setOs(os);
		retorno.setRespVector(respVector);
		retorno.setDesde(desde);
		retorno.setFolio(folio);
		retorno.setTecno(tecno);
		
		return retorno;
	}
	
	private String consulta(int i, String campo, RespuestaBdBean respuesta) {
		String consulta="";
		int tam=0;
		tam = respuesta.getResultadoQuery().get(i).get(campo).toString().length();
		consulta = respuesta.getResultadoQuery().get(i).get(campo).toString().substring(0,tam-1);
		return consulta;
	}
	
	
	@Override
	public FiltrosBean cmbFiltrosConexion() {
		RespuestaBdBean cmbTecnologia=daoPruebaConexion.cmbTecnologia();
		RespuestaBdBean cmbRecursos=daoPruebaConexion.cmbRecursos();
		RespuestaBdBean cmbOs = daoPruebaConexion.cmbOs();
		//RespuestaBdBean cmbEjecutor=daoPruebaConexion.cmbEjecutor();
		//RespuestaBdBean cmbQat=daoPruebaConexion.cmbQat();
		//RespuestaBdBean cmbProveedor=daoPruebaConexion.cmbProveedor();
		//RespuestaBdBean cmbPagada=daoPruebaConexion.cmbPagada();
		RespuestaBdBean cmbProyecto=daoPruebaConexion.cmbProyecto();
		//RespuestaBdBean cmbOs=daoPruebaConexion.cmbOs()
		FiltrosBean retorno = new FiltrosBean();
		List<String> proyecto = new ArrayList<String>();
		List<String> desde = new ArrayList<String>();
		List<String> hasta = new ArrayList<String>();
		List<String> folio = new ArrayList<String>();
		List<String> os = new ArrayList<String>();
		List<String> respVector = new ArrayList<String>();
		List<String> tecno = new ArrayList<String>();
		List<String> estado = new ArrayList<String>();
		tecno = combos(cmbTecnologia,"TECNOLOGIA");
		estado = combos(cmbRecursos,"ESTADO");
		os = combos(cmbOs,"OS");
		retorno.setTecno(tecno);
		retorno.setEstado(estado);
		retorno.setProyecto(proyecto);
		retorno.setOs(os);
		return retorno;
	}
	
	private List<String> combos(RespuestaBdBean cmb,String campo) {
		List<String> atributo = new ArrayList<String>();
		for (int i = 0; i < cmb.getResultadoQuery().size(); i++) {
			if(consulta(i,campo,cmb).equals(" ")) {
				atributo.add("Vacio");
			}else {
				atributo.add(consulta(i,campo,cmb));
			}
		}
		return atributo;
	}
	
	@Override 
	public FiltrosBean busquedaProyecto(String condicion) {		
		RespuestaBdBean busqueda = daoPruebaConexion.busquedaProyecto(condicion);
		FiltrosBean retorno = new FiltrosBean();
		List<String> proyecto = new ArrayList<String>();
		List<String> desde = new ArrayList<String>();
		List<String> hasta = new ArrayList<String>();
		List<String> folio = new ArrayList<String>();
		List<String> os = new ArrayList<String>();
		List<String> respVector = new ArrayList<String>();
		List<String> tecno = new ArrayList<String>();
		List<String> estado = new ArrayList<String>();
		for(int i=0; i<busqueda.getResultadoQuery().size();i++) {
			proyecto.add(consulta(i,"PROYECTO",busqueda));
			desde.add(consulta(i,"FECHA_DESDE",busqueda));
			hasta.add(consulta(i,"FECHA_HASTA",busqueda));
			folio.add(consulta(i,"FOLIO_SAP",busqueda));
			os.add(consulta(i,"OS",busqueda));
			respVector.add(consulta(i,"RESPONSABLE",busqueda));
			tecno.add(consulta(i,"TECNOLOGIA",busqueda));
		}
		retorno.setTecno(tecno);
		retorno.setEstado(estado);
		retorno.setProyecto(proyecto);
		retorno.setOs(os);
		retorno.setDesde(desde);
		retorno.setFolio(folio);
		retorno.setHasta(hasta);
		return retorno;
	}
	
	@Override
	public FiltrosBean aplicarFiltros(String cdnos, String cdnfolio, String cdndesde,String cdnhasta) {
		
		//COMPLEMENTAR CON EL "LIKE"
		String condiciones="SELECT * FROM FILTROS WHERE OS LIKE '%"+ cdnos+"%' AND FOLIO_SAP LIKE '%"+cdnfolio+"%'";
		
		RespuestaBdBean busqueda = daoPruebaConexion.busquedaProyecto(condiciones);
		FiltrosBean retorno = new FiltrosBean();
		List<String> proyecto = new ArrayList<String>();
		List<String> desde = new ArrayList<String>();
		List<String> hasta = new ArrayList<String>();
		List<String> folio = new ArrayList<String>();
		List<String> os = new ArrayList<String>();
		List<String> respVector = new ArrayList<String>();
		List<String> tecno = new ArrayList<String>();
		List<String> estado = new ArrayList<String>();
		for(int i=0; i<busqueda.getResultadoQuery().size();i++) {
			proyecto.add(consulta(i,"PROYECTO",busqueda));
			desde.add(consulta(i,"FECHA_DESDE",busqueda));
			hasta.add(consulta(i,"FECHA_HASTA",busqueda));
			folio.add(consulta(i,"FOLIO_SAP",busqueda));
			os.add(consulta(i,"OS",busqueda));
			respVector.add(consulta(i,"RESPONSABLE",busqueda));
			tecno.add(consulta(i,"TECNOLOGIA",busqueda));
		}
		retorno.setTecno(tecno);
		retorno.setEstado(estado);
		retorno.setProyecto(proyecto);
		retorno.setOs(os);
		retorno.setDesde(desde);
		retorno.setFolio(folio);
		retorno.setHasta(hasta);
		return retorno;
	}
	
	@Override
	public List<FiltrosBean2> listaFiltros() {
		//String condiciones="SELECT * FROM FILTROS WHERE OS LIKE '%"+ cdnos+"%' AND FOLIO_SAP LIKE '%"+cdnfolio+"%'";
		String condiciones = "SELECT * FROM FILTROS WHERE OS LIKE '%CON-VEC%'";
		RespuestaBdBean busqueda = daoPruebaConexion.busquedaProyecto(condiciones);
		FiltrosBean2 retorno = new FiltrosBean2();
		List<FiltrosBean2> retorno2 = new ArrayList<FiltrosBean2>();
		for(int i=0; i<busqueda.getResultadoQuery().size();i++) {
			retorno.setProyecto((consulta(i,"PROYECTO",busqueda)));
			retorno.setDesde((consulta(i,"FECHA_DESDE",busqueda)));
			retorno.setHasta((consulta(i,"FECHA_HASTA",busqueda)));
			retorno.setFolio((consulta(i,"FOLIO_SAP",busqueda)));
			retorno.setOs((consulta(i,"OS",busqueda)));
			retorno.setRespVector((consulta(i,"RESPONSABLE",busqueda)));
			retorno.setTecno((consulta(i,"TECNOLOGIA",busqueda)));
			retorno2.add(retorno);
		}
		return retorno2;
	}

}
