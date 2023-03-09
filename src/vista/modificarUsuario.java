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

public class modificarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField leerCodigo;
	private JTextField leerDni;
	private JTextField leerNombre;
	private JTextField leerId;
	private JButton btnBuscar;
	private JButton btnModificar;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		try {
//			modificarUsuario dialog = new modificarUsuario();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public modificarUsuario() {
		setBounds(100, 100, 706, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCodigo = new JLabel("Codigo");
			lblCodigo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			lblCodigo.setBounds(10, 225, 151, 14);
			contentPanel.add(lblCodigo);
		}
		{
			leerCodigo = new JTextField();
			leerCodigo.setColumns(10);
			leerCodigo.setBounds(199, 224, 173, 20);
			contentPanel.add(leerCodigo);
		}
		{
			leerDni = new JTextField();
			leerDni.setColumns(10);
			leerDni.setBounds(199, 153, 173, 20);
			contentPanel.add(leerDni);
		}
		{
			JLabel lblDni = new JLabel("DNI");
			lblDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			lblDni.setBounds(10, 159, 151, 14);
			contentPanel.add(lblDni);
		}
		{
			JLabel lblNewLabel = new JLabel("Nombre y Apellido");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			lblNewLabel.setBounds(10, 102, 151, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			leerNombre = new JTextField();
			leerNombre.setColumns(10);
			leerNombre.setBounds(199, 101, 173, 20);
			contentPanel.add(leerNombre);
		}
		{
			JLabel lblId = new JLabel("ID");
			lblId.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			lblId.setBounds(10, 61, 151, 14);
			contentPanel.add(lblId);
		}
		{
			leerId = new JTextField();
			leerId.setColumns(10);
			leerId.setBounds(199, 60, 173, 20);
			contentPanel.add(leerId);
		}
		{
			btnBuscar = new JButton("Buscar ID");
			btnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			btnBuscar.setBounds(443, 59, 178, 23);
			contentPanel.add(btnBuscar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setFont(new Font("Times New Roman", Font.PLAIN, 17));
			btnModificar.setBounds(502, 249, 178, 23);
			contentPanel.add(btnModificar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

}
