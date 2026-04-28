package com.krakedev.figuras;

public class Graficador {
	
	public void graficador(Figura figura) {
		System.out.println("Graficando: "+figura.getNombre()
		+" de color: "+figura.getColor());
		System.out.println("Perimetro: "+figura.calcularPerimetro());
	}
	
}
