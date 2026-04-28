package com.krakedev.figuras;

public abstract class Figura {
	private String nombre;
	private String color;
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//METODO toString
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Color=" + color;
	}
	
	//CONSTRUCTOR
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	
	public abstract int calcularPerimetro();
	
	public abstract double calculoArea();
}
