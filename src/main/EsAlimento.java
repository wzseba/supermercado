package main;

import java.time.LocalDate;

public interface EsAlimento {
	/*Metodos abstract*/
	public abstract void setCaducidad(LocalDate fc);
	public LocalDate getCaducidad();
	public abstract int getCalorias();
}
