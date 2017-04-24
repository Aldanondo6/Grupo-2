import javax.swing.JOptionPane;

public class ClaseModelo{
	public static void metodoBuscar(){

		Object pregunta1 = JOptionPane.showInputDialog(null,"Selecciona el pais de salida",
				"preguntas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "España","Italia", "Noruega", "Francia", "Marruecos", "Egipto" },"España");

		Object pregunta2 = JOptionPane.showInputDialog(null,"Selecciona el pais de Destino",
				"preguntas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "España","Italia", "Noruega", "Francia", "Marruecos", "Egipto" },"España");

		if(pregunta1=="España" && pregunta2=="Noruega"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Noruega");
		}
		else if(pregunta1=="España" && pregunta2=="Italia"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Italia");
		}
		else if(pregunta1=="España" && pregunta2=="Francia"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Francia");
		}
		else if(pregunta1=="España" && pregunta2=="Marruecos"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Marruecos");
		}
		else if(pregunta1=="España" && pregunta2=="Egipto"){
			JOptionPane.showMessageDialog(null,"Estos son los viajes disponibles de España a Egipto");
		}

	}

	public static void metodoReservar(){
	}

	public static void metodoInformacion(){

		String nl = System.getProperty("line.separator");
		Object msj = "   ";

		JOptionPane.showMessageDialog(null, msj, //Mensaje 
				"Informacion", //Titulo
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void metodoCompanias(){

	}
}
