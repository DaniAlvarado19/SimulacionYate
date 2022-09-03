package simulacion.yate;

public class Bateria {
	
	float velocidadDeCarga; 
	float capacidadDeCarga; // Capacidad de carga (mAh)/ Consumo (mA)= Hour of expected runtime
	float consumoDeEnergia; 
	float consumoDeEnergiaVelocidad; 
	
	public float calcularConsumoBasico(float pCapacidad, float pConsumo, int hora) { 
		
		return pCapacidad - (pConsumo*hora); 
		
	}

}
