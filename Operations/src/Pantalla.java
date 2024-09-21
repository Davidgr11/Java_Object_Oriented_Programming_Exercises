import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pantalla extends JFrame{
	public Pantalla() {
		/**
		 * Crea una ventana sin nada
		 */
		this.setSize(300,300);
		this.setResizable(false);
		this.setTitle("Mi pantalla");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		JPanel panelI=new JPanel();
		panelI.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel etiqueta1=new JLabel();
		etiqueta1.setText("Mi etiqueta");
		panelI.add(etiqueta1);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Mi etiqueta");
		panelI.add(etiqueta2);
		
		this.add(panelI, BorderLayout.WEST);
		//panel derecha		
		JPanel panelD=new JPanel();
		panelD.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton boton=new JButton("Un boton");
		panelD.add(boton);
		this.add(panelD, BorderLayout.EAST);
		
		this.setVisible(true);
	}
}
