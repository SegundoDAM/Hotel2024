package vistamulticapa;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.GestionRecepcion;

public class UIMulticapa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GestionRecepcion gestionRecepcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIMulticapa frame = new UIMulticapa();
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
	public UIMulticapa() {
		gestionRecepcion=new GestionRecepcion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int puntoX = 100;
		int ancho = 717;
		int alto = 449;
		int puntoY=100;
		Point punto=new Point(puntoX, puntoY);
		Dimension dimension=new Dimension(ancho, alto);
		Rectangle area=new Rectangle(punto, dimension);
		setBounds(area);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cliente");
		menuBar.add(mnNewMenu);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		AgregarCliente agregarCliente = new AgregarCliente(area, gestionRecepcion);
		String agregadoCadena = "agregar";
		getContentPane().add(agregarCliente,agregadoCadena);
		String consultadoCadena = "consulta";
		getContentPane().add(new ConsultaClientes(area, gestionRecepcion),consultadoCadena);
		
		JMenuItem mntmNewMenuItem = new JMenuItem(agregadoCadena);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), agregadoCadena);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem(consultadoCadena);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout layout = (CardLayout) getContentPane().getLayout();
				layout.show(getContentPane(), consultadoCadena);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
