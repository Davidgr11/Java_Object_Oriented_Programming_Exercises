import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class InfoVoluntario extends JPanel {
	private JTextField clave;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField ciudad;
	public JButton volver;
	private JButton buscar;

	/**
	 * Create the panel.
	 */
	public InfoVoluntario() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("Clave");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		clave = new JTextField();
		GridBagConstraints gbc_clave = new GridBagConstraints();
		gbc_clave.insets = new Insets(0, 0, 5, 5);
		gbc_clave.fill = GridBagConstraints.HORIZONTAL;
		gbc_clave.gridx = 2;
		gbc_clave.gridy = 1;
		add(clave, gbc_clave);
		clave.setColumns(10);

		GridBagConstraints gbc_buscar = new GridBagConstraints();
		gbc_buscar.insets = new Insets(0, 0, 5, 0);
		gbc_buscar.gridx = 3;
		gbc_buscar.gridy = 1;
		add(buscar, gbc_buscar);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		nombre = new JTextField();
		nombre.setEditable(false);
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.gridx = 2;
		gbc_nombre.gridy = 3;
		add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 5;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		apellido = new JTextField();
		apellido.setEditable(false);
		GridBagConstraints gbc_apellido = new GridBagConstraints();
		gbc_apellido.insets = new Insets(0, 0, 5, 5);
		gbc_apellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellido.gridx = 2;
		gbc_apellido.gridy = 5;
		add(apellido, gbc_apellido);
		apellido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ciudad");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 7;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		ciudad = new JTextField();
		ciudad.setEditable(false);
		GridBagConstraints gbc_ciudad = new GridBagConstraints();
		gbc_ciudad.insets = new Insets(0, 0, 5, 5);
		gbc_ciudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_ciudad.gridx = 2;
		gbc_ciudad.gridy = 7;
		add(ciudad, gbc_ciudad);
		ciudad.setColumns(10);
		
		volver = new JButton("Volver");
		GridBagConstraints gbc_volver = new GridBagConstraints();
		gbc_volver.fill = GridBagConstraints.HORIZONTAL;
		gbc_volver.gridx = 3;
		gbc_volver.gridy = 9;
		add(volver, gbc_volver);

	}

}
