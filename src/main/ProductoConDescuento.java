package main;

public class ProductoConDescuento extends Producto implements ConDescuento{

	private double descuento;
	
	public ProductoConDescuento(String marca, double precio) {
		super(marca,precio);
		this.descuento = 0.0;
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
