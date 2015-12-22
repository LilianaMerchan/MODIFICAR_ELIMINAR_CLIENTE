package com.demo.entidades;

public class Cliente {
	
	private String identificacion;
	private String nombres;
	private String apellidos;
	private int edad;
	
	public Cliente(){
		
	}
	
	public Cliente(String identificacion, String nombres, String apellidos,
			int edad) {
		super();
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [identificacion=" + identificacion + ", nombres="
				+ nombres + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

}


