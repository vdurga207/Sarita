

import com.jacob.com.LibraryLoader;
import autoitx4java.AutoItX;

public class AutoitEx2 {
public static void main(String[] args) throws Exception {
	System.setProperty(LibraryLoader.JACOB_DLL_PATH,"D:\\Selenium_Demp\\jacob-1.18\\jacob-1.18\\jacob-1.18-x86.dll");
	AutoItX y=new AutoItX();
	y.run("Notepad.exe");
	y.winWaitActive("Untitled - Notepad");
	if(y.winExists("Untitled - Notepad"))
	{
		System.out.println("notepad is displayed");
	}
	Thread.sleep(1000);
	y.send("hello Durga.How are you?");
	y.winClose("Untitled - Notepad");
}
}
