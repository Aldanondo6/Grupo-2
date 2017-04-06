import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClaseControlador implements ActionListener { //es una interfaz y por tal se debe de implementar todos los metodos que ella posee.

	ClaseModelo objModelo=null;
	ClaseVista objVista=null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo){ //constructor

		this.objVista=objVista;
		this.objModelo=objModelo;

		actionListener(this); //escuchador para el boton
	}

	public void actionPerformed (ActionEvent e){ //actionPerformed(ActionEvent e) metodo del ActionListener

		Object fuente = e.getSource(); //Esta funcion devuelve el objeto que genero un evento determinado. Por ejemplo al hacer clic sobre 
		//un boton el frame(o el que sea el listener de ese boton) recibira un evento donde pasa un parametro con el nombre "e" gralmente 
		//donde le pedis e.getSource() y te devuelve el boton que presionaron.

		if (fuente==objVista.btnBuscar) {
			objModelo.metodoBuscar();
		}
		else
			if (fuente==objVista.btnReservar) {
				objModelo.metodoReservar();
			}
			else
				if (fuente==objVista.btnInformacion) {
					objModelo.metodoInformacion();
				}
				else
					if (fuente==objVista.btnCompañias) {
						objModelo.metodoCompañias();
					}
	}

	public void actionListener(ActionListener escuchador) {

		objVista.btnBuscar.addActionListener(escuchador);
		objVista.btnReservar.addActionListener(escuchador);
		objVista.btnInformacion.addActionListener(escuchador);
		objVista.btnCompañias.addActionListener(escuchador);

	}
}
