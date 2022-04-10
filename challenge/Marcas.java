package challenge;

public class Marcas {

	private String nombreMarca;
	private float tasa;

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public float getTasa() {
		return tasa;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}
	
	public Marcas(String nombreMarca, float tasa) {
		
		this.nombreMarca=nombreMarca;
		this.tasa=tasa;
		
	}
	
	
}
