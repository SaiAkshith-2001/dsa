public class Main
{
	public static int searchInsert(int[] nums, int target) {
		int low=0;
		int high=nums.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				high=mid-1;
			}
			else
				low=mid+1;
		}
		return low;
	}
	public static void main(String[] args) {
		int[] nums= {1,3,4,5};
		System.out.println(searchInsert(nums,1));
	}
}