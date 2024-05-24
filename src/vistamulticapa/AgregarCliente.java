package vistamulticapa;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JTextField;

import control.GestionRecepcion;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtDNI;
	private JTextField txtDatosPersonales;

	/**
	 * Create the panel.
	 * @param area 
	 * @param gestionRecepcion 
	 */
	public AgregarCliente(Rectangle area, GestionRecepcion gestionRecepcion) {
		setLayout(null);
		setBounds(area);
		JLabel lblNewLabel = new JLabel("alta Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(188, 31, 350, 39);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("dni");
		lblNewLabel_1.setBounds(65, 119, 45, 13);
		add(lblNewLabel_1);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(144, 116, 96, 19);
		add(txtDNI);
		txtDNI.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("dp");
		lblNewLabel_2.setBounds(45, 187, 45, 13);
		add(lblNewLabel_2);
		
		txtDatosPersonales = new JTextField();
		txtDatosPersonales.setBounds(144, 184, 421, 19);
		add(txtDatosPersonales);
		txtDatosPersonales.setColumns(10);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionRecepcion.agregarCliente(txtDNI.getText(),
						txtDatosPersonales.getText());
			}
		});
		btnNewButton.setBounds(558, 333, 85, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Mensaje");
		lblNewLabel_3.setBounds(30, 385, 45, 13);
		add(lblNewLabel_3);
		
		JLabel lblMensaje = new JLabel(" ");
		lblMensaje.setBounds(119, 385, 446, 13);
		add(lblMensaje);

	}

}
