import java.awt.Color;
import java.io.File;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import com.github.axet.vget.VGet;

public class DownloadThread extends Thread {
	
	private String url;
	private String path;
	private JProgressBar progBar;
	private JLabel lbl;
	
	
	public DownloadThread(String url, String path, Object bar, Object label ) {
		super();
		this.url = url;
		this.path = path;
		this.progBar = (JProgressBar) bar;
		this.lbl = (JLabel) label;
	}

	@Override
	public void run() {
		
		try {
            String url = this.url;
            String path = this.path;
            this.progBar.setValue(0);
            this.lbl.setText("Descargando...");
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
            this.lbl.setText("Completado!!!");
            this.progBar.setBackground(Color.GREEN);
            

        } catch (Exception e) {
        	this.lbl.setText("ERROR");
        	JOptionPane.showMessageDialog(null, "Se ha producido un error. Compruebe la dirección URL", "ATENCIÓN", JOptionPane.ERROR_MESSAGE);
        }
	}

}
