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
		
		JButton buttonIExplorer = new JButton("");
		buttonIExplorer.addActionListener(new ActionListener() {
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
		buttonIExplorer.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/internet_explorer.png")));
		buttonIExplorer.setBounds(10, 11, 148, 126);
		contentPane.add(buttonIExplorer);
		
		JButton buttonCalculadora = new JButton("");
		buttonCalculadora.addActionListener(new ActionListener() {
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
		buttonCalculadora.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/calculator_alt.png")));
		buttonCalculadora.setBounds(168, 11, 148, 126);
		contentPane.add(buttonCalculadora);
		
		JButton buttonWord = new JButton("");
		buttonWord.addActionListener(new ActionListener() {
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
		buttonWord.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/word_2013.png")));
		buttonWord.setBounds(326, 11, 148, 126);
		contentPane.add(buttonWord);
		
		JButton buttonMediaPlayer = new JButton("");
		buttonMediaPlayer.addActionListener(new ActionListener() {
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
		buttonMediaPlayer.setIcon(new ImageIcon(BarraTareas.class.getResource("/imagenes/itunes_alt.png")));
		buttonMediaPlayer.setBounds(484, 11, 148, 126);
		contentPane.add(buttonMediaPlayer);
	}
}
