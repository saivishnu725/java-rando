import java.io.*;
public class FileUnavail {
		public static void main(String[] args) {
				try {
						File f = new File("avail.txt");
						if(f.createNewFile())
								System.out.println("File created");
						else
								System.out.println("File already exists!!");
				}
				catch (Exception e) {
						System.out.println("Error");
				}
		}
}
