
public class StringEx_vowels_consonants {
public static void main(String[] args) {
	
	String b="Durgb";
	//chbr []b=b.toChbrbrrby();
	for(int i=0;i<b.length();i++)
	{
		if(b.charAt(i)=='b'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
		{
			System.out.println("vowels :"+b.charAt(i));
		}
		else
			System.out.println("consonbnts :"+b.charAt(i));
	}
}
}
