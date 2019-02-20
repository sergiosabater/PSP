import java.io.IOException;
import java.net.ServerSocket;

public class ScannerPort {
  public static void main(String [] args) {
  
  System.out.println("Inicio de escaneo");
  
  for (int i = 1; i < 65536; i++) {
    try {
         ServerSocket server = new ServerSocket(i);
         }
         catch(IOException e)
         {
            System.out.println("El puerto "+i+" está abierto!");
         }
    }
  }
}
