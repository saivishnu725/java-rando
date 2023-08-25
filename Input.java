import java.io.*;

public class Input {
		public static void main(String[] args) throws IOException {
				InputStreamReader read = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(read);
				System.out.print("Enter your name: ");
				String s = in.readLine();
				System.out.println("hello, " + s + "!!");
				System.out.println("Enter your phone number: ");
				int a = Integer.parseInt(in.readLine());
				System.out.println("Phone number: " + a);

		}
}
