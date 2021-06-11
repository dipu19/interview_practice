
public class SwapTwoNumberWithouThirdVariable {

	public void swap(int n1, int n2)
	{
		System.out.println("n1 "+n1+" "+"n2 "+n2);
		int result = n1+n2;
		n1  = result - n1;
		n2 = result - n2;
		System.out.println("n1 "+n1+" "+"n2 "+n2);
				
	}
	
	public void swapApproach(int n1, int n2)
	{
		System.out.println("n1 "+n1+" "+"n2 "+n2);
		int result = n1*n2;
		n1 = result/n1;
		n2 = result/n2;
		System.out.println("n1 "+n1+" "+"n2 "+n2);
	}
	public static void main(String[] args)
	{
		SwapTwoNumberWithouThirdVariable obj = new SwapTwoNumberWithouThirdVariable();
		obj.swapApproach(12, 20);
	}
}
