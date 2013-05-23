package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buscador extends JFrame {
	
	public static void main(String[] args){
		Buscador frame = new Buscador();
		frame.setTitle("Million Songs - Metadata Search Engine"); 
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setContentPane(crearPanel());
	}
	
	public static JPanel crearPanel(){
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setOpaque(true);
		JLabel titulo = new JLabel("Bucador de metadatos");
		JButton boton = new JButton("Buscar");
		panel.add(titulo);
		panel.add(boton);
		return panel;
	} 
	
}
