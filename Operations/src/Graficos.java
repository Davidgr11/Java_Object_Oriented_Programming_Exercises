
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Graficos extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField texto;
	private JButton miboton1;
	private JButton miboton2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficos window = new Graficos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Graficos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		texto = new JTextField();
		panel.add(texto);
		texto.setColumns(10);
		
		miboton1 = new JButton("Duplica");
		miboton1.addActionListener(this);
		/*miboton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Hiciste click");
				try{
					int valor=Integer.parseInt(texto.getText());
					valor=valor*2;
					texto.setText(String.valueOf(valor));
				}catch(NumberFormatException ex) {
					texto.setText("");
					JOptionPane.showMessageDialog(null, "Escribe un numero");
				}
			}
		});*/
		panel.add(miboton1);
		
		miboton2 = new JButton("Divide");
		miboton2.addActionListener(this);
		/*miboton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int valor=Integer.parseInt(texto.getText());
					valor=valor/2;
					texto.setText(String.valueOf(valor));
				}catch(NumberFormatException ex) {
					texto.setText("");
					JOptionPane.showMessageDialog(null, "Escribe un numero");
				}
			}
		});*/
		panel.add(miboton2);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Click"+((JButton)e.getSource()).getText());
		try {
			int valor=Integer.parseInt(texto.getText());
			if(e.getActionCommand().equals("Duplica")) {
				System.out.println("Duplica");
				valor*=2;
			}
			else {
				System.out.println("Divide");
				valor/=2;
			}
			texto.setText(String.valueOf(valor));
		}catch(NumberFormatException ex) {
			texto.setText("");
			JOptionPane.showMessageDialog(null, "Escribe un numero");
		}
		
	}

}
