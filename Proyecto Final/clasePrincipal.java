public class clasePrincipal {

	public static void main(String args[]) {
		try {
			claseModelo modelo = new claseModelo();
			claseVista vista = new claseVista();
			new claseControlador(vista, modelo);
		} catch (NullPointerException e) {
		}

	}
}
