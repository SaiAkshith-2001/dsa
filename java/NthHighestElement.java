public class Main
{
	public static int findthirdHighestElement(int[] nums) {
		int highestElement=-1;
		int secondHighestElement=-1;
		int thirdHighestElement=-1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>highestElement) {
				highestElement = nums[i];
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>secondHighestElement&&nums[i]!=highestElement) {
				secondHighestElement=nums[i];
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>thirdHighestElement&&nums[i]!=secondHighestElement&&nums[i]!=highestElement) {
				thirdHighestElement=nums[i];
			}
		}
		return thirdHighestElement;
	}
	public static void main(String[] args) {
		int[] nums= {10,50,80,90,20,30};
		System.out.println(findthirdHighestElement(nums));
	}
}

// import java.util.Arrays;
// class Main {
// 	public static int thirdLargest(int[] arr)
// 	{
// 		int arr_size = arr.length;
// 		if (arr_size < 3) {
// 			System.out.println("Invalid Input");
// 			return 0;
// 		}
// 		else {
// 			Arrays.sort(arr);
// 			return arr[arr_size-3];
// 		}
// 	}
// 	public static void main(String[] args)
// 	{
// 		int[] arr = { 12, 13, 1, 10, 34, 16 };
// 		System.out.println(thirdLargest(arr));
// 	}
// }
