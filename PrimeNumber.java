
public class PrimeNumber {

	public void checkNumber(int number)
	{
		
		int count = 0;
		for(int i = 2;i<10;i++)
		{
			if(number%i == 0 || number == i)
			{
				count ++;
				break;
			}
		}
		if(count >=2)
		{
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}
	}
	public static void main(String[] args)
	{
		PrimeNumber object = new PrimeNumber();
		object.checkNumber(7);
	}
}
