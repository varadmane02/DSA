//problem no 2

public class tnoGcd {

 
	static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		return gcd(b , a % b);
	}

	
	static int GCD(int arr[], int n)
	{
		int result = 0;
		for (int i = 1; i < n; i++)
			result = gcd(arr[i], result);

		return result;
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 4, 6 };
		int n = arr.length;
		System.out.println(GCD(arr, n));
	}
}



