package simulacion.yate.gui;

import simulacion.yate.Constantes; 

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import simulacion.yate.controllers.YateMainFrameController;

public class YateMainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private YateMainFrameController controller;
	
	private JTextField txtCapacidadB1; 
	private JTextField txtCapacidadB2; 
	private JTextField txtConsumoB1; 
	private JTextField txtConsumoB2; 
	private JLabel lblTimer;
	private JLabel lblVelocidad;
	private JLabel lblSol; 
	private JLabel lblNivelB1;
	private JLabel lblNivelB2;

	public YateMainFrame(String pTitle, YateMainFrameController pController) {
		super(pTitle);
		controller = pController; 
		controller.setWindow(this); 
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(0, 0, 1080, 780);
		this.setLocationRelativeTo(null);
		this.setLayout(null); 
		this.setBackground(Color.white);
		this.initComponents();
		
		this.setVisible(true);		
	}
	
	public void setTimer(int pNumero) {
		lblTimer.setText(pNumero + ""); 
		
	} 
	
	public void setBateria1(float nivel) { 
		String nivelB1 = Float.toString(nivel); 
		
		lblNivelB1.setText(nivelB1 + "");
		
	}
	
	public void setBateria2(float nivel) { 
		String nivelB2 = Float.toString(nivel); 
		
		lblNivelB2.setText(nivelB2 + "");
	}
	
	public void cargarBateria1(double carga, int nivelSol) { 
		String cargaB1 = Double.toString(carga); 
		lblNivelB1.setText(cargaB1);
		String sol = String.valueOf(nivelSol); 
		lblSol.setText(sol);
	}
	
	
	
	
	private void initComponents() { 
		JLabel tituloLbl = new JLabel("Parámetros configurables: ");
    	tituloLbl.setBounds(0, 0, 160, 20);
    	this.add(tituloLbl);
    	
    	JLabel lblCapacidadB1 = new JLabel("Capacidad Batería 1 (Ah):  ");
    	lblCapacidadB1.setBounds(0, 30, 160, 20);
    	this.add(lblCapacidadB1);
    	
    	txtCapacidadB1 = new JTextField();
    	txtCapacidadB1.setBounds(150, 30, 100, 20);
    	this.add(txtCapacidadB1);
    	
    	JLabel lblCapacidadB2 = new JLabel("Capacidad Batería 2 (Ah):  ");
    	lblCapacidadB2.setBounds(0, 60, 160, 20);
    	this.add(lblCapacidadB2);
    	
    	txtCapacidadB2 = new JTextField();
    	txtCapacidadB2.setBounds(150, 60, 100, 20);
    	this.add(txtCapacidadB2); 
    	
    	JLabel lblConsumoB1 = new JLabel("Consumo de energía Batería 1 (Ah):  ");
    	lblConsumoB1.setBounds(300, 30, 240, 20);
    	this.add(lblConsumoB1);
    	
    	txtConsumoB1 = new JTextField();
    	txtConsumoB1.setBounds(510, 30, 100, 20);
    	this.add(txtConsumoB1); 
    	
    	JLabel lblConsumoB2 = new JLabel("Consumo de energía Batería 2 (Ah):  ");
    	lblConsumoB2.setBounds(300, 60, 240, 20);
    	this.add(lblConsumoB2);
    	
    	txtConsumoB2 = new JTextField();
    	txtConsumoB2.setBounds(510, 60, 100, 20);
    	this.add(txtConsumoB2); 
    	
    	JLabel lblTitulo2 = new JLabel("Simulación: ");
    	lblTitulo2.setBounds(0, 90, 160, 20);
    	this.add(lblTitulo2);
  
    	JButton btnSimulacion = new JButton("Empezar simulación");  
    	btnSimulacion.setBounds(280, 95, 100,20);
    	  
    	btnSimulacion.addActionListener(new ActionListener(){  
    		public void actionPerformed(ActionEvent e){
    			controller.pasarParametros(txtCapacidadB1.getText(), txtConsumoB1.getText(), txtCapacidadB2.getText(), txtConsumoB2.getText());
    			controller.start(); 
    		}  
    	});
    	this.add(btnSimulacion);
    	
    	JLabel captionTimer = new JLabel("Horas:  ");
    	captionTimer.setBounds(0, 120, 160, 20);
    	this.add(captionTimer);
    	
    	lblTimer = new JLabel("0"); 
    	lblTimer.setBounds(50, 120, 160, 20);
    	this.add(lblTimer);
    	
    	JLabel captionVelocidad = new JLabel("Velocidad(nudos):  ");
    	captionVelocidad.setBounds(0, 150, 160, 20);
    	this.add(captionVelocidad);
    	
    	lblVelocidad = new JLabel("0"); 
    	lblVelocidad.setBounds(110, 150, 160, 20);
    	this.add(lblVelocidad);
    	
    	JLabel captionSol = new JLabel("Nivel de sol (1-10):  ");
    	captionSol.setBounds(0, 180, 200, 20);
    	this.add(captionSol);
    	
    	lblSol = new JLabel("0"); 
    	lblSol.setBounds(180, 180, 200, 20);
    	this.add(lblSol);
    	
    	JLabel captionB1 = new JLabel("Nivel de energía batería 1(%):  ");
    	captionB1.setBounds(0, 210, 200, 20);
    	this.add(captionB1);
    	
    	lblNivelB1 = new JLabel("0"); 
    	lblNivelB1.setBounds(180, 210, 200, 20);
    	this.add(lblNivelB1);
    	
    	JLabel captionB2 = new JLabel("Nivel de energía batería 2 (%):  ");
    	captionB2.setBounds(0, 240, 200, 20);
    	this.add(captionB2);
    	
    	lblNivelB2 = new JLabel("0"); 
    	lblNivelB2.setBounds(180, 240, 200, 20);
    	this.add(lblNivelB2);
    	
    	
 
	}
	
	



}
		
