import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame /*implements ActionListener*/{

	private JPanel contentPane;
	private JTextField texto;
	private JButton miBoton;
	private JButton miBoton2;


	/**
	 * Create the frame.
	 */
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		texto = new JTextField();
		panel.add(texto);
		texto.setColumns(10);
		
		miBoton = new JButton("Duplica");
		/*
		miBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int valor = Integer.parseInt(texto.getText());
					valor*=2;
					texto.setText(String.valueOf(valor));
				}catch(NumberFormatException ex) {
					texto.setText("");
					JOptionPane.showMessageDialog(null, "Escribe un numero");
				}
				//texto.setText(valor+"");
				
			}
		});*/
		//miBoton.addActionListener(this);
		miBoton.addActionListener(new ClickBoton());
		panel.add(miBoton);
		
		miBoton2 = new JButton("Divide");
		/*miBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int valor = Integer.parseInt(texto.getText());
					valor/=2;
					texto.setText(String.valueOf(valor));
				}catch(NumberFormatException ex) {
					texto.setText("");
					JOptionPane.showMessageDialog(null, "Escribe un numero");
				}
			}
		});*/
		//miBoton2.addActionListener(this);
		miBoton2.addActionListener(new ClickBoton());
		panel.add(miBoton2);
		setVisible(true);//faltó
	}


	/*@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int valor = Integer.parseInt(texto.getText());
			if(e.getActionCommand().equals("Duplica")) {
				valor*=2;
			}else {
				valor/=2;
			}
			texto.setText(String.valueOf(valor));
		}catch(NumberFormatException ex) {
			texto.setText("");
			JOptionPane.showMessageDialog(null, "Escribe un numero");
		}
		
	}*/
	
	private class ClickBoton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int valor = Integer.parseInt(texto.getText());
				if(e.getActionCommand().equals("Duplica")) {
					valor*=2;
				}else {
					valor/=2;
				}
				texto.setText(String.valueOf(valor));
				JOptionPane.showMessageDialog(null, "Cambiado");
			}catch(NumberFormatException ex) {
				texto.setText("");
				JOptionPane.showMessageDialog(null, "Escribe un numero");
			}
			
		}
		
	}
}
