
import javax.swing.JOptionPane;

public class ClaseModelo{
	public static void metodoBuscar(){

		Object pregunta1 = JOptionPane.showInputDialog(null,"Selecciona el pais de salida",
				"preguntas", JOptionPane.PLAIN_MESSAGE, null,
			new Object[] { "España","Italia", "Noruega", "Francia", "Marruecos", "Egipto" },"España");

		Object pregunta2 = JOptionPane.showInputDialog(null,"Selecciona el pais de Destino",
				"preguntas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "España","Italia", "Noruega", "Francia", "Marruecos", "Egipto" },"España");

		if(pregunta1=="España" && pregunta2=="España"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a España: \n1) Origen-Destino: Bilbao - Madrid \n2) Origen-Destino:Barcelona - Madrid  \n3) Orgien-Destino: Sevilla - Pamplona \n4) Origen-Destino: Leon - Murcia \n5) Origen-Destino: Badajoz - Valencia");
		}
		if(pregunta1=="España" && pregunta2=="Noruega"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Noruega: \n1) Origen-Destino: Madirid - Noruega \n2) Origen-Destino: Madrid - Oslo\n3) Origen-Destino: Bilbao - Oslo\n4) Origen-Destino: Bilbao - Bergen ");
		}
		if(pregunta1=="España" && pregunta2=="Italia"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Italia: \n1)Origen-Destino: Pamplona - Roma \n2) Origen-Destino: Madrid - Venezia \n3) Origen-Destino: Vitoria - Pizza  ");
		}
		if(pregunta1=="España" && pregunta2=="Francia"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Francia");
		}
		if(pregunta1=="España" && pregunta2=="Marruecos"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Marruecos");
		}
		if(pregunta1=="España" && pregunta2=="Egipto"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Egipto");
		}

	}

	public static void metodoReservar(){
		JOptionPane.showMessageDialog(null,"A continuacion se mostraran algunas ofertas las cuales podras reservar: ");
	}

	public static void metodoInformacion(){
		String nl = System.getProperty("line.separator");
		Object msj = "Aplicacion que permite Buscar y Reservar vuelos.\nCopyRight 2017 || 'Grupo2'";
			     JOptionPane.showMessageDialog(null, msj, "Informacion",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void metodoCompañias(){
		
	}

}
