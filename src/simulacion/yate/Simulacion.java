package simulacion.yate;

import simulacion.yate.controllers.YateMainFrameController; 
import simulacion.yate.gui.YateMainFrame; 

public class Simulacion {

	public static void main(String[] args) {
		Yate yate = new Yate(); 
		
		YateMainFrameController controller = new YateMainFrameController(yate); 
		
		YateMainFrame myYateWindow = new YateMainFrame("Simulacion Yate", controller); 
		

	}

}
