import java.util.Arrays;

public class ArrayEx {
public static void main(String[] args) {
	int []a={1,2,2,3,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		int k=a[0];
		if(k==a[i])
		{
			k=a[i];
			count++;
		
	
			System.out.println(a[i]);
		
		}
	}
}
}

