package main;

import java.util.ArrayList;
import java.util.List;

public class MainPruebas {

	public static void main(String[] args) {
		
		Cereal unCereal =  new Cereal("Luccheti", 200.0, TipoCereal.MAIZ);
		
		Detergente unDetergente =  new Detergente("Magistral", 300.0);
		unDetergente.setDescuento(10.0);
		
		Vino unVino = new Vino("Alma Mora", 1000.0, "Cabernet", 15.0);
		
		
		EsAlimento unAlimento = new Vino("Vino toro", 100.0, "Cabernet", 10.0);;
		
		List<EsAlimento> alimentos = new ArrayList<EsAlimento>();
		
		alimentos.add(unCereal);
		alimentos.add(unVino);
		alimentos.add(unAlimento);
		
		int caloriasSumadas = 0;
		for (EsAlimento esAlimento : alimentos) {
			caloriasSumadas += esAlimento.getCalorias();
			System.out.println(esAlimento.getCalorias());
		}
		
		System.out.println(caloriasSumadas);
		
        List<Producto> productos = new ArrayList<Producto>();
		
        productos.add(unCereal);
        productos.add(unVino);
        productos.add((Vino) unAlimento);
        productos.add(unCereal);
		
		int preciosSumados = 0;
		for (Producto producto : productos) {
			preciosSumados += producto.getPrecio();
			System.out.println(producto);
			
		}
		
		System.out.println(preciosSumados);
	}

}
