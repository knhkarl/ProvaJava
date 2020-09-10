package br.edu.univas.vo;

public class MassaPizza implements Ingredients{

	@Override
	public String description() {
		return "Pizza";
	}
	
	@Override
	public double price() {
		return 10;
	}

}
