package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {
	public static void main(String[] args) {
		Graficador graficador = new Graficador();
		Cuadrado cuadrado = new Cuadrado("Cuadrado", "Rojo", 8);
		Triangulo triangulo = new Triangulo("Triangulo", "Azul");
		Rectangulo rectangulo = new Rectangulo("Rectangulo", "Verde", 2, 4);
		
		graficador.graficador(rectangulo);
		graficador.graficador(triangulo);
		graficador.graficador(cuadrado);
	}
}
