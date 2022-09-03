package simulacion.yate.controllers;

import simulacion.yate.gui.YateMainFrame; 
import simulacion.yate.Yate;

import java.util.Random;

import simulacion.yate.Bateria; 
import simulacion.yate.PanelSolar; 

public class YateMainFrameController extends Thread{
	
	private YateMainFrame controlledFrame; 
	private Yate yate; 
	private Bateria bateria; 
	private Bateria bateria2; 
	private PanelSolar panel; 
	private float capacidadB1; 
	private float capacidadB2; 
	private float consumoB1; 
	private float consumoB2; 
	
	public YateMainFrameController(Yate pYate) { 
		this.yate = pYate; 
	}
	
	public void setWindow(YateMainFrame pFrame) {
		controlledFrame = pFrame;
	}
	
	public int randomNivelDelSol() { 
		Random rand = new Random(); 
		int max = 10; 
		
		int nivelDeSol = rand.nextInt(max); 
		
		return nivelDeSol; 
		
	}
	
	
	public void pasarParametros(String ptxtCapacidadB1, String ptxtConsumoB1, String  ptxtCapacidadB2, String ptxtConsumoB2) { 
		this.capacidadB1 = Float.parseFloat(ptxtCapacidadB1); 
		this.capacidadB2 = Float.parseFloat(ptxtCapacidadB2); 
		this.consumoB1 = Float.parseFloat(ptxtConsumoB1); 
		this.consumoB2 = Float.parseFloat(ptxtConsumoB2); 
		
	}
	public void run () { 
		for (int i=0; i< 31; i++) { 
			
			try {  
				controlledFrame.setTimer(i);
				//controlledFrame.setBateria1(this.bateria.calcularConsumoBasico(capacidadB1, consumoB1, i)); 
				//controlledFrame.setBateria2(this.bateria2.calcularConsumoBasico(capacidadB2, consumoB2, i));
				int randNivel = randomNivelDelSol(); 
				controlledFrame.cargarBateria1(this.panel.cargarBateria(randNivel), randNivel);
				
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System .out.println("Se generó un error en el thread"); 
				e.printStackTrace();
			}
		}
	}

}
