import javax.swing.*;
import java.awt.Font;
import java.awt.Container;
import javax.swing.JFrame;

public class ClaseVista extends javax.swing.JFrame {

	JButton btnBuscar=null;
	JButton btnInformacion=null;
	JButton btnReservar=null;
	JButton btnCompañias=null;
	JLabel lblEligeUnoDe=null;


	public ClaseVista(){

		// Pide al usuario que escriba su nombre
		String nombre = JOptionPane.showInputDialog("¿Cual es su nombre?");

		// Crea el mensaje
		String mensaje = String.format( "Bienvenid@ %s, a nuesta agencia de viajes!", nombre );

		String mensaje1 = String.format( "Viajes Tonton!", nombre );

		String mensaje2 = String.format( "Hasta otra! "+nombre);


		// Muestra el mensaje para dar la bienvenida al usaurio por su nombre
		JOptionPane.showMessageDialog( null, mensaje, mensaje1, JOptionPane.INFORMATION_MESSAGE );

		int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres información sobre algun vuelo?", "Agencia De Viajes", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
		try{
			if (codigo==JOptionPane.YES_OPTION){

			}else if(codigo==JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog( null, mensaje2, mensaje1, JOptionPane.INFORMATION_MESSAGE );
				return;
			}
		}catch(Exception e){
			System.out.println("Se ha producido un error!");
		}
		Container contenedor = getContentPane();
		setTitle("Viajes Tonton");

		setSize(500,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contenedor.setLayout(null);

				btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 16));
		btnBuscar.setBounds(36, 129, 200, 41);
		contenedor.add(btnBuscar);

		btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Arial", Font.BOLD, 15));
		btnReservar.setBounds(290, 128, 181, 42);
		contenedor.add(btnReservar);
		//nuevo
		btnInformacion = new JButton("Informacion");
		btnInformacion.setFont(new Font("Arial", Font.BOLD, 15));
		btnInformacion.setBounds(290, 200, 181, 42);
		contenedor.add(btnInformacion);

		btnCompañias = new JButton("Compañias");
		btnCompañias.setFont(new Font("Arial", Font.BOLD, 15));
		btnCompañias.setBounds(36, 201, 200, 41);
		contenedor.add(btnCompañias);

		lblEligeUnoDe = new JLabel("<html>Viaja con la compania <strong>Viajes Tonton</strong><br/> y vive tu experiencia a tope</html>");
		lblEligeUnoDe.setFont(new Font("Arial", Font.ITALIC, 18));
		lblEligeUnoDe.setBounds(27, 11, 386, 75);
		contenedor.add(lblEligeUnoDe);
		setVisible(true);

		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Imagen");
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/letraT.jpeg")).getImage());
		((JPanel)getContentPane()).setOpaque(false); ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/prueba.jpeg")); JLabel fondo= new JLabel(); fondo.setIcon(uno); getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());

	}
}
