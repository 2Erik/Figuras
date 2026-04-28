package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura figura = new Figura("FIG", "Rojo");
		Cuadrado cuadrado = new Cuadrado("CUADRADO", "AZUL", 8);
		Triangulo triangulo = new Triangulo("TRIANGULO", "PURPURA");
		
		System.out.println("FIGURA");
		System.out.println(figura);
		System.out.println("CUADRADO");
		System.out.println(cuadrado);
		System.out.println("TRIANGULO");
		System.out.println(triangulo);
	}

}
