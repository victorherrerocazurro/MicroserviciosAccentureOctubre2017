package com.example.notificaciones.dto;

public class NotificacionDto {
	private Long id;
	private String tipoNotificacion;
	public NotificacionDto(Long id, String tipoNotificacion) {
		super();
		this.id = id;
		this.tipoNotificacion = tipoNotificacion;
	}
	public NotificacionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoNotificacion() {
		return tipoNotificacion;
	}
	public void setTipoNotificacion(String tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}
	
}
