package main;

public class Detergente extends Producto implements ConDescuento{
	
	private String marca;
	private double precio;
	private double descuento;

	public Detergente(String marca, double precio, double descuento) {
		super(marca,precio);
		this.descuento = 0;
	}
	
	/*Metodos*/
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/*sobreescritura de metodos interface*/
	public void setDescuento(double des) {
		this.descuento = des;
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	public double getPrecioDescuento() {
		return this.getPrecio() - this.getPrecio() * this.getDescuento() / 100;
	}
	
	public String toString() {
		return super.toString() + " - " + this.getDescuento();
	}
}
