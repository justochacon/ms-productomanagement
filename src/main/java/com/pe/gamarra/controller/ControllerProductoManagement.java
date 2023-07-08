package com.pe.gamarra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pe.gamarra.model.ConsultaProductoResquest;
import com.pe.gamarra.model.ConsultarProductoResponse;

@RestController
@RequestMapping("/productomanagement/v1")
public class ControllerProductoManagement {
	
	@GetMapping("/consultaproducto")
    @ResponseStatus(HttpStatus.OK)
    public List<Object> consultaProducto() {
		ConsultaProductoResquest response = new ConsultaProductoResquest();
		
		List<Object> list = new ArrayList<>();
		response.setPrenda("casaca");
		response.setMarca("adidas");
		response.setTalla("S");
		response.settienda("galeria azul");
		response.setPrecio("50.6");
		response.setCantidad("10");
		ConsultaProductoResquest response2 = new ConsultaProductoResquest();
		response2.setPrenda("casaca");
		response2.setMarca("nike");
		response2.setTalla("S");
		response2.settienda("galeria azul");
		response2.setPrecio("90.90");
		response2.setCantidad("10");
		list.add(response);
		list.add(response2);
		return list;
		
	}
	
	//-- HU007	Lista de Productos del Proveedor
	
	@PostMapping("/registrarproducto")
    @ResponseStatus(HttpStatus.OK)
    public Object registrarProducto(@RequestBody ConsultaProductoResquest request) {
		ConsultarProductoResponse response = new ConsultarProductoResponse();
		
		response.setCodRespuesta("00");
		response.setMsjRespuesta("registro correcto");
		response.setDescripcion("se enviara un correo con la confirmacion");
		response.setId(request.getTienda());
		return response;
		
	}

}
