package simulacion.yate;

public class Yate {
	
	private float velocidad; 
	private float consumoDeEnergiaSegunVelocidad; 
	
	public float calcularConsumoSegunVelocidad(float pVelocidad) { 
		this.consumoDeEnergiaSegunVelocidad= pVelocidad; // Se hace una relacion 1:1 ya que un yate por lo general va entre 0-8 nudos y gasta aprox. 8A por hora
		return consumoDeEnergiaSegunVelocidad; 
	}

	
	
	
	
	

}
