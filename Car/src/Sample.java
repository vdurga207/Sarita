
public class Sample {
public static void main(String[] args) {
	String s[][]={{"si","ki"},{"ji","ju"}};
	String p[][]={{"si","ki"},{"ji","ju"}};
	String o[][]={{"si","ki"},{"ji","ju"}};
	String l[][][]={s,p,o};
	System.out.println(l[1][1][0]+l[0][0][0]+l[2][0][1]);
}
}
