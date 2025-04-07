public class Main {

	// Navie Approach	Time complexity: O(n*n) Space complexity: O(1)
	// public static int maxSubArray(int[] arr,int k) {
	// 	int maxSum=Integer.MIN_VALUE;
	// 	if(arr.length<=k) {
	// 		System.out.println("Invalid!");
	// 	}
	// 	for(int i=0; i<arr.length-k+1; i++) {
	// 		int currentSum=0;		
	// 		for(int j=0; j<k; j++) {
	// 			currentSum+=arr[i+j];
	// 	}
	// 	maxSum=Math.max(maxSum,currentSum);
	// 	}
	// 	return maxSum;
	// }

	//Optimal Approach	Time complexity: O(n) Space complexity: O(1)
	public static int maxSubArray(int[] arr,int k) {
		int maxSum=Integer.MIN_VALUE;
		int currentSum=0;
		if(arr.length<=k) {
			System.out.println("Invalid!");
		}
		for(int i=0; i<k; i++) {
			currentSum+=arr[i];
		}
		maxSum=currentSum;
		for(int i=k; i<arr.length; i++) {
			currentSum+=arr[i]-arr[i-k];        //adding next elements to the window and removing the prev first elements form the window
			maxSum=Math.max(maxSum,currentSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int k=4;
		System.out.println(maxSubArray(arr,k));
	}
}