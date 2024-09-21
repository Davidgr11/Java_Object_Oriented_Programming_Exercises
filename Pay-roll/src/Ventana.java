import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField ap;
	private JTextField cl;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Clave");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Puesto");
		lblNewLabel_3.setBounds(10, 86, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nom = new JTextField();
		nom.setBounds(66, 8, 325, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		ap = new JTextField();
		ap.setBounds(66, 33, 325, 20);
		contentPane.add(ap);
		ap.setColumns(10);
		
		cl = new JTextField();
		cl.setBounds(66, 58, 325, 20);
		contentPane.add(cl);
		cl.setColumns(10);
		
		JRadioButton vendedor = new JRadioButton("Vendedor");
		buttonGroup.add(vendedor);
		vendedor.setBounds(62, 82, 85, 23);
		contentPane.add(vendedor);
		
		JRadioButton supervisor = new JRadioButton("Supervisor");
		buttonGroup.add(supervisor);
		supervisor.setBounds(149, 82, 99, 23);
		contentPane.add(supervisor);
		
		JRadioButton gerente = new JRadioButton("Gerente");
		buttonGroup.add(gerente);
		gerente.setBounds(250, 82, 85, 23);
		contentPane.add(gerente);
		
		JLabel lblNewLabel_4 = new JLabel("Faltas");
		lblNewLabel_4.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 30, 1));
		spinner.setBounds(66, 112, 64, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(302, 149, 89, 23);
		contentPane.add(btnNewButton);
	}
}
