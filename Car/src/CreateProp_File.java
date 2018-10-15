import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProp_File {

	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileOutputStream f=new FileOutputStream("C:\\Users\\QAP22\\Desktop\\Car\\src\\Sam.properties");
		pro.setProperty("un", "qaplanet");
		pro.setProperty("pwd", "lab1");
		pro.setProperty("un1", "qaplanet2");
		pro.store(f, null);
	}

}
