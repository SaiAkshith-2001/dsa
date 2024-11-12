public class Main
{
// 	public static int singleNumber(int[] nums) {    //navie approach
// 		for(int i=0; i<nums.length; i++) {
// 			int count=0;
// 			for(int j=0; j<nums.length; j++) {
// 				if(nums[i]==nums[j]) {
// 					count++;
// 				}
// 			}
// 			if(count==1) {
// 				return nums[i];
// 			}
// 		}
// 		return -1;
// 	}
	public static int singleNumber(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count ^= nums[i]; // XOR operation 1^1=0
		}
		return count;
	}
	public static void main(String[] args) {
		int[] nums= {4,1,2,1,2};
		System.out.println(singleNumber(nums));  //4
	}
}
