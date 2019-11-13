import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
  public static void main(String[] argv) throws Exception {
    Socket socket = new Socket("192.168.1.36", 35424);
    byte[] mybytearray = new byte[1024];
    InputStream is = socket.getInputStream();
    FileOutputStream fout = new FileOutputStream("server.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    int bytesRead = is.read(mybytearray, 0, mybytearray.length);
    bout.write(mybytearray, 0, bytesRead);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    out.println("File Recieved Successfully.");
    bout.close();
    socket.close();
  }
}
