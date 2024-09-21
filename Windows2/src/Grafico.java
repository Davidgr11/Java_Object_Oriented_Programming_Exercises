import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Grafico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico window = new Grafico();
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
	public Grafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelIzq = new JPanel();
		frame.getContentPane().add(panelIzq, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("New label");
		panelIzq.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panelIzq.add(lblNewLabel_1);
		
		JPanel panelDer = new JPanel();
		frame.getContentPane().add(panelDer, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("New button");
		panelDer.add(btnNewButton);
	}

}
