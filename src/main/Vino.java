package main;

import java.time.LocalDate;

public class Vino extends ProductoConDescuento implements EsLiquido, EsAlimento{

	private String tipoVino;
	private	double gradoAlcohol;
	private double volumen;
	private String tipoEnvase;
	private LocalDate caducidad;
	
	public Vino(String marca, double precio, String tipoVino, double gradoAlcohol) {
		super(marca,precio);
		this.tipoVino = tipoVino;
		this.gradoAlcohol = gradoAlcohol;
		this.volumen = 1.5;
		this.tipoEnvase = "";
		this.caducidad = LocalDate.MAX;
	}
	
	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}
	
	public LocalDate getCaducidad() {
		return caducidad;
	}
	
	public int getCalorias() {
		return (int) getGradoAlcohol() * 10;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String env) {
		this.tipoEnvase = env;
	}
	
	public void setVolumen(double v) {
		this.volumen = v;
	}
	
	public double getVolumen() {
		return this.volumen;
	}
	
	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public double getGradoAlcohol() {
		return gradoAlcohol;
	}

	public void setGradoAlcohol(double gradoAlcohol) {
		this.gradoAlcohol = gradoAlcohol;
	}

	public String toString() {
		return super.toString() + " - " + tipoVino + " - " + gradoAlcohol + " - " + caducidad + " - " + volumen + " - " + tipoEnvase + " - " + getCalorias();
	}
}
