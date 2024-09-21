import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Pantalla extends JFrame{
	
	/**
	 * Crea una ventana sin nada
	 */
	public Pantalla() {
		this.setSize(500, 200);
		//this.setResizable(false);
		this.setTitle("Mi pantalla");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		//panel contenedor
		JPanel panelI = new JPanel();
		panelI.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel etiqueta1 = new JLabel();
		etiqueta1.setText("Mi etiqueta");
		panelI.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setText("Otra etiqueta");
		panelI.add(etiqueta2);
		
		this.add(panelI,BorderLayout.WEST);
		
		//Panel derecha con boton
		JPanel panelD = new JPanel();
		panelD.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton boton = new JButton("Un botón");
		panelD.add(boton);
		this.add(panelD, BorderLayout.EAST);
		
		this.setVisible(true);
	}

}
