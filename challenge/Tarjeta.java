package challenge;

//import java.util.Date;

public class Tarjeta {
	//atributos
	private String numeroTarjeta;
	private Marcas marca;
	private String cardholder;
	private int fechaVencimiento ; //intente poner fecha pero no supe pasarlo como parametro
	//private	Date FechaDeAlta = new Date(); aqui les dejo lo que quise poner en la clase como fecha 
	private float consumo;
	
	//estos metodos get y set los sugirio eclipse y busque para que funcionan.
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	} 
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public int getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(int fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Marcas getMarca() {
		return marca;
	}
	public void setMarca(Marcas marca) {
		this.marca = marca;
	}
	
	//constructor.
	public Tarjeta(String numeroTarjeta,Marcas marca,String cardholder,int fechaVencimiento, float consumo) {
		this.numeroTarjeta=numeroTarjeta;
		this.marca = marca;
		this.cardholder=cardholder;
		this.fechaVencimiento = fechaVencimiento;
		this.consumo=consumo;
	}
	
	//verifica que el numero de tarjeta que se pasa está.
	public boolean sosTarjeta(String numeroTarjeta){
		return(this.numeroTarjeta.equals(numeroTarjeta));
	}
	
}
