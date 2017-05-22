import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.awt.Container;

public class claseVista extends javax.swing.JFrame {
	private static final long serialVersionUID = 7583742851780292406L;
	JButton btnBuscar = null;
	JButton btnInformacion = null;
	JButton btnHoteles = null;
	JButton btnCompañias = null;
	JLabel lblEligeUnoDe = null;

	public claseVista() {

		String nombre;
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 18)));
		nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre","Viajes TonTon", JOptionPane.QUESTION_MESSAGE).toUpperCase();
		String mensajeS = String.format("Saliendo del programa");
		String mensaje1S = String.format("Viajes TonTon");
		try{
			if(nombre==null){
				JOptionPane.showMessageDialog(null, mensajeS, mensaje1S, JOptionPane.INFORMATION_MESSAGE);
			}else {
				// Crea el mensaje
				String mensaje = String.format("Bienvenid@ %s, a nuesta agencia de viajes!", nombre);

				String mensaje1 = String.format("Viajes Tonton!", nombre);

				String mensaje2 = String.format("Hasta otra! " + nombre);


				int codigo = JOptionPane.showConfirmDialog(null, mensaje+" \n¿Quieres información sobre algun vuelo?", "Agencia De Viajes",
						JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

				if (codigo == JOptionPane.YES_OPTION) {


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

					btnHoteles = new JButton("Reservar");
					btnHoteles.setFont(new Font("Cambria", Font.BOLD, 15));
					btnHoteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/r.png")));
					btnHoteles.setBounds(290, 128, 181, 42);
					contenedor.add(btnHoteles);
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

					setIconImage(new ImageIcon(getClass().getResource("/Imagenes/letraT.png")).getImage());
					((JPanel) getContentPane()).setOpaque(false);

					ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/avionfondo.jpeg"));
					JLabel fondo = new JLabel();
					fondo.setIcon(uno);
					getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
					fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
				}
				else if (codigo == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, mensaje2, mensaje1, JFrame.EXIT_ON_CLOSE);
				}
			}
		}catch(NullPointerException e){
			System.out.println("");
		}

	}
}
