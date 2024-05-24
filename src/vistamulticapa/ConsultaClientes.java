package vistamulticapa;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JTextField;

import control.GestionRecepcion;

import javax.swing.JButton;

public class ConsultaClientes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 * @param area 
	 * @param gestionRecepcion 
	 */
	public ConsultaClientes(Rectangle area, GestionRecepcion gestionRecepcion) {
		setLayout(null);
		setBounds(area);
		JLabel lblNewLabel = new JLabel("Consulta Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(197, 33, 398, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DNI");
		lblNewLabel_1.setBounds(59, 125, 45, 13);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(139, 122, 232, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(448, 121, 85, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("datos personales");
		lblNewLabel_2.setBounds(59, 223, 100, 13);
		add(lblNewLabel_2);
		
		JLabel lblDatosPersonales = new JLabel("");
		lblDatosPersonales.setBounds(197, 223, 427, 13);
		add(lblDatosPersonales);

	}
}
