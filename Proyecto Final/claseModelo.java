import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.plaf.*;
import java.util.*;

public class claseModelo {
	public static void metodoBuscar() {
		Object pregunta1 = JOptionPane.showInputDialog(null, "Selecciona el pais de salida", "preguntas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "España", "Italia", "Noruega", "Francia", "Marruecos", "Egipto" }, "España");

		Object pregunta2 = JOptionPane.showInputDialog(null, "Selecciona el pais de Destino", "preguntas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "España", "Italia", "Noruega", "Francia", "Marruecos", "Egipto" }, "España");

		// ESPAÑA
		if (pregunta1 == "España" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a España: \n1) Origen-Destino: Bilbao - Madrid \n2) Origen-Destino:Barcelona - Madrid  \n3) Orgien-Destino: Sevilla - Pamplona \n4) Origen-Destino: Leon - Murcia \n5) Origen-Destino: Badajoz - Valencia");
		} else if (pregunta1 == "España" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a Noruega: \n1) Origen-Destino: Madirid - Noruega \n2) Origen-Destino: Madrid - Oslo\n3) Origen-Destino: Bilbao - Oslo\n4) Origen-Destino: Bilbao - Bergen ");
		} else if (pregunta1 == "España" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a Italia: \n1) Origen-Destino: Pamplona - Roma \n2) Origen-Destino: Madrid - Venezia \n3) Origen-Destino: Vitoria - Pizza  ");
		} else if (pregunta1 == "España" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a Francia: \n1) Origen-Destino: Pamplona - Paris \n2) Origen-Destino: Vitoria - Le Bourget \n3) Origen-Destino: Bilbao - Tillé \n4) Origen-Destino: Barcelona - Paris  ");
		} else if (pregunta1 == "España" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a Marruecos: \n1) Origen-Destino: Barcelona - Marrakech-Menara \n2) Origen-Destino: Madrid - Angads \n3) Origen-Destino: Sevilla - Rabat-Salé \n4) Origen-Destino: Bilbao - Cherif Al Idrissi ");
		} else if (pregunta1 == "España" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de España a Egipto: \n1) Origen-Destino: Barcelona - Luxor \n2) Origen-Destino: Madrid - El Cairo \n3) Origen-Destino: Sevilla - Marsa Alam ");
		}
		// NORUEGA
		else if (pregunta1 == "Noruega" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a España: \n1) Origen-Destino: Noruega - Madrid \n2) Origen-Destino: Oslo - Madrid  \n3) Orgien-Destino: Oslo - Pamplona \n4) Origen-Destino: Bergen - Murcia ");
		} else if (pregunta1 == "Noruega" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a Noruega: \n1) Origen-Destino: Bergen - Oslo \n2) Origen-Destino: Noruega - Oslo\n3) Origen-Destino: Oslo - Bergen\n4) Origen-Destino: Estavanger - Bergen ");
		} else if (pregunta1 == "Noruega" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a Italia: \n1) Origen-Destino: Estavanger - Roma \n2) Origen-Destino: Oslo - Venezia \n3) Origen-Destino: Bergen - Pizza  ");
		} else if (pregunta1 == "Noruega" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a Francia: \n1) Origen-Destino: Bergen - Paris \n2) Origen-Destino: Oslo - Le Bourget \n3) Origen-Destino: Noruega - Tillé \n4) Origen-Destino: Estavanger - Paris  ");
		} else if (pregunta1 == "Noruega" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a Marruecos: \n1) Origen-Destino: Bergen - Marrakech-Menara \n2) Origen-Destino: Oslo - Angads \n3) Origen-Destino: Estavanger - Rabat-Salé \n4) Origen-Destino: Oslo - Cherif Al Idrissi ");
		} else if (pregunta1 == "Noruega" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Noruega a Egipto: \n1) Origen-Destino: Oslo - Luxor \n2) Origen-Destino: Bergen - El Cairo \n3) Origen-Destino: Estavanger - Marsa Alam ");
		}
		// ITALIA
		else if (pregunta1 == "Italia" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a España: \n1) Origen-Destino: Roma - Madrid \n2) Origen-Destino: Pisa - Madrid  \n3) Orgien-Destino: Venecia - Pamplona \n4) Origen-Destino: Roma - Murcia \n5) Origen-Destino: Milan - Valencia");
		} else if (pregunta1 == "Italia" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a Noruega: \n1) Origen-Destino: Milan - Noruega \n2) Origen-Destino: Roma - Oslo\n3) Origen-Destino: Pisa - Oslo\n4) Origen-Destino: Florencia - Bergen ");
		} else if (pregunta1 == "Italia" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a Italia: \n1) Origen-Destino: Milan - Roma \n2) Origen-Destino: Florencia - Venezia \n3) Origen-Destino: Roma - Pisa  ");
		} else if (pregunta1 == "Italia" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a Francia: \n1) Origen-Destino: Roma - Paris \n2) Origen-Destino: Florencia - Le Bourget \n3) Origen-Destino: Pisa - Tillé \n4) Origen-Destino: Venecia - Paris  ");
		} else if (pregunta1 == "Italia" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a Marruecos: \n1) Origen-Destino: Venecia - Marrakech-Menara \n2)Origen-Destino: Florencia - Angads \n3) Origen-Destino: Roma - Rabat-Salé \n4) Origen-Destino: Venecia - Cherif Al Idrissi ");
		} else if (pregunta1 == "Italia" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Italia a Egipto: \n1) Origen-Destino: Venecia - Luxor \n2) Origen-Destino: Roma - El Cairo \n3) Origen-Destino: Florencia - Marsa Alam ");
		}
		// FRANCIA
		else if (pregunta1 == "Francia" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a España: \n1) Origen-Destino: Paris - Madrid \n2) Origen-Destino: Le Bourget - Madrid  \n3) Orgien-Destino: Tillé - Pamplona \n4) Origen-Destino: Leon - Murcia \n5) Origen-Destino: Paris - Valencia");
		} else if (pregunta1 == "Francia" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a Noruega: \n1) Origen-Destino: Paris - Noruega \n2) Origen-Destino: Le Bour get- Oslo \n3) Origen-Destino: Tillé - Oslo\n4) Origen-Destino: Paris - Bergen ");
		} else if (pregunta1 == "Francia" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a Italia: \n1) Origen-Destino: Paris - Roma \n2) Origen-Destino: Le Bourget - Venezia \n3) Origen-Destino: Tillé - Pizza  ");
		} else if (pregunta1 == "Francia" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a Francia: \n1) Origen-Destino: Paris - Paris \n2) Origen-Destino: Paris - Le Bourget \n3) Origen-Destino: Tillé - Paris \n4) Origen-Destino: Tillé - Paris  ");
		} else if (pregunta1 == "Francia" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a Marruecos: \n1)Origen-Destino: Paris - Marrakech-Menara \n2) Origen-Destino: Le Bourget - Angads \n3) Origen-Destino: Tillé - Rabat-Salé \n4) Origen-Destino: Paris - Cherif Al Idrissi ");
		} else if (pregunta1 == "Francia" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Francia a Egipto: \n1)Origen-Destino: Paris - Luxor \n2) Origen-Destino: Le Bourget - El Cairo \n3) Origen-Destino: Tillé - Marsa Alam ");
		}
		// MARRUECOS
		else if (pregunta1 == "Marruecos" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a España: \n1) Origen-Destino: Marrakech-Menara - Madrid \n2) Origen-Destino: Angads - Madrid  \n3) Orgien-Destino: Rabat-Salé - Pamplona \n4) Origen-Destino: Leon - Murcia \n5) Origen-Destino: Cherif Al Idrissi - Valencia");
		} else if (pregunta1 == "Marruecos" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a Noruega: \n1) Origen-Destino: Marrakech-Menara - Noruega \n2) Origen-Destino: Angads - Oslo\n3) Origen-Destino: Rabat-Salé - Oslo\n4) Origen-Destino: Cherif Al Idrissi - Bergen ");
		} else if (pregunta1 == "Marruecos" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a Italia: \n1) Origen-Destino: Marrakech-Menara - Roma \n2) Origen-Destino: Angads - Venezia \n3) Origen-Destino: Rabat-Salé - Pizza  ");
		} else if (pregunta1 == "Marruecos" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a Francia: \n1) Origen-Destino: Marrakech-Menara - Paris \n2) Origen-Destino: Angads - Le Bourget \n3) Origen-Destino: Rabat-Salé - Tillé \n4) Origen-Destino: Cherif Al Idrissi - Paris  ");
		} else if (pregunta1 == "Marruecos" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a Marruecos: \n1) Origen-Destino: Marrakech-Menara - Marrakech-Menara \n2) Origen-Destino: Angads - Angads \n3) Origen-Destino: Rabat-Salé - Rabat-Salé \n4) Origen-Destino: Cherif Al Idrissi - Cherif Al Idrissi ");
		} else if (pregunta1 == "Marruecos" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Marruecos a Egipto: \n1)Origen-Destino: Marrakech-Menara - Luxor \n2) Origen-Destino: Angads - El Cairo \n3) Origen-Destino: Rabat-Salé - Marsa Alam ");
		}
		// EGIPTO
		else if (pregunta1 == "Egipto" && pregunta2 == "España") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a España: \n1) Origen-Destino: Luxor - Madrid \n2) Origen-Destino: El Cairo - Madrid  \n3) Orgien-Destino: Sevilla - Pamplona \n4) Origen-Destino: Leon - Murcia \n5) Origen-Destino: Badajoz - Valencia");
		} else if (pregunta1 == "Egipto" && pregunta2 == "Noruega") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a Noruega: \n1) Origen-Destino: Luxor - Noruega \n2) Origen-Destino: El Cairo - Oslo\n3) Origen-Destino: Marsa Alam - Oslo\n4) Origen-Destino: Marsa Alam - Bergen ");
		} else if (pregunta1 == "Egipto" && pregunta2 == "Italia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a Italia: \n1) Origen-Destino: Luxor - Roma \n2) Origen-Destino: El Cairo - Venezia \n3) Origen-Destino: Marsa Alam - Pizza  ");
		} else if (pregunta1 == "Egipto" && pregunta2 == "Francia") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a Francia: \n1) Origen-Destino: Luxor - Paris \n2) Origen-Destino: El Cairo - Le Bourget \n3) Origen-Destino: Marsa Alam - Tillé \n4) Origen-Destino: Marsa Alam - Paris  ");
		} else if (pregunta1 == "Egipto" && pregunta2 == "Marruecos") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a Marruecos: \n1) Origen-Destino: Luxor - Marrakech-Menara \n2) Origen-Destino: El Cairo - Angads \n3) Origen-Destino: Marsa Alam - Rabat-Salé \n4) Origen-Destino: Marsa Alam - Cherif Al Idrissi ");
		} else if (pregunta1 == "Egipto" && pregunta2 == "Egipto") {
			JOptionPane.showMessageDialog(null,
					"Estos son los viajes disponibles de Egipto a Egipto: \n1) Origen-Destino: Angads - El Cairo \n2) Origen-Destino: Luxor - El Cairo \n3) Origen-Destino: Marsa Alam - Marsa Alam ");
		}

	}

	static void metodoReservar() {
		boolean verfal;
		String elegir = null;
		String elegir2 = null;
		String texto = "<html><strong>Hoteles listados de los diferentes países</strong></html>\n" + "1._ España\n"
				+ "2._ Noruega\n" + "3._ Italia\n" + "4._ Francia\n" + "5._ Marruecos\n" + "6._ Egipto\n";
		Desktop enlace = null;

		do {
			verfal = false;
			try {
				UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
				elegir = JOptionPane.showInputDialog(null, texto, "Reservar", JOptionPane.INFORMATION_MESSAGE);
				if (Integer.parseInt(elegir) <= 0 || Integer.parseInt(elegir) > 6 || elegir.equals(null)) {
					JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
							"Error!", JOptionPane.ERROR_MESSAGE);
					verfal = true;
				}
				switch (Integer.parseInt(elegir)) {
				case 1:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane.showInputDialog(null, "1._ Only YOU Boutique Hotel Madrid\n"
							+ "2._ Alma Pamplona Muga de Belosol\n" + "3._ Meliá Sancti Petri\n", "España",
							JOptionPane.DEFAULT_OPTION);
					Integer.parseInt(elegir2);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else if (Integer.parseInt(elegir2) == 1) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g187514-d4719800-Reviews-Only_YOU_Boutique_Hotel_Madrid-Madrid.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					} else if (Integer.parseInt(elegir2) == 2) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g187520-d1822279-Reviews-Alma_Pamplona_Muga_de_Beloso-Pamplona_Navarra.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					} else if (Integer.parseInt(elegir2) == 3) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g658916-d231576-Reviews-Melia_Sancti_Petri-Novo_Sancti_Petri_Chiclana_de_la_Frontera_Costa_de_la_Luz_Andalucia.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					}
					break;
				case 2:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane
							.showInputDialog(null,
									"1._ Thon Hotel Opera\n" + "2._ Hotel Continental Oslo\n"
											+ "3._ Radisson Blu Royal Hotel, Bergen\n",
									"Noruega", JOptionPane.DEFAULT_OPTION);
					Integer.parseInt(elegir2);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else if (Integer.parseInt(elegir2) == 1) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g187514-d4719800-Reviews-Only_YOU_Boutique_Hotel_Madrid-Madrid.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					} else if (Integer.parseInt(elegir2) == 2) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g187520-d1822279-Reviews-Alma_Pamplona_Muga_de_Beloso-Pamplona_Navarra.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					} else if (Integer.parseInt(elegir2) == 3) {
						enlace = Desktop.getDesktop();
						try {
							enlace.browse(new URI(
									"https://www.tripadvisor.es/Hotel_Review-g658916-d231576-Reviews-Melia_Sancti_Petri-Novo_Sancti_Petri_Chiclana_de_la_Frontera_Costa_de_la_Luz_Andalucia.html"));
						} catch (IOException | URISyntaxException e) {
							e.getMessage();
						}
					}
					break;
				case 3:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane.showInputDialog(null, "1._ Only YOU Boutique Hotel Madrid\n"
							+ "2._ Alma Pamplona Muga de Belosol\n" + "3._ Meliá Sancti Petri\n", "Reservar",
							JOptionPane.DEFAULT_OPTION);
					Integer.parseInt(elegir2);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else {
						if (Integer.parseInt(elegir2) == 1) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187514-d4719800-Reviews-Only_YOU_Boutique_Hotel_Madrid-Madrid.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 2) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187520-d1822279-Reviews-Alma_Pamplona_Muga_de_Beloso-Pamplona_Navarra.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 3) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g658916-d231576-Reviews-Melia_Sancti_Petri-Novo_Sancti_Petri_Chiclana_de_la_Frontera_Costa_de_la_Luz_Andalucia.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						}
					}
					break;
				case 4:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane.showInputDialog(null,
							"1._ Hotel Monge\n" + "2._ Hotel Palm - Astotel\n" + "3._ Hotel R de Paris\n", "Francia",
							JOptionPane.DEFAULT_OPTION);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else {
						if (Integer.parseInt(elegir2) == 1) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d10328342-Reviews-Hotel_Monge-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 2) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d232480-Reviews-Hotel_Palm_Astotel-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 3) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d233583-Reviews-Hotel_R_de_Paris-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						}
					}
					break;
				case 5:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane.showInputDialog(null,
							"1._ Hotel Monge\n" + "2._ Hotel Palm - Astotel\n" + "3._ Hotel R de Paris\n", "Reservar",
							JOptionPane.DEFAULT_OPTION);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else {
						if (Integer.parseInt(elegir2) == 1) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d10328342-Reviews-Hotel_Monge-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 2) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d232480-Reviews-Hotel_Palm_Astotel-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 3) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187147-d233583-Reviews-Hotel_R_de_Paris-Paris_Ile_de_France.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						}
					}
					break;
				case 6:
					UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
					elegir2 = JOptionPane.showInputDialog(null, "1._ Only YOU Boutique Hotel Madrid\n"
							+ "2._ Alma Pamplona Muga de Belosol\n" + "3._ Meliá Sancti Petri\n", "Reservar",
							JOptionPane.DEFAULT_OPTION);
					Integer.parseInt(elegir2);
					if (Integer.parseInt(elegir2) <= 0 || Integer.parseInt(elegir2) > 3 || elegir2 == null) {
						JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
								"Error!", JOptionPane.ERROR_MESSAGE);
						verfal = true;
					} else {
						if (Integer.parseInt(elegir2) == 1) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187514-d4719800-Reviews-Only_YOU_Boutique_Hotel_Madrid-Madrid.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 2) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g187520-d1822279-Reviews-Alma_Pamplona_Muga_de_Beloso-Pamplona_Navarra.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}
						} else if (Integer.parseInt(elegir2) == 3) {
							enlace = Desktop.getDesktop();
							try {
								enlace.browse(new URI(
										"https://www.tripadvisor.es/Hotel_Review-g658916-d231576-Reviews-Melia_Sancti_Petri-Novo_Sancti_Petri_Chiclana_de_la_Frontera_Costa_de_la_Luz_Andalucia.html"));
							} catch (IOException | URISyntaxException e) {
								e.getMessage();
							}

						}
						break;
					}
				}
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "No puedes escribir letras!", "Error!", JOptionPane.ERROR_MESSAGE);
				verfal = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Saliendo...!", "MSG", JOptionPane.INFORMATION_MESSAGE);
				verfal = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error Desconocido!", "Error!", JOptionPane.ERROR_MESSAGE);
				verfal = true;
			}
		} while (verfal);

	}

	public static void metodoInformacion() {
		ImageIcon icono = new ImageIcon("Imagenes/letraT.png");
		Object msj = "Aplicacion que permite Buscar y Reservar vuelos y hoteles.\nCopyRight 2017 || 'Grupo2-1DM3'";
		JOptionPane.showMessageDialog(null, msj, "Informacion", JOptionPane.ERROR_MESSAGE, icono);
	}

	public static void metodoCompañias() {
		boolean verfal;
		String elegir = null;
		String texto = "<html><strong>Páginas Oficiales Aerolineas:</strong></html>\n" + "1._ Iberia\n" + "2._ KLM\n"
				+ "3._ AirEuropa\n";
		Desktop enlace = null;

		do {
			verfal = false;
			try {
				UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Cambria", Font.ITALIC, 15)));
				elegir = JOptionPane.showInputDialog(null, texto, "Compañias", JOptionPane.DEFAULT_OPTION);
				Integer.parseInt(elegir);
				if (Integer.parseInt(elegir) <= 0 || Integer.parseInt(elegir) > 3 || elegir == null) {
					JOptionPane.showMessageDialog(null, "El numero no esta en la lista o el campo está vacío!",
							"Error!", JOptionPane.ERROR_MESSAGE);
					verfal = true;
				}
				switch (Integer.parseInt(elegir)) {
				case 1:
					enlace = Desktop.getDesktop();
					try {
						enlace.browse(new URI("https://www.iberia.com/"));
					} catch (IOException | URISyntaxException e) {
						e.getMessage();
					}
					break;
				case 2:
					enlace = Desktop.getDesktop();
					try {
						enlace.browse(new URI("https://www.klm.com/home/es/es"));
					} catch (IOException | URISyntaxException e) {
						e.getMessage();
					}
					break;
				case 3:
					enlace = Desktop.getDesktop();
					try {
						enlace.browse(new URI("http://aireuropa.com/es/vuelos"));
					} catch (IOException | URISyntaxException e) {
						e.getMessage();
					}
					break;
				}
			} catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "No puedes escribir letras!", "Error!", JOptionPane.ERROR_MESSAGE);
				verfal = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Saliendo....", "MSG", JOptionPane.INFORMATION_MESSAGE);
				verfal = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error Desconocido!", "Error!", JOptionPane.ERROR_MESSAGE);
				verfal = true;
			}
		} while (verfal);

	}
}
