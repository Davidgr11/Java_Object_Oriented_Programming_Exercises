import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton radioSi;
	private JRadioButton radioNo;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel labelCuantos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tienes hijos?");
		lblNewLabel.setBounds(27, 22, 87, 14);
		frame.getContentPane().add(lblNewLabel);
		
		radioSi = new JRadioButton("S\u00ED");
		radioSi.setSelected(true);
		radioSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelCuantos.setVisible(true);
				comboBox.setVisible(true);
			}
		});
		buttonGroup.add(radioSi);
		radioSi.setBounds(120, 18, 46, 23);
		frame.getContentPane().add(radioSi);
		
		radioNo = new JRadioButton("No");
		radioNo.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						labelCuantos.setVisible(false);
						comboBox.setVisible(false);
					}
				}
		);
		buttonGroup.add(radioNo);
		radioNo.setBounds(191, 18, 59, 23);
		frame.getContentPane().add(radioNo);
		
		labelCuantos = new JLabel("Cu\u00E1ntos hijos?");
		labelCuantos.setBounds(27, 65, 87, 14);
		frame.getContentPane().add(labelCuantos);
		/*
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
		modelo.addElement("1");
		*/
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4 o m\u00E1s"}));
		comboBox.setBounds(120, 61, 96, 22);
		frame.getContentPane().add(comboBox);
		
		btnNewButton = new JButton("Mandar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				if(radioSi.isSelected()) {
					mensaje = "Tienes hijos: ";
					int opc = comboBox.getSelectedIndex();
					mensaje += comboBox.getModel().getElementAt(opc);
					//mensaje += opc; 
					
				}else {
					mensaje = "No tienes hijos";
				}
				
				JOptionPane.showMessageDialog(null, mensaje);
			}
		});
		btnNewButton.setBounds(120, 107, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
