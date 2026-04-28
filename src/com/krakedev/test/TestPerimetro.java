package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 8);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Azul", 8, 4);
		Graficador graficador = new Graficador();
		TrianguloRectangulo tr = new TrianguloRectangulo("TR", "Amarillo", 5, 4);
		Hexagono hexagono = new Hexagono("Exagono", "Verde", 8);
		
		System.out.println("CUADRADO");
		System.out.println("Perimetro cuadrado: "+cuadrado.calcularPerimetro());
		System.out.println("Area cuadrado: "+cuadrado.calculoArea());
		graficador.graficador(cuadrado);
		
		System.out.println("RECTANGULO");
		System.out.println("Perimetro cuadrado: "+rectangulo.calcularPerimetro());
		System.out.println("Area rectangulo: "+rectangulo.calculoArea());
		graficador.graficador(rectangulo);
		
		System.out.println("TR");
		System.out.println("Perimetro: "+tr.calcularPerimetro());
		System.out.println("Area; "+tr.calculoArea());
		graficador.graficador(tr);
		
		System.out.println("HEXAGONO");
		System.out.println("Perimetro: "+hexagono.calcularPerimetro());
		System.out.println("Area: "+hexagono.calculoArea());
		graficador.graficador(hexagono);
		
		
		
		
		
		
		
	}

}
