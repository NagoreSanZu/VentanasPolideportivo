package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;
import vista.vistaUsuario;

public class ControladorPrincipal implements ActionListener{
	private Principal ventanaPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		ventanaPrincipal = principal;
		ventanaPrincipal.getBtnInscripcciones().addActionListener(this);
		ventanaPrincipal.getBtnActividades().addActionListener(this);
		ventanaPrincipal.getBtnUsuario().addActionListener(this);
	}
	
	public void inicializar() {
		ventanaPrincipal.setTitle("Desktop");
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ventanaPrincipal.getBtnUsuario()) {
			vistaUsuario vistaUsuario = new vistaUsuario();
			ControladorUsuarios controlador = new ControladorUsuarios(vistaUsuario);
			controlador.inicializar();
			vistaUsuario.setVisible(true);
		}
		
		if(e.getSource()==ventanaPrincipal.getBtnActividades()) {
			System.out.println("has cliclado en el boton actividades");
		}
		
		if(e.getSource()==ventanaPrincipal.getBtnInscripcciones()) {
			System.out.println("has cliclado en el boton inscripciones");
		}
		
		
	}

}
