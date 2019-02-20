import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JTextField;

public class Servidor extends JFrame implements Runnable {

	private JPanel contentPane;
	private JTextField txtIPServidor;
	private JTextArea textArea;
	
	Socket envio;
	Socket sckt; // Socket de entrada, para recibir
	ServerSocket servidor;
	int puerto = 1024; //El puerto que recibe
	int puerto2 = 1025; //El puerto que envía, debe ser diferente
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servidor frame = new Servidor();
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
	public Servidor() {
		setTitle("Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(67, 129, 463, 222);
		contentPane.add(textArea);
		
		JLabel lblIpServidor = new JLabel("IP Servidor:");
		lblIpServidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIpServidor.setBounds(67, 62, 98, 28);
		contentPane.add(lblIpServidor);
		
		txtIPServidor = new JTextField();
		txtIPServidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIPServidor.setBounds(158, 65, 180, 22);
		contentPane.add(txtIPServidor);
		txtIPServidor.setColumns(10);
		
		Thread hilo = new Thread(this); //Ejecuta un hilo de nuestra clase
		hilo.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			servidor = new ServerSocket(puerto);
			String ipd, ipo, usuario, mensaje;
			Paquete pqt;
			
			while(true) {
				InetAddress direccion = InetAddress.getLocalHost(); //Obtenemos la direccion IP del localhost
				String ipSer = direccion.getHostAddress(); //La IP del servidor
				sckt = servidor.accept(); //Se establece la comunicacion
				ObjectInputStream in = new ObjectInputStream(sckt.getInputStream());
				pqt = (Paquete) in.readObject(); //Leemos el objeto y lo asignamos como paquete
				ipd = pqt.getIpDestino(); //Asignamos las variables con el contenido del paquete
				ipo = pqt.getIpOrigen();
				usuario = pqt.getCliente();
				mensaje = pqt.getMensaje();
				txtIPServidor.setText(ipSer);
				this.textArea.append("IP origen: "+ipo+" / "+"IP destino: "+ipd+"\n");
				this.textArea.append(usuario+": "+mensaje+"\n");
				pqt.setMensaje(pqt.getMensaje()+"\nServidor: Mensaje recibido OK\n");
				sckt.close(); //Cerramos la comunicacion
				
				//Enviamos respuesta
				envio = new Socket (ipd, puerto2);
				ObjectOutputStream out = new ObjectOutputStream(envio.getOutputStream());
				out.writeObject(pqt);
				envio.close();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
