import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtURL1;
	private String url;
	private JProgressBar progressBar1;
	private JTextField txtURL2;
	private JTextField txtURL3;
	private JTextField txtURL4;
	private static boolean valid = true;
	public static String path = "C:\\YouTubeDownloader\\Videos\\";
	

				
	public Interfaz() {
		setTitle("YouTube Downloader v1.01 - \u00A9 2019 Sergio Sabater");
		
		Image icono = new ImageIcon(this.getClass().getResource("/youtube-icon.png")).getImage();
		setIconImage(icono);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(214, 359, 98, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(214, 421, 98, 14);
		contentPane.add(label_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 4, true));
		panel.setBounds(62, 205, 501, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Lbl_1 = new JLabel("");
		Lbl_1.setForeground(Color.WHITE);
		Lbl_1.setBounds(142, 43, 98, 14);
		panel.add(Lbl_1);
		
		JLabel lblUrl = new JLabel("URL 1");
		lblUrl.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUrl.setBounds(10, 13, 64, 14);
		panel.add(lblUrl);
		
		txtURL1 = new JTextField();
		txtURL1.setBounds(84, 12, 253, 20);
		panel.add(txtURL1);
		txtURL1.setColumns(10);
		
		progressBar1 = new JProgressBar();
		progressBar1.setBounds(84, 43, 253, 17);
		panel.add(progressBar1);
		progressBar1.setForeground(Color.GREEN);
		
		JButton btnDescargar1 = new JButton("Descargar");
		btnDescargar1.setForeground(Color.WHITE);
		btnDescargar1.setToolTipText("Iniciar descarga");
		btnDescargar1.setBackground(Color.RED);
		btnDescargar1.setBounds(365, 11, 112, 23);
		panel.add(btnDescargar1);
		
		JLabel LogoLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/youtube-icon.png")).getImage();
		LogoLabel.setIcon(new ImageIcon(img));
		
		
		LogoLabel.setBounds(246, 11, 135, 141);
		contentPane.add(LogoLabel);
		
		JLabel lblYoutubeDownloaderV = new JLabel("YOUTUBE DOWNLOADER v1.01");
		lblYoutubeDownloaderV.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblYoutubeDownloaderV.setBounds(156, 163, 320, 23);
		contentPane.add(lblYoutubeDownloaderV);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(255, 0, 0), 4, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(62, 298, 501, 75);
		contentPane.add(panel_1);
		
		JLabel Lbl_2 = new JLabel("");
		Lbl_2.setForeground(Color.WHITE);
		Lbl_2.setBounds(142, 43, 98, 14);
		panel_1.add(Lbl_2);
		
		JLabel lblUrl_1 = new JLabel("URL 2");
		lblUrl_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUrl_1.setBounds(10, 13, 64, 14);
		panel_1.add(lblUrl_1);
		
		txtURL2 = new JTextField();
		txtURL2.setColumns(10);
		txtURL2.setBounds(84, 12, 253, 20);
		panel_1.add(txtURL2);
		
		JProgressBar progressBar2 = new JProgressBar();
		progressBar2.setForeground(Color.GREEN);
		progressBar2.setBounds(84, 43, 253, 17);
		panel_1.add(progressBar2);
		
		JButton btnDescargar2 = new JButton("Descargar");
		btnDescargar2.setToolTipText("Iniciar descarga");
		btnDescargar2.setForeground(Color.WHITE);
		btnDescargar2.setBackground(Color.RED);
		btnDescargar2.setBounds(365, 11, 112, 23);
		panel_1.add(btnDescargar2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 4, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(62, 393, 501, 75);
		contentPane.add(panel_2);
		
		JLabel Lbl_3 = new JLabel("");
		Lbl_3.setForeground(Color.WHITE);
		Lbl_3.setBounds(142, 43, 98, 14);
		panel_2.add(Lbl_3);
		
		JLabel lblUrl_2 = new JLabel("URL 3");
		lblUrl_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUrl_2.setBounds(10, 13, 64, 14);
		panel_2.add(lblUrl_2);
		
		txtURL3 = new JTextField();
		txtURL3.setColumns(10);
		txtURL3.setBounds(84, 12, 253, 20);
		panel_2.add(txtURL3);
		
		JProgressBar progressBar3 = new JProgressBar();
		progressBar3.setForeground(Color.GREEN);
		progressBar3.setBounds(84, 43, 253, 17);
		panel_2.add(progressBar3);
		
		JButton btnDescargar3 = new JButton("Descargar");
		
		btnDescargar3.setToolTipText("Iniciar descarga");
		btnDescargar3.setForeground(Color.WHITE);
		btnDescargar3.setBackground(Color.RED);
		btnDescargar3.setBounds(365, 11, 112, 23);
		panel_2.add(btnDescargar3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 0, 0), 4, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(62, 489, 501, 75);
		contentPane.add(panel_3);
		
		JLabel Lbl_4 = new JLabel("");
		Lbl_4.setForeground(Color.WHITE);
		Lbl_4.setBounds(142, 43, 98, 14);
		panel_3.add(Lbl_4);
		
		JLabel lblUrl_3 = new JLabel("URL 4");
		lblUrl_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUrl_3.setBounds(10, 13, 64, 14);
		panel_3.add(lblUrl_3);
		
		txtURL4 = new JTextField();
		txtURL4.setColumns(10);
		txtURL4.setBounds(84, 12, 253, 20);
		panel_3.add(txtURL4);
		
		JProgressBar progressBar4 = new JProgressBar();
		progressBar4.setForeground(Color.GREEN);
		progressBar4.setBounds(84, 43, 253, 17);
		panel_3.add(progressBar4);
		
		JButton btnDescargar4 = new JButton("Descargar");
		
		btnDescargar4.setToolTipText("Iniciar descarga");
		btnDescargar4.setForeground(Color.WHITE);
		btnDescargar4.setBackground(Color.RED);
		btnDescargar4.setBounds(365, 11, 112, 23);
		panel_3.add(btnDescargar4);
		
		JButton btn_Opciones = new JButton("Configuraci\u00F3n");
		btn_Opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracion frame1 = new Configuracion();
				frame1.setVisible(true);
			}
		});
		btn_Opciones.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_Opciones.setToolTipText("Iniciar descarga");
		btn_Opciones.setForeground(Color.WHITE);
		btn_Opciones.setBackground(Color.RED);
		btn_Opciones.setBounds(438, 588, 125, 41);
		contentPane.add(btn_Opciones);
		
		
		btnDescargar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				url = txtURL1.getText();
				crearDirectorio();
				if(valid) {
					DownloadThread v1 = new DownloadThread(url, path, progressBar1, Lbl_1);
					progressBar1.setBackground(Color.RED);
					v1.start();
				}else {
					progressBar1.setBackground(Color.GRAY);
				}
			}
		});
		
		
		btnDescargar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				url = txtURL2.getText();
				crearDirectorio();
				if(valid) {
					DownloadThread v2 = new DownloadThread(url, path, progressBar2, Lbl_2);
					progressBar2.setBackground(Color.RED);
					v2.start();
				}else {
					progressBar2.setBackground(Color.GRAY);
				}
				
			}
		});
		
		btnDescargar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				url = txtURL3.getText();
				crearDirectorio();
				if(valid) {
					DownloadThread v3 = new DownloadThread(url, path, progressBar3, Lbl_3);
					progressBar2.setBackground(Color.RED);
					v3.start();
				}else {
					progressBar3.setBackground(Color.GRAY);
				}
			}
		});
		
		btnDescargar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				url = txtURL4.getText();
				crearDirectorio();
				if(valid) {
					DownloadThread v4 = new DownloadThread(url, path, progressBar4, Lbl_4);
					progressBar4.setBackground(Color.RED);
					v4.start();
				}else {
					progressBar4.setBackground(Color.GRAY);
				}
				
			}
		});
		
	}
	
	public static void crearDirectorio() {
		
		File folder = new File (path);
		
		if(!folder.exists()) {

				int variable = JOptionPane.showConfirmDialog(null, "La ruta "+path+" no existe\n¿Desea crearla?", "Directorio no existe", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(variable == 0) {
					folder.mkdirs();
					valid = true;
				}else {
					valid = false;
				}
				
		}else {
			valid = true;
		}
	}
}
