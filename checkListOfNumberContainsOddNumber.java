import java.util.ArrayList;
import java.util.List;

public class checkListOfNumberContainsOddNumber {

	public boolean checkOddNumberPresent(List<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2 != 0)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args)
	{
		checkListOfNumberContainsOddNumber obj = new checkListOfNumberContainsOddNumber();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println(obj.checkOddNumberPresent(list));
		
	}
	
}
