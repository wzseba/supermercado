package main;

import java.time.LocalDate;

public class Cereal extends Producto implements EsAlimento {
	
	private TipoCereal tipoCereal;
	private LocalDate caducidad;
	
	public Cereal(String marca, double precio, TipoCereal tipoCereal) {
		super(marca,precio);
		this.tipoCereal = tipoCereal;
	}
	
	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}
	@Override
	public LocalDate getCaducidad() {
		return caducidad;
		
	}
	@Override
	public int getCalorias() {
		return this.tipoCereal.getCalorias();
		
	}
	
	/*get and set de atributos de la clase*/
	public void setTipoCereal(TipoCereal tipoCereal) {
		this.tipoCereal = tipoCereal;
	}
	
	public TipoCereal getTipoCereal() {
		return tipoCereal;
	}

	@Override
	public String toString() {
		return "Cereal [cereal=" + tipoCereal + ", caducidad=" + caducidad + ", getCalorias()=" + getCalorias() + "]";
	}
	

}
