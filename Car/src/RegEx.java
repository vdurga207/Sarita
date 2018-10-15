import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	//public static void regx(String p)
public static void main(String[] args) {
	Pattern p=Pattern.compile("^[0-9]");
	Matcher m=p.matcher("2");
	if(m.matches())
		System.out.println("success");
	else
		System.out.println("fail");
	String a="Hello";
	String b="world";
	a=a+b;
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	System.out.println(a+"\n"+b);
			
}
}
