package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 8);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 8, 4);
		
		int PCuadrado = cuadrado.calcularPerimetro();
		int PRectangulo = rectangulo.calcularPerimetro();
		System.out.println("Perimetro cuadrado: "+PCuadrado);
		System.out.println("Perimetro cuadrado: "+PRectangulo);
	}

}
