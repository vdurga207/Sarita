class loginn{
	static String total;
	static String adress;
}
public class Ex {

	public static void main(String[] args) {
		loginn [] l=new loginn[3];
	
		l[0].total="hi";
		l[1].total="ki";                     
		l[2].total="bye";
		/*
		l[0].adress="hi1";
		l[1].adress="hi2";
		l[2].adress="hi3";
		*/
for(int x=0;x<l.length;x++)
{
	System.out.println(l[x].total);
	//System.out.println(l[x].adress);
	

	}

}
}
