
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
		
		int opcion;
		
		do{
			opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
						"	ELIJA EL PROGRAMA QUE DESEE UTILIZAR \n"+
			"1.- OPCION UNO\n"+
			"2.- OPCION DOS\n"+
			"3.- OPCION TRES\n"+
			"4.- OPCION SALIR\n"+
			"INGRESE UNA OPCION [1-4]", "MENU", JOptionPane.QUESTION_MESSAGE));

			switch(opcion){
			case 1: System.out.println("f"); //opcion1(); break;
			case 2: System.out.println("a");//opcion2(); break;
			case 3: System.out.println("s");//opcion3(); break;
			case 4: JOptionPane.showMessageDialog(null, "QUE TENGA UN BUEN DÍA. "); break;
			default: JOptionPane.showMessageDialog(null, "ELIJA UNA OPCION VALIDA\n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
			} }while(opcion!=4);

	
	}

	public static void metodoInformacion(){
		String nl = System.getProperty("line.separator");
		Object msj = "Aplicacion que permite Buscar y Reservar vuelos.\nCopyRight 2017 || 'Grupo2'";
			     JOptionPane.showMessageDialog(null, msj, "Informacion",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void metodoCompañias(){
	public static void metodoCompañias(){
		boolean verfal;
		String elegir = null;
		Desktop enlace = null;

		do{
			verfal=false;
			try{
				elegir=JOptionPane.showInputDialog(null,"<html><strong>Páginas Oficiales Aerolineas:</strong></html>\n"
						+"1._ Iberia\n"
						+"2._ KLM\n", null, JOptionPane.DEFAULT_OPTION);
				Integer.parseInt(elegir);
				if(Integer.parseInt(elegir) == 0){
					JOptionPane.showMessageDialog(null, "El numero no existe en la lista!", null, JOptionPane.INFORMATION_MESSAGE );
					verfal=true;
				}
			}
			catch(Exception e){
				System.out.println("No puedes escribir letras!");
			}
		}while(verfal);

		switch(Integer.parseInt(elegir)){
		case 1:
			enlace=Desktop.getDesktop();
			try {
				enlace.browse(new URI("https://www.iberia.com/"));
			} catch (IOException | URISyntaxException e) {
				e.getMessage();
			}
			break;
		case 2:
			enlace=Desktop.getDesktop();
			try {
				enlace.browse(new URI("https://www.klm.com/home/es/es"));
			} catch (IOException | URISyntaxException e) {
				e.getMessage();
			}
			break;
		}

	}

}
