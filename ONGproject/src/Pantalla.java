import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Pantalla extends JFrame {
	Menu menu=new Menu();
	AgregaVoluntario addVol=new AgregaVoluntario();
	private JPanel contentPane;
	final static String VENTANA1="Ventana agrega voluntario";
	final static String VENTANA2="Ventana agrega voluntario";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
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
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		//añadimos las ventanas al contenedor
		contentPane.add(menu, VENTANA1);
		contentPane.add(addVol, VENTANA2);
		
		//accedemos a los botones del menu
		menu.btn1.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl=(CardLayout)(contentPane.getLayout());
				cl.show(contentPane, VENTANA2);
			}
		});
	}

}
