package PracticeProject;

	class LongestIncreasingSubsequence {
		static int Temp; 

	
		static int _lis(int arr[], int n)
		{
			
			if (n == 1)
				return 1;

			int res, max_ending_here = 1;

			for (int i = 1; i < n; i++) {
				res = _lis(arr, i);
				if (arr[i - 1] < arr[n - 1]
					&& res + 1 > max_ending_here)
					max_ending_here = res + 1;
			}

		
			if (Temp < max_ending_here)
				Temp = max_ending_here;

			
			return max_ending_here;
		}

		
		static int lis(int arr[], int n)
		{
			
			Temp = 1;

		
			_lis(arr, n);

			
			return Temp;
		}

		public static void main(String args[])
		{
			int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
			int n = arr.length;
			System.out.println("Length of Longest Increasing Subsequence is " + lis(arr, n)
							+ "\n");
		}
	}
	
