package challenge;

import java.util.Vector;

public class sistema {
	//defino 2 vector uno para guardar las tarjetas y otro para las marcas.
	private Vector <Tarjeta> tarjeta;
	private Vector <Marcas> marcas;
		
	public sistema() {
		tarjeta = new Vector <Tarjeta> ();
		marcas =new Vector <Marcas> ();
	}

	//busca si la tarjeta esta en el vector y la muestra.
	public  Tarjeta buscarTarjeta(String numeroTarjeta){
														//con el for recorro el vecto desde el inicio hasta el fin.
		for(int i=0;i<tarjeta.size();i++){ //el punto size marca el tamaño del vector tarjeta.
			Tarjeta t=tarjeta.elementAt(i); //elementAt recupera un elemento del indice i.
			if(t.sosTarjeta(numeroTarjeta))
				return t;
			}
			return null;
	}
	
	//verifica que el consumo sea menor a 1000 para ser una operacion valida.
	public boolean operacionValida (float consumo){
		if (consumo<1000){
			return true;
		}
	    return false;
	}


	
	/* para el tercer item solicitado, es una funcion boolean que compara la fechaVencimiento con la fecha actual.
	 * para traer la fecha actual se usa LocalDate. now()*/
	
	/*para el cuarto item utilizaria un operador logico != y a travez de un ciclo while  haria una comparacion */
	 
	 
	
}

