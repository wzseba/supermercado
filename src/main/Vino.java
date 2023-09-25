package main;

public class Vino extends Producto implements EsLiquido{

	private String tipoVino;
	private	double gradoAlcohol;
	private double volumen;
	private String tipoEnvase;
	
	public Vino(String marca, double precio, String tipoVino, double gradoAlcohol) {
		super(marca,precio);
		this.tipoVino = tipoVino;
		this.gradoAlcohol = gradoAlcohol;
		this.volumen = 1.5;
		this.tipoEnvase = "";
	}
	
	public double getCalorias() {
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
		return super.toString();
	}
}
