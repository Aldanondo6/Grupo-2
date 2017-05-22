import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class claseControlador implements ActionListener { 

	claseModelo objModelo = null;
	claseVista objVista = null;

	public claseControlador(claseVista objVista, claseModelo objModelo) { // constructor

		this.objVista = objVista;
		this.objModelo = objModelo;

		actionListener(this); // escuchador para el boton
	}

	public void actionPerformed(ActionEvent e) { // actionPerformed(ActionEvent
		// e) metodo del
		// ActionListener

		Object fuente = e.getSource(); // Esta funcion devuelve el objeto que
		// genero un evento determinado. Por
		// ejemplo al hacer clic sobre
		// un boton el frame(o el que sea el listener de ese boton) recibira un
		// evento donde pasa un parametro con el nombre "e" gralmente
		// donde le pedis e.getSource() y te devuelve el boton que presionaron.

		if (fuente == objVista.btnBuscar) {
			objModelo.metodoBuscar();
		} else if (fuente == objVista.btnHoteles) {
			objModelo.metodoReservar();
		} else if (fuente == objVista.btnInformacion) {
			objModelo.metodoInformacion();
		} else if (fuente == objVista.btnCompa�ias) {
			objModelo.metodoCompa�ias();
		}
	}

	public void actionListener(ActionListener escuchador) {
			objVista.btnBuscar.addActionListener(escuchador);
			objVista.btnHoteles.addActionListener(escuchador);
			objVista.btnInformacion.addActionListener(escuchador);
			objVista.btnCompa�ias.addActionListener(escuchador);
		}
	}
