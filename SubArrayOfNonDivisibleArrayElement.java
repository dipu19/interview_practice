import java.util.HashSet;
import java.util.Iterator;

public class SubArrayOfNonDivisibleArrayElement {

	public int check(int[] arr,int k)
	{
		
		HashSet<Integer>hs = new HashSet<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])%k !=0)
				{
					hs.add(arr[i]);
					hs.add(arr[j]);
					
				}
			}
		}
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		int result =hs.size();
		return result;
	}
	public static void main(String[] args)
	{
		SubArrayOfNonDivisibleArrayElement obj = new SubArrayOfNonDivisibleArrayElement();
		int[] arr = {19,10,12,10,24,25,22};
		int k = 4;
		System.out.println(obj.check(arr, k));
	}
}
