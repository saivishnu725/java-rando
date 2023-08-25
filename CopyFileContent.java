import java.io.*;
public class CopyFileContent {
		public static void main(String[] args) {
				try {
						File inf = new File("input01.txt");
						File outf = new File("output01.txt");
						if(outf.createNewFile() || inf.createNewFile())
								System.out.println("Created new file");
						FileReader in = new FileReader(inf);
						FileWriter out = new FileWriter(outf);
						int ch;
						while((ch = in.read()) != -1)
								out.write(ch);
						in.close();
						out.close();
				}
				catch (IOException e) {
						System.out.println("Error!!");
				}
		}
}
