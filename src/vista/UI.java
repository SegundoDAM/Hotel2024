package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.GestionRecepcion;
import modelo.data.Cliente;

public class UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDNI;
	private GestionRecepcion gestionRecepcion;
	

	/**
	 * Create the frame.
	 */
	public UI() {
		gestionRecepcion=new GestionRecepcion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion Clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(40, 10, 372, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(40, 75, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(98, 72, 96, 19);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("d.p.");
		lblNewLabel_2.setBounds(40, 143, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDatosPersonales = new JLabel("");
		lblDatosPersonales.setBounds(40, 170, 372, 13);
		contentPane.add(lblDatosPersonales);
		
		JLabel lblNewLabel_4 = new JLabel("habitual:");
		lblNewLabel_4.setBounds(40, 221, 64, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblHabitual = new JLabel("");
		lblHabitual.setBounds(138, 221, 45, 13);
		contentPane.add(lblHabitual);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(245, 71, 85, 21);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni = txtDNI.getText();
				Cliente cliente=gestionRecepcion.buscarClientePorDNI(dni);
				if(cliente!=null) {
					lblDatosPersonales.setText(cliente.getDatosPersonales());
					if(cliente.isHabitual()) {
						lblHabitual.setText("Si");
					}else {
						lblHabitual.setText("No");
					}
				}else {
					lblDatosPersonales.setText("Cliente no existe");
				}
			}
		});
	}

}
