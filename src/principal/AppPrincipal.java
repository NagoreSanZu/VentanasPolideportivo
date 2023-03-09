package principal;

import Controlador.ControladorPrincipal;
import vista.Principal;

public class AppPrincipal {
	public static void main(String[] args) {
		Principal vistaPrincipal = new Principal();
		ControladorPrincipal controlador = new ControladorPrincipal(vistaPrincipal);
		controlador.inicializar();
		vistaPrincipal.setVisible(true);
	}
	
}
