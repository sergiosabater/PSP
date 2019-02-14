import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField txtRuta;

	
	public Configuracion() {
		setTitle("YouTube Downloader - Configuraci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfiguracinDeOpciones = new JLabel("SELECCIONE EL DIRECTORIO DE ALMACENAMIENTO\r\n");
		lblConfiguracinDeOpciones.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfiguracinDeOpciones.setBounds(62, 76, 498, 38);
		contentPane.add(lblConfiguracinDeOpciones);
		
		JLabel lblConfiguracin = new JLabel("CONFIGURACI\u00D3N");
		lblConfiguracin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConfiguracin.setBounds(184, 27, 228, 38);
		contentPane.add(lblConfiguracin);
		
		txtRuta = new JTextField();
		txtRuta.setText(Interfaz.path.toString());
		txtRuta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRuta.setBounds(135, 160, 368, 33);
		contentPane.add(txtRuta);
		txtRuta.setColumns(10);
		
		JLabel lblRuta = new JLabel("Ruta:");
		lblRuta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRuta.setBounds(63, 161, 62, 30);
		contentPane.add(lblRuta);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interfaz.path = txtRuta.getText().toString();
				dispose();
			}
		});
		btnAceptar.setToolTipText("Iniciar descarga");
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBackground(Color.RED);
		btnAceptar.setBounds(243, 233, 125, 41);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setToolTipText("Iniciar descarga");
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(378, 233, 125, 41);
		contentPane.add(btnCancelar);
	}
}
