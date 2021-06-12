
public class SortArray {

	public int  sortArray(int[] arr)
	{
	
		      int count =0;  
		      for(int i=0;i<arr.length;i++)
		      {
		          if(arr[i] != i+1)
		          {
		              int indexValue = 0;
		              for(int j=0;j<arr.length;j++)
		              {
		                  if(arr[j] == (i+1))
		                  {
		                      indexValue = j;
		                  }
		              }
		              int temp = arr[i];
		              arr[i] = arr[indexValue];
		              arr[indexValue] = arr[i];
		              count = count+1;
		          }
		      }
		       return count-1;
		    
	}
	public static void main(String[] args)
	{
		SortArray obj = new SortArray();
		int[] arr = {8, 45, 35 ,84 ,79 ,12 ,74 ,92 ,81 ,82 ,61 ,32 ,36 ,1, 65 ,44 ,89 ,40 ,28 ,20 ,97, 90, 22, 87 ,48 ,26, 56 ,18, 49, 71, 23, 34, 59, 54, 14 ,16, 19 ,76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37, 27, 63, 80, 24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75 ,94 ,43 ,77 ,33, 86, 98, 68, 73, 72, 13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99 ,46};
		int result = obj.sortArray(arr);
		System.out.println(result);
	}
}

