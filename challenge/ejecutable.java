package challenge;


public class ejecutable {
	
	
	public static void main(String[] args) {
		
		Marcas marca1=new Marcas ("AMEX", 20);
		
		Tarjeta tarjeta1=new Tarjeta ("1111222233334444",marca1,"Gabriel",20,100);
		
		 System.out.println("informacion de la tarjeta  " + tarjeta1.getCardholder());
	}
		 
}
