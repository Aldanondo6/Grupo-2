import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.awt.Container;

public class ClaseVista extends javax.swing.JFrame {
	private static final long serialVersionUID = 7583742851780292406L;
	JButton btnBuscar = null;
	JButton btnInformacion = null;
	JButton btnReservar = null;
	JButton btnCompañias = null;
	JLabel lblEligeUnoDe = null;

	public ClaseVista() {

		// Pide al usuario que escriba su nombre
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 18)));
		String nombre = JOptionPane.showInputDialog("¿Cual es su nombre?").toUpperCase();

		// Crea el mensaje
		String mensaje = String.format("Bienvenid@ %s, a nuesta agencia de viajes!", nombre);

		String mensaje1 = String.format("Viajes Tonton!", nombre);

		String mensaje2 = String.format("Hasta otra! " + nombre);

		// Muestra el mensaje para dar la bienvenida al usaurio por su nombre
		JOptionPane.showMessageDialog(null, mensaje, mensaje1, JOptionPane.INFORMATION_MESSAGE);

		int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres información sobre algun vuelo?", "Agencia De Viajes",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		try {
			if (codigo == JOptionPane.YES_OPTION) {
			} else if (codigo == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, mensaje2, mensaje1, JOptionPane.INFORMATION_MESSAGE);
				return;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Container contenedor = getContentPane();
		setTitle("Viajes Tonton");

		setSize(500, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contenedor.setLayout(null);

		btnBuscar = new JButton("Buscar ");
		btnBuscar.setFont(new Font("Cambria", Font.BOLD, 15));
		btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b.png")));
		btnBuscar.setBounds(36, 129, 200, 41);
		contenedor.add(btnBuscar);

		btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Cambria", Font.BOLD, 15));
		btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/r.png")));
		btnReservar.setBounds(290, 128, 181, 42);
		contenedor.add(btnReservar);
		// nuevo
		btnInformacion = new JButton("Informacion");
		btnInformacion.setFont(new Font("Cambria", Font.BOLD, 15));
		btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i.png")));
		btnInformacion.setBounds(290, 200, 181, 42);
		contenedor.add(btnInformacion);

		btnCompañias = new JButton("Compañias");
		btnCompañias.setFont(new Font("Cambria", Font.BOLD, 15));
		btnCompañias.setBounds(36, 201, 200, 41);
		contenedor.add(btnCompañias);

		lblEligeUnoDe = new JLabel(
				"<html>Viaja con la compania <strong>Viajes Tonton</strong><br/> y vive tu experiencia a tope</html>");
		lblEligeUnoDe.setFont(new Font("Arial", Font.ITALIC, 18));
		lblEligeUnoDe.setBounds(27, 11, 386, 75);
		contenedor.add(lblEligeUnoDe);
		setVisible(true);

		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Viajes Tonton");

		setIconImage(new ImageIcon(getClass().getResource("/Imagenes/letraT.jpeg")).getImage());
		((JPanel) getContentPane()).setOpaque(false);

		ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/avionfondo.jpeg"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

	}
}
