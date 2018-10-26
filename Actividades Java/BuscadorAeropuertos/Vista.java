import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<Aeropuerto> listaAeropuertosEncontrados = new ArrayList<Aeropuerto>(); //Array para almacenar los aeropuertos encontrados en la búsqueda
	private JList list_aeropuertos; //Lista para mostrar los aeropuertos encontrados
	private DefaultListModel modelo; //Definimos un modelo para la lista de aeropuertos encontrados
	private JScrollPane scrollLista; //Scroll para la lista

	public Vista() {
		
		
		setTitle("Buscador de Aeropuertos"); //Establecemos el título de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Lbl_Titulo = new JLabel("BUSCADOR DE AEROPUERTOS");
		Lbl_Titulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		Lbl_Titulo.setBounds(194, 23, 283, 51);
		contentPane.add(Lbl_Titulo);
		
		//JPanel para clasificar los elementos de búsqueda
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Criterios de b\u00FAsqueda", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(70, 97, 494, 163);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Lbl_BuscarPor = new JLabel("Buscar por:");
		Lbl_BuscarPor.setBounds(135, 33, 89, 14);
		panel.add(Lbl_BuscarPor);
		
		//Implementamos un comboBox para realizar diferentes tipos de búsqueda
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Ciudad", "Pa\u00EDs", "C\u00F3digo de aeropuerto"}));
		comboBox.setBounds(234, 30, 148, 20);
		panel.add(comboBox);
		
		JLabel Lbl_IntroduceTexto = new JLabel("Escribir datos:");
		Lbl_IntroduceTexto.setBounds(135, 74, 93, 14);
		panel.add(Lbl_IntroduceTexto);
		
		textField = new JTextField();
		textField.setBounds(233, 71, 148, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		list_aeropuertos = new JList();
		list_aeropuertos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		
		scrollLista = new JScrollPane();
		scrollLista.setBounds(70, 265, 494, 150);
		scrollLista.setViewportView(list_aeropuertos);

		contentPane.add(scrollLista);
		
		//Asignamos un ActionListener al botón Buscar
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo = new DefaultListModel(); //Establecemos un modelo para llegar la lista
				listaAeropuertosEncontrados.clear(); //Vaciamos el ArrayList cada vez que presionamos el botón Buscar
				String entrada = textField.getText().toUpperCase();
				
				//Búsqueda por Nombre
				if(comboBox.getSelectedItem()=="Nombre") {
					for (int i = 0; i < Main.listaAeropuertos.size(); i++) {
						if(Main.listaAeropuertos.get(i).getNombre().contains(entrada)) {
							listaAeropuertosEncontrados.add(Main.listaAeropuertos.get(i));
							modelo.addElement(Main.listaAeropuertos.get(i).getNombre()+" - "+Main.listaAeropuertos.get(i).getCiudad()+" ("+Main.listaAeropuertos.get(i).getPais()+")");
							list_aeropuertos.setModel(modelo);
						}
					}
					if(listaAeropuertosEncontrados.size()==0) {
						JOptionPane.showMessageDialog(null, "No se han encontrado aeropuertos con este nombre", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
					}
					
				//Búsqueda por Ciudad
				}else if(comboBox.getSelectedItem()=="Ciudad") {
					for (int i = 0; i < Main.listaAeropuertos.size(); i++) {
						if(Main.listaAeropuertos.get(i).getCiudad().contains(entrada)) {
							listaAeropuertosEncontrados.add(Main.listaAeropuertos.get(i));
							modelo.addElement(Main.listaAeropuertos.get(i).getNombre()+" - "+Main.listaAeropuertos.get(i).getCiudad()+" ("+Main.listaAeropuertos.get(i).getPais()+")");
							list_aeropuertos.setModel(modelo);
						}
					}
					if(listaAeropuertosEncontrados.size()==0) {
						JOptionPane.showMessageDialog(null, "No se han encontrado aeropuertos con esta ciudad", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
					}
					
				//Búsqueda por País
				}else if(comboBox.getSelectedItem()=="País") {
					for (int i = 0; i < Main.listaAeropuertos.size(); i++) {
						if(Main.listaAeropuertos.get(i).getPais().contains(entrada)) {
							listaAeropuertosEncontrados.add(Main.listaAeropuertos.get(i));
							modelo.addElement(Main.listaAeropuertos.get(i).getNombre()+" - "+Main.listaAeropuertos.get(i).getCiudad()+" ("+Main.listaAeropuertos.get(i).getPais()+")");
							list_aeropuertos.setModel(modelo);
						}
					}
					if(listaAeropuertosEncontrados.size()==0) {
						JOptionPane.showMessageDialog(null, "No se han encontrado aeropuertos con este país", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
					}
					
				//Búsqueda por Código de Aeropuerto
				}else {
					for (int i = 0; i < Main.listaAeropuertos.size(); i++) {
						if(Main.listaAeropuertos.get(i).getCodAeropuerto().equalsIgnoreCase(entrada)) {
							listaAeropuertosEncontrados.add(Main.listaAeropuertos.get(i));
							modelo.addElement(Main.listaAeropuertos.get(i).getNombre()+" - "+Main.listaAeropuertos.get(i).getCiudad()+" ("+Main.listaAeropuertos.get(i).getPais()+")");
							list_aeropuertos.setModel(modelo);
						}
					}
					if(listaAeropuertosEncontrados.size()==0) {
						JOptionPane.showMessageDialog(null, "No se han encontrado aeropuertos con este código de aeropuerto", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnBuscar.setBounds(293, 117, 89, 23);
		panel.add(btnBuscar);
		
		//Botón para abrir el navegador y buscar las coordenadas en GoogleMaps
		JButton btnIrANavegador = new JButton("Ir a Navegador");
		btnIrANavegador.setBounds(262, 439, 129, 32);
		contentPane.add(btnIrANavegador);
		btnIrANavegador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//El lugar que ocupa el elemento seleccionado en la lista es equivalente al lugar que ocupa en el array de aeropuertos encontrados
					int indice = list_aeropuertos.getSelectedIndex();
					String lat = listaAeropuertosEncontrados.get(indice).getLatitud();
					String lng = listaAeropuertosEncontrados.get(indice).getLongitud();
					
					URL url=null; //Declaramos la variable url
					try {
						
						//Inicializamos la variable url con la dirección url incluyendo la latitud y longitud obtenidas del aeropuerto seleccionado
					    url = new URL("http://maps.google.com/maps?z=12&t=m&q=loc:"+lat+"+"+lng);
					    try {
					        Desktop.getDesktop().browse(url.toURI());
					    } catch (IOException e2) {
					    	
					    } catch (URISyntaxException e2) {
					    	
					    }
					} catch (MalformedURLException e3) {
						
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "No hay aeropuertos seleccionados", "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
	}
}
