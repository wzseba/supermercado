package main;

import java.time.LocalDate;

public interface EsAlimento {
	/*Metodos abstract en una interface siempre son abstract*/
	public abstract void setCaducidad(LocalDate fc);
	public LocalDate getCaducidad();
	public abstract int getCalorias();
}
