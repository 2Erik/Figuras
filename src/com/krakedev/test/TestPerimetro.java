package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 8);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 8, 4);
		Graficador graficador = new Graficador();
		
		System.out.println("CUADRADO");
		System.out.println("Perimetro cuadrado: "+cuadrado.calcularPerimetro());
		graficador.graficador(cuadrado);
		System.out.println("RECTANGULO");
		System.out.println("Perimetro cuadrado: "+rectangulo.calcularPerimetro());
		graficador.graficador(rectangulo);
		
		System.out.println("FIGURA");
		Figura figura = new Figura("Sin nombre", "Verde");
		figura.calcularPerimetro();
		System.out.println("Perimetro cuadrado: "+figura.calcularPerimetro());
		
	}

}
