
public class CheckIfVowelIsPresent {

	public boolean checkIfpresent(String str)
	{
		return str.toLowerCase().matches(".*[aeiou].*");
		
		
	}
	public static void main (String[] args)
	{
		CheckIfVowelIsPresent obj = new CheckIfVowelIsPresent();
		System.out.println(obj.checkIfpresent("dipu"));
	}
}
