package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.Usuario;
import modelo.AccesoBBDD;
import vista.modificarUsuario;
import vista.vistaUsuario;

public class ControladorUsuarios implements ActionListener {
	private vistaUsuario vistausuario;

	public ControladorUsuarios(vistaUsuario usuario) {
		vistausuario = usuario;
		vistausuario.getBtnInsertarUsuario().addActionListener(this);
		vistausuario.getBtnModificarUsuario().addActionListener(this);
	}

	public void inicializar() {
		vistausuario.setTitle("Desktop");
		vistausuario.setLocationRelativeTo(null);
		vistausuario.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		
		System.out.println("para");
		// INSERTAR USUARIO
		if (e.getSource() == vistausuario.getBtnInsertarUsuario()) {
			AccesoBBDD bd = new AccesoBBDD();

			Usuario usuario = new Usuario();
			usuario.setNombreApellido(vistausuario.getLeerNombre().getText());
			usuario.setDni(vistausuario.getLeerDni().getText());
			usuario.setCodigo(vistausuario.getLeerCodigo().getText());

			try {
				bd.getConexion();
				bd.insertarUsuario(usuario);
				JOptionPane.showMessageDialog(null, "Usuario Insertado correctamente");
				vistausuario.borrarInfo();
				bd.cerrarConexion();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		// MODIFICAR USUARIO
		if (e.getSource() == vistausuario.getBtnModificarUsuario()) {
				modificarUsuario modificarusuario = new modificarUsuario();
			ControladorUsuarioModificar controlador = new ControladorUsuarioModificar(modificarusuario);
			controlador.inicializar();
				modificarusuario.setVisible(true);
		}

		// ELIMINAR USUARIO

	}// fin de actionListener

}// fin de las clase
