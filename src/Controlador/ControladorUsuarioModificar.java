package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.modificarUsuario;
import vista.vistaUsuario;

public class ControladorUsuarioModificar implements ActionListener {
	private modificarUsuario modificar;
	
	public ControladorUsuarioModificar(modificarUsuario usuario) {
		modificar = usuario;
		modificar.getBtnModificar().addActionListener(this);
		modificar.getBtnBuscar().addActionListener(this);
	}
	
	public void inicializar() {
		modificar.setTitle("Desktop");
		modificar.setLocationRelativeTo(null);
		modificar.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
			
	}
	
	
	
	
}//fin de la clase
