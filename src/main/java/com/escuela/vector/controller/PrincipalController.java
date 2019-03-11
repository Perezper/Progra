package com.escuela.vector.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.escuela.vector.beans.FiltrosBean;
import com.escuela.vector.beans.FiltrosBean2;
import com.escuela.vector.beans.PruebaConexionBdBean;
import com.escuela.vector.bo.BoPruebaConexionBd;

@Controller
@RequestMapping(value="/")
public class PrincipalController {
	
	@Autowired
	private BoPruebaConexionBd boPruebaConexion;

	 @RequestMapping(value="prueba")
	 public ModelAndView pruebaPagina () {
	 	System.out.println("prueba nuevo proyecto");
	 	return new ModelAndView("readingList");
	 }
	 
	 @RequestMapping(value="pruebaConexion")
	 public ResponseEntity<PruebaConexionBdBean> pruebaConexion(){
		 PruebaConexionBdBean respuesta;
		 respuesta = boPruebaConexion.pruebaConexion();
		 return new ResponseEntity<PruebaConexionBdBean>(respuesta,HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "index")
	 public @ResponseBody ModelAndView pruebaN() {
		 System.out.println("hola");
		 return new ModelAndView("dashboard");
	 }
	 
	 /*@RequestMapping(method=RequestMethod.GET, 
             value="{index}", 
             produces=MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<List<FiltrosBean>> obtenerFiltros() {
		 List<FiltrosBean> respuesta;
		 respuesta = boPruebaConexion.filtrosConexion();
		 return new ResponseEntity<List<FiltrosBean>>(respuesta, HttpStatus.OK);
	 }*/
	 
	 @RequestMapping(value = "filtros")
	 public ResponseEntity<FiltrosBean> tablero() {
		 System.out.println("a");
		 FiltrosBean respuesta;
		 respuesta = boPruebaConexion.filtrosConexion();
		 return new ResponseEntity<FiltrosBean>(respuesta, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "combos")
	 public ResponseEntity<FiltrosBean> combos() {
		 System.out.println("a");
		 FiltrosBean respuesta;
		 respuesta = boPruebaConexion.cmbFiltrosConexion();
		 return new ResponseEntity<FiltrosBean>(respuesta, HttpStatus.OK);
	 }
	 
	 
	 @RequestMapping(value = "pruebaBusquedaProyecto")
	 public ResponseEntity<FiltrosBean> busqueda() {
		 System.out.println("a");
		 String condicion="SELECT * FROM FILTROS";
		 FiltrosBean respuesta;
		 respuesta = boPruebaConexion.busquedaProyecto(condicion);
		 return new ResponseEntity<FiltrosBean>(respuesta, HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	 public String dashboard(Model model) {
		 List<FiltrosBean2> respuesta = boPruebaConexion.listaFiltros();
		 FiltrosBean respuesta2 = boPruebaConexion.filtrosConexion();
		 model.addAttribute("datosTbl", respuesta);
		 model.addAttribute("datosFiltros", respuesta2);
		 respuesta2.getOs().get(1);
	 
		 return "dashboard";
	 }
	 
	 @RequestMapping(value = "pruebaBusqueda")
	 public ResponseEntity<FiltrosBean> aplicarFiltros(String os,String folio,String desde, String hasta) {
		
		 FiltrosBean respuesta;
		 respuesta = boPruebaConexion.aplicarFiltros( os,folio,desde, hasta);
		 return new ResponseEntity<FiltrosBean>(respuesta, HttpStatus.OK);
	 }
	 
}
