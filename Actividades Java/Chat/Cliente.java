import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Cliente extends JFrame implements Runnable { //Implementamos el método Runnable para poder trabajar con hilos

	private JPanel contentPane;
	private JTextField txtNick;
	private JTextField txtMensaje;
	private JTextField txtIPDestino;
	private JTextField txtIPServidor;
	private JTextArea textArea;

	Socket cliente;
	Socket sckt; // Socket de entrada, para recibir
	ServerSocket servidor;
	int puerto = 1024; //El puerto que recibe
	int puerto2 = 1025; //El puerto que envía, debe ser diferente
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Cliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNickCliente = new JLabel("Nick");
		lblNickCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNickCliente.setBounds(163, 70, 105, 26);
		contentPane.add(lblNickCliente);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMensaje.setBounds(163, 124, 105, 26);
		contentPane.add(lblMensaje);
		
		txtNick = new JTextField();
		txtNick.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNick.setBounds(266, 70, 189, 25);
		contentPane.add(txtNick);
		txtNick.setColumns(10);
		
		txtMensaje = new JTextField();
		txtMensaje.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMensaje.setColumns(10);
		txtMensaje.setBounds(266, 124, 189, 25);
		contentPane.add(txtMensaje);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					InetAddress direccion = InetAddress.getLocalHost(); //Para obtener la dirección IP de localhost
					String ip = direccion.getHostAddress();
					cliente = new Socket(txtIPServidor.getText(), puerto);
					Paquete paquete = new Paquete(); //Instanciamos la clase paquete
					paquete.setCliente(txtNick.getText()); //Asignamos el nick del cliente
					paquete.setMensaje(txtMensaje.getText()+"\n"); //Asignamos el mensaje
					paquete.setIpDestino(txtIPDestino.getText()); //Asignamos nuestra IP de destino (donde queremos mandar el mensaje)
					paquete.setIpOrigen(ip); //Nuestra IP
					ObjectOutputStream out = new ObjectOutputStream(cliente.getOutputStream()); //Objeto de salida
					out.writeObject(paquete); //Escribimos el paquete en el objeto con writeObject
					cliente.close(); //Cerramos la conexion
					
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEnviar.setBounds(304, 173, 105, 37);
		contentPane.add(btnEnviar);
		
		textArea = new JTextArea();
		textArea.setBounds(79, 234, 519, 184);
		contentPane.add(textArea);
		
		JLabel lblIpDestino = new JLabel("Mi IP");
		lblIpDestino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIpDestino.setBounds(90, 456, 84, 26);
		contentPane.add(lblIpDestino);
		
		txtIPDestino = new JTextField();
		txtIPDestino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIPDestino.setColumns(10);
		txtIPDestino.setBounds(147, 456, 135, 25);
		contentPane.add(txtIPDestino);
		
		JLabel lblIpServidor = new JLabel("IP Servidor");
		lblIpServidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIpServidor.setBounds(372, 456, 105, 26);
		contentPane.add(lblIpServidor);
		
		txtIPServidor = new JTextField();
		txtIPServidor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIPServidor.setColumns(10);
		txtIPServidor.setBounds(465, 456, 133, 25);
		contentPane.add(txtIPServidor);
		
		Thread mihilo = new Thread(this); //Creamos un hilo para poder mandar múltiples mensajes
		mihilo.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			servidor = new ServerSocket(puerto2);
			String ipd, ipo, usuario, mensaje;
			Paquete pqt;
			
			//Realizamos un bucle infinito en run() para que siempre se ejecute esta acción
			while(true) {
				sckt = servidor.accept();
        
        //Leemos la información del objeto a través del socket de entrada
				ObjectInputStream in = new ObjectInputStream (sckt.getInputStream());
        
				pqt = (Paquete) in.readObject(); //Leemos el objeto y lo asignamos como paquete
				ipd = pqt.getIpDestino(); //Asignamos las variables con el contenido del paquete
				ipo = pqt.getIpOrigen();
				usuario = pqt.getCliente();
				mensaje = pqt.getMensaje();
				this.textArea.append("IP origen: "+ipd+" / "+"IP destino: "+ipo+"\n");
				this.textArea.append("Yo: "+mensaje+"\n");
				sckt.close(); //Cerramos la comunicacion
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
