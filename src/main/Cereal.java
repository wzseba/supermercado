package main;

import java.time.LocalDate;

public class Cereal extends Producto implements EsAlimento {
	
	private TipoCereal cereal;
	private LocalDate caducidad;
	
	public Cereal(String marca, double precio, TipoCereal cereal) {
		super(marca,precio);
		this.cereal = cereal;
	}
	
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}
	
	public LocalDate getCaducidad() {
		return caducidad;
		
	}
	
	public int getCalorias() {
		return 0;
		
	}

	@Override
	public String toString() {
		return "Cereal [cereal=" + cereal + ", caducidad=" + caducidad + ", getCalorias()=" + getCalorias() + "]";
	}
	

}
