package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField leerCodigo;
	private JTextField leerDni;
	private JTextField leerNombre;
	public static  JButton btnInsertarUsuario;
	private JButton cancelButton;
	private static JButton btnModificarUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			vistaUsuario dialog = new vistaUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public vistaUsuario() {
		setBounds(100, 100, 746, 449);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellido");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(30, 94, 151, 14);
		contentPanel.add(lblNewLabel);
		
		leerNombre = new JTextField();
		leerNombre.setBounds(219, 93, 173, 20);
		contentPanel.add(leerNombre);
		leerNombre.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblDni.setBounds(30, 151, 151, 14);
		contentPanel.add(lblDni);
		
		leerDni = new JTextField();
		leerDni.setColumns(10);
		leerDni.setBounds(219, 145, 173, 20);
		contentPanel.add(leerDni);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCodigo.setBounds(30, 217, 151, 14);
		contentPanel.add(lblCodigo);
		
		leerCodigo = new JTextField();
		leerCodigo.setColumns(10);
		leerCodigo.setBounds(219, 216, 173, 20);
		contentPanel.add(leerCodigo);
		
		btnInsertarUsuario = new JButton("INSERTAR USUARIO");
		btnInsertarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnInsertarUsuario.setBounds(30, 291, 187, 23);
		contentPanel.add(btnInsertarUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("GESTION DEL USUARIO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(167, 11, 335, 54);
		contentPanel.add(lblNewLabel_1);
		
		btnModificarUsuario = new JButton("MODIFICAR USUARIO");
		btnModificarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnModificarUsuario.setBounds(453, 90, 246, 23);
		contentPanel.add(btnModificarUsuario);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void borrarInfo(){
		leerNombre.setText("");
		leerDni.setText("");
		leerCodigo.setText("");
	}
	//getters and setters
	public JTextField getLeerCodigo() {
		return leerCodigo;
	}

	public void setLeerCodigo(JTextField leerCodigo) {
		this.leerCodigo = leerCodigo;
	}

	public JTextField getLeerDni() {
		return leerDni;
	}

	public void setLeerDni(JTextField leerDni) {
		this.leerDni = leerDni;
	}

	public JTextField getLeerNombre() {
		return leerNombre;
	}

	public void setLeerNombre(JTextField leerNombre) {
		this.leerNombre = leerNombre;
	}

	public static   JButton getBtnInsertarUsuario() {
		return btnInsertarUsuario;
	}

	public void setBtnInsertarUsuario(JButton btnInsertarUsuario) {
		this.btnInsertarUsuario = btnInsertarUsuario;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public static JButton getBtnModificarUsuario() {
		return btnModificarUsuario;
	}

	public void setBtnModificarUsuario(JButton btnModificarUsuario) {
		this.btnModificarUsuario = btnModificarUsuario;
	}
}
