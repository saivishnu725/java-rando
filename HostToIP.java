import java.net.*;
import java.io.*;

public class HostToIP {
		public static void main(String[] args) throws IOException {
				InputStreamReader read = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(read);
				System.out.print("Enter the url: ");
				String host = in.readLine();
				try {
						String ip = InetAddress.getByName(host).getHostAddress();
						System.out.println("IP Address: " + ip);
				}
				catch(Exception e) {
						System.out.println("Check your connection or if the URL is correct.");
				}
		}
}
