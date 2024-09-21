//GONZALEZ ROBLES DAVID ALEJANDRO
//IMPORTS
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
import javax.swing.JTextPane;
import java.awt.Color;

//CLASE PRINCIPAL
public class ConversorUnidades extends JFrame implements ActionListener{
	//DECLARACIONES
	private JFrame frame;
	private JTextField texto;
	private JButton miboton2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	//MAIN
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//se invoca el evento
			public void run() {
				try {
					ConversorUnidades window = new ConversorUnidades();//s crea la ventana
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
	//CONSTRUCTOR
	public ConversorUnidades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//METODO
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("DAME UNA CANTIDAD EN PESOS MEXICANOS Y LA CONVERTIRE A DOLARES");
		panel.add(lblNewLabel);
		
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
		
		texto = new JTextField();
		texto.setText("Ingresa aqui:");
		texto.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(texto, BorderLayout.WEST);
		texto.setColumns(10);
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
