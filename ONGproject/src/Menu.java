import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JPanel {
	public JButton btn1;//creo que tienen que ser publicas por que cambian la ventana
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;

	/**
	 * Create the panel.
	 */
	public Menu() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 156, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btn1 = new JButton("Agregar Voluntario");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 5;
		gbc_btn1.gridy = 3;
		add(btn1, gbc_btn1);
		
		btn2 = new JButton("Info Voluntario");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 5;
		gbc_btn2.gridy = 4;
		add(btn2, gbc_btn2);
		
		btn3 = new JButton("Agregar Ciudad");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 5;
		gbc_btn3.gridy = 5;
		add(btn3, gbc_btn3);
		
		btn4 = new JButton("Info Ciudad");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 5;
		gbc_btn4.gridy = 6;
		add(btn4, gbc_btn4);

	}

}