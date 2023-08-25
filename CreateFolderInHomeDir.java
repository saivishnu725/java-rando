import java.io.*;
public class CreateFolderInHomeDir {
		public static void main(String[] args) {
				try {
						String path = System.getProperty("user.home") + File.separator + ".config" + File.separator + "saivishnu_java";
						File d = new File(path);
						if(d.exists() || d.mkdirs())
								System.out.println("folder created!");
						else
								System.out.println("Already exists");
						File f = new File(path + File.separator + "file.txt");
						if(f.createNewFile())
								System.out.println("file created");
						else
								System.out.println("File exists!!");
				}
				catch(Exception e) {
						System.out.println("Error!!");
				}
		}
}
