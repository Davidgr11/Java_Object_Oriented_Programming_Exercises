import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AgregaCiudad extends JPanel {
	private JTextField nombre;
	public JButton volver;
	private JButton guardar;
	private JLabel lblNewLabel_1;
	private JComboBox actividades;

	/**
	 * Create the panel.
	 */
	public AgregaCiudad() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Nombre ciudad");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		nombre = new JTextField();
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.gridwidth = 8;
		gbc_nombre.insets = new Insets(0, 0, 5, 5);
		gbc_nombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_nombre.gridx = 2;
		gbc_nombre.gridy = 1;
		add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Actividad");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		actividades = new JComboBox();
		GridBagConstraints gbc_actividades = new GridBagConstraints();
		gbc_actividades.gridwidth = 8;
		gbc_actividades.insets = new Insets(0, 0, 5, 5);
		gbc_actividades.fill = GridBagConstraints.HORIZONTAL;
		gbc_actividades.gridx = 2;
		gbc_actividades.gridy = 3;
		add(actividades, gbc_actividades);
		guardar = new JButton("Guardar");
		GridBagConstraints gbc_guardar = new GridBagConstraints();
		gbc_guardar.insets = new Insets(0, 0, 5, 5);
		gbc_guardar.gridx = 8;
		gbc_guardar.gridy = 5;
		add(guardar, gbc_guardar);
		
		volver = new JButton("Volver");
		GridBagConstraints gbc_volver = new GridBagConstraints();
		gbc_volver.insets = new Insets(0, 0, 5, 5);
		gbc_volver.fill = GridBagConstraints.HORIZONTAL;
		gbc_volver.gridx = 9;
		gbc_volver.gridy = 5;
		add(volver, gbc_volver);
		
	}

}
