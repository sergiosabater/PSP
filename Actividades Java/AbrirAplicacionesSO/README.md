## Abrir aplicaciones del SO

Realizamos una aplicación que nos permite abrir diferentes aplicaciones, archivos específicos y leer información del cmd.

- Abrir lector PDF (Nos abre la aplicación Adobe Acrobat Reader)
- Abrir hoja de cálculo (Nos abre una hoja específica usando la aplicación Microsof Excel)
- Versión Java (Nos muestra por la consola de comandos la versión Java instalada)

Interfaz de la aplicación:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/AbrirAplSO.PNG" width="600"/>
</p>
  
  
Código fuente:

```java
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.io.*;

public class Aplicacion extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
		Aplicacion frame = new Aplicacion();
		frame.setVisible(true);
				
	}

	
	public Aplicacion() {
		setTitle("Abrir aplicaciones del SO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 361);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProgramacinDeServicios = new JLabel("PROGRAMACI\u00D3N DE SERVICIOS Y PROCESOS");
		lblProgramacinDeServicios.setForeground(Color.WHITE);
		lblProgramacinDeServicios.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		lblProgramacinDeServicios.setBounds(41, 21, 455, 25);
		contentPane.add(lblProgramacinDeServicios);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(41, 71, 455, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVersinDeJava = new JButton("Versi\u00F3n Java");
		btnVersinDeJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				try {
					Process p =Runtime.getRuntime().exec("java -version");
					BufferedReader s=new BufferedReader(new InputStreamReader(p.getInputStream()));
					BufferedReader er=new BufferedReader(new InputStreamReader(p.getErrorStream()));
					
					String linea1=s.readLine();
					while(linea1!=null){
						System.out.println(linea1+"\n");
					    linea1=s.readLine();
					}
					
					String linea2=er.readLine();
					while(linea2!=null){
						System.out.println(linea2+"\n");
					    linea2=s.readLine();
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnVersinDeJava.setBounds(105, 143, 228, 40);
		panel.add(btnVersinDeJava);
		btnVersinDeJava.setBackground(new Color(255, 255, 255));
		btnVersinDeJava.setForeground(Color.BLUE);
		btnVersinDeJava.setFont(new Font("Verdana", Font.BOLD, 16));
		
		JButton btnAbrirHojaDe = new JButton("Abrir hoja de c\u00E1lculo");
		btnAbrirHojaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Abrimos una hoja de excel ubicada en C:\Documentos
				
				String nombreArchivo = "C:\\Documentos\\HojaExcel.xls";
				
		        String[] comandos = {"cmd", "/c", "start", "\"Titulo\"",nombreArchivo};  
		        try {
					Runtime.getRuntime().exec(comandos);
				} catch (IOException e1) {
					// Capturamos la excepción si no existe el archivo
					e1.printStackTrace();
				}  
			}
		});
		btnAbrirHojaDe.setBounds(105, 87, 228, 40);
		panel.add(btnAbrirHojaDe);
		btnAbrirHojaDe.setBackground(new Color(255, 255, 255));
		btnAbrirHojaDe.setForeground(Color.BLUE);
		btnAbrirHojaDe.setFont(new Font("Verdana", Font.BOLD, 16));
		
		JButton btnAbrirLectorPdf = new JButton("Abrir lector PDF");
		btnAbrirLectorPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					//Abrimos el lector de PDF AcrobatReader de Adobe
					ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe");
					pb.start();
				}
				catch (Exception e)
				{
					System.out.println("Exception " + e);
				}
			}
		});
		btnAbrirLectorPdf.setBounds(105, 36, 228, 40);
		panel.add(btnAbrirLectorPdf);
		btnAbrirLectorPdf.setBackground(new Color(255, 255, 255));
		btnAbrirLectorPdf.setForeground(Color.BLUE);
		btnAbrirLectorPdf.setFont(new Font("Verdana", Font.BOLD, 16));
	}
}
```
