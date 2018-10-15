
public class ArraySortEx {

	public static void main(String[] args) {
		int [] a={10,8,9,78,90};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max>a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

