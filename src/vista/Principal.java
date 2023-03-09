package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JButton btnUsuario;
	private JButton btnActividades;
	private JButton btnInscripcciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnUsuario = new JButton(" USUARIOS");
		btnUsuario.setBounds(134, 46, 176, 69);
		contentPane.add(btnUsuario);
		
		btnActividades = new JButton(" ACTIVIDADES");
		btnActividades.setBounds(134, 150, 176, 69);
		contentPane.add(btnActividades);
		
		btnInscripcciones = new JButton("INSCRIPCCIONES");
		btnInscripcciones.setBounds(134, 248, 176, 69);
		contentPane.add(btnInscripcciones);
	}

	public JButton getBtnUsuario() {
		return btnUsuario;
	}

	public JButton getBtnActividades() {
		return btnActividades;
	}

	public JButton getBtnInscripcciones() {
		return btnInscripcciones;
	}


}
