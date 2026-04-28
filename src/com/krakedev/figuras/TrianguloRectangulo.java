package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {
	private int catetoA;
	private int catrtoB;
	private int hipotenusa;
	
	public TrianguloRectangulo(String nombre, String color) {
		super(nombre, color);
	}

	public TrianguloRectangulo(String nombre, String color, int catetoA, int catrtoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catrtoB = catrtoB;
		calcularHipotenusa();
	}
	
	
	private void calcularHipotenusa() {
		double hipotenusaDouble = Math.sqrt(catetoA^2 + catrtoB^2);
		hipotenusa = (int)Math.round(hipotenusaDouble);
	}
	
	@Override
	public int calcularPerimetro() {
		return catetoA+catrtoB+hipotenusa;
	}
	
	@Override
	public double calculoArea() {
		return (catetoA*catrtoB)/2;
	}
}
