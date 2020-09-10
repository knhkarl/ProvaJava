package br.edu.univas.vo;

public class Onions implements Ingredients{

	@Override
	public String description() {
		return "Cebola";
	}

	@Override
	public double price() {
		return 1.5;
	}
}
