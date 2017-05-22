public class clasePrincipal {

	public static void main(String args[]) {
		claseModelo modelo = new claseModelo();
		claseVista vista = new claseVista();
		try {			
			new claseControlador(vista, modelo);
		} catch (NullPointerException e){
		}

	}
}