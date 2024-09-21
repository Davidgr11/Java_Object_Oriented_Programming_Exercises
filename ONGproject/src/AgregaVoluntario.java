import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AgregaVoluntario extends JPanel {
	private JTextField nombre;
	private JTextField apellido;
	private JButton guardar;
	public JButton volver;
	private JLabel lblNewLabel_2;
	private JTextField clave;
	private JLabel lblNewLabel_3;
	public JComboBox ciudades;
	

	/**
	 * Create the panel.
	 */
	public AgregaVoluntario() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblNewLabel_2 = new JLabel("Clave");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		clave = new JTextField();
		GridBagConstraints gbc_clave = new GridBagConstraints();
		gbc_clave.gridwidth = 5;
		gbc_clave.insets = new Insets(0, 0, 5, 5);
		gbc_clave.fill = GridBagConstraints.HORIZONTAL;
		gbc_clave.gridx = 2;
		gbc_clave.gridy = 1;
		add(clave, gbc_clave);
		clave.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		nombre = new JTextField();
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.gridwidth = 5;
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.gridx = 2;
		gbc_nombre.gridy = 3;
		add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		apellido = new JTextField();
		GridBagConstraints gbc_apellido = new GridBagConstraints();
		gbc_apellido.gridwidth = 5;
		gbc_apellido.insets = new Insets(0, 0, 5, 5);
		gbc_apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellido.gridx = 2;
		gbc_apellido.gridy = 5;
		add(apellido, gbc_apellido);
		apellido.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Ciudad");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		ciudades = new JComboBox();
		GridBagConstraints gbc_ciudades = new GridBagConstraints();
		gbc_ciudades.gridwidth = 5;
		gbc_ciudades.insets = new Insets(0, 0, 5, 5);
		gbc_ciudades.fill = GridBagConstraints.HORIZONTAL;
		gbc_ciudades.gridx = 2;
		gbc_ciudades.gridy = 7;
		add(ciudades, gbc_ciudades);
		GridBagConstraints gbc_guardar = new GridBagConstraints();
		gbc_guardar.gridwidth = 2;
		gbc_guardar.insets = new Insets(0, 0, 0, 5);
		gbc_guardar.gridx = 2;
		gbc_guardar.gridy = 9;
		add(guardar, gbc_guardar);
		
		volver = new JButton("Volver");
		GridBagConstraints gbc_volver = new GridBagConstraints();
		gbc_volver.insets = new Insets(0, 0, 0, 5);
		gbc_volver.gridx = 10;
		gbc_volver.gridy = 9;
		add(volver, gbc_volver);
		

	}
}
