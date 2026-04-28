package com.krakedev.figuras;

public class Hexagono extends Figura {
	
	private int lado;
	
	//CONSTRUCTOR
	public Hexagono(String nombre, String color, int lado) {
		super(nombre, color);
		this.lado = lado;
	}
	
	//METODOS ABTRACTOS
	@Override
	public int calcularPerimetro() {
		return 6*lado;
	}

	@Override
	public double calculoArea() {
		return (3*Math.sqrt(3)*lado*lado)/2;
	}
	
	//GETTERS AND SETTERS
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	

}
