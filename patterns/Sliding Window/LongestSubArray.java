import java.util.Map;
import java.util.HashMap;

public class Main {
    // Navie Approach   Time Complexity: O(n*n)
	// public static int longestSubArray(int[] arr,int targetSum) {
	// 		int maxLength=0;
	// 	for(int i=0; i<arr.length; i++) {
	// 		int currentSum=0;
	// 		for(int j=0; j<arr.length; j++) {
	// 			currentSum+=arr[j];
	// 			if(currentSum==targetSum && (j-i+1)>maxLength) {
	// 				maxLength=Math.max(j-i+1,maxLength);
	// 			}
	// 		}
	// 	}
	// 	return maxLength;
	// }
   	// Optimal Approach Time complexity: O(n) and spce: O(n)
    public static int longestSubArray(int[] arr,int targetSum) {
		Map<Integer,Integer> hashmap=new HashMap<>();
		int longestSubArrayCount=0;
		int preFix=0;
		for(int i=0; i<arr.length; i++) {
			preFix+=arr[i];
			if(preFix==targetSum) {
				longestSubArrayCount=i+1;
			} else if(hashmap.containsKey(preFix-targetSum)) {
				longestSubArrayCount=Math.max(longestSubArrayCount,i-hashmap.get(preFix-targetSum));
			}
			if(!hashmap.containsKey(preFix)) {
				hashmap.put(preFix,i);
			}
		}
		return longestSubArrayCount;
	}
	public static void main(String[] args) {
		int[] arr= {10, 5, 2, 7, 1, -10};
		int targetSum=15;
		System.out.println(longestSubArray(arr,targetSum));
	}
}