public class Main {
	public static int maxSubArray(int[] arr,int k) {
		int maxSum=Integer.MIN_VALUE;
		int currentSum=0;
		if(arr.length<=k) {
			System.out.println("Invalid!");
		}
		for(int i=0; i<k; i++) {
			currentSum+=arr[i];
		}
		for(int i=k; i<arr.length; i++) {
			currentSum+=arr[i]-arr[i-k];
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