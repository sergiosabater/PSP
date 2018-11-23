## Desarrollar una barra de tareas

Mediante **ProcessBuilder** y **Swing** crear un barra de tareas que ejecuten mis 4 aplicaciones preferidas

Hemos realizado una barra de tareas con botones que dan acceso a 4 aplicaciones en Windows: 
- Internet Explorer
- Calculadora
- Microsoft Word
- Reproductor multimedia Windows Media Player

Interfaz de la barra de tareas:

<p align="center">
  <img src="https://github.com/sergiosabater/PSP/blob/master/Recursos/Imagenes/BarraTareas.PNG" width="800"/>
</p>
  
  
Código fuente:

```java
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BarraTareas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraTareas frame = new BarraTareas();
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
	public BarraTareas() {
		setTitle("Barra de tareas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				   /* Creamos un proceso con el path del ejecutable */
				   ProcessBuilder pb = new ProcessBuilder("C://Program Files//internet explorer//iexplore.exe");
				   pb.start();
				}
				catch (Exception e1)
				{
					/* Se lanza una excepción si no se encuentra el ejecutable o el fichero no es ejecutable. */
					System.out.println("Exception " + e1);
				}
			}
		});
		button.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/internet_explorer.png")));
		button.setBounds(10, 11, 148, 126);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				   /* Creamos un proceso con el path del ejecutable */
				   ProcessBuilder pb = new ProcessBuilder("C://Windows//System32//calc.exe");
				   pb.start();
				}
				catch (Exception e2)
				{
					/* Se lanza una excepción si no se encuentra el ejecutable o el fichero no es ejecutable. */
					System.out.println("Exception " + e2);
				}
				
			}
		});
		button_1.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/calculator_alt.png")));
		button_1.setBounds(168, 11, 148, 126);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				   /* Creamos un proceso con el path del ejecutable */
				   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
				   pb.start();
				}
				catch (Exception e3)
				{
					/* Se lanza una excepción si no se encuentra el ejecutable o el fichero no es ejecutable. */
					System.out.println("Exception " + e3);
				}
			}
		});
		button_2.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/word_2013.png")));
		button_2.setBounds(326, 11, 148, 126);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				   /* Creamos un proceso con el path del ejecutable */
				   ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Windows Media Player\\wmplayer.exe");
				   pb.start();
				}
				catch (Exception e4)
				{
					/* Se lanza una excepción si no se encuentra el ejecutable o el fichero no es ejecutable. */
					System.out.println("Exception " + e4);
				}
				
			}
		});
		button_3.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/itunes_alt.png")));
		button_3.setBounds(484, 11, 148, 126);
		contentPane.add(button_3);
	}
}
```
