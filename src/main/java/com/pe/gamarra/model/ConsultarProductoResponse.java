package com.pe.gamarra.model;

public class ConsultarProductoResponse {
	
	private String id;
	private String codRespuesta;
	private String msjRespuesta;
	private String descripcion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodRespuesta() {
		return codRespuesta;
	}
	public void setCodRespuesta(String codRespuesta) {
		this.codRespuesta = codRespuesta;
	}
	public String getMsjRespuesta() {
		return msjRespuesta;
	}
	public void setMsjRespuesta(String msjRespuesta) {
		this.msjRespuesta = msjRespuesta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
