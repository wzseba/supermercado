package main;

public class Producto {
	/*Atributos*/
	private String marca;
	private double precio;
	
	/*Constructor*/
	public Producto(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
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
	
	/*Sobreescritura toString*/
	public String toString() {
		return "Marca: " + marca + "Precio: " + precio;
	}
	
}
