package arraylist;
import java.io.File;
public class FileInfo {

	public static void main(String[] args) {
		File f=new File("chandini");
		if(f.exists())
		{
			System.out.println("Filename:"+f.getName());
			System.out.println("File location:"+f.getAbsolutePath());
		System.out.println("File Writable:"+f.canWrite());
		System.out.println("File Readable:"+f.canRead());

	}
		else
		{
			System.out.println("File doesnot exists");
		}
}
}
