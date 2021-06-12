import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {

	public void rotation(List<Integer> list,int number)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
	  	for(int i =0;i<number;i++)
	  	{
	  		int removeNumber = list.get(0);
	  		list.remove(0);
	  		list.add(removeNumber);
	  		
	  	}
	  	System.out.println(arr);
	  	
	  	System.out.println(list);
	}
	public static void main(String[] args)
	{
		ArrayLeftRotation obj = new ArrayLeftRotation();
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		int number = 2;
		obj.rotation(list, number);
	}
}
