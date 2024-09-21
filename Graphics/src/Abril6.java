import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class Abril6 {

	private JFrame frame;
	private final JRadioButton radioSi = new JRadioButton("Si");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Abril6 window = new Abril6();
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
	public Abril6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Tienes hijos?");
		panel.add(lblNewLabel);
		buttonGroup.add(radioSi);
		radioSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(radioSi);
		
		JRadioButton radioNo = new JRadioButton("No");
		radioNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(radioNo);
		panel.add(radioNo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("1");
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Cuantos hijos? ");
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("1\r\n2\r\n3\r\n4\r\n5");
		comboBox.setMaximumRowCount(4);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JDesktopPane desktopPane = new JDesktopPane();
		panel_1.add(desktopPane);
	}

}
