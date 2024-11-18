public class Main
{
	public static int findBitonicPoint(int [] nums) {
		int l=0;
		int h=nums.length-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if((mid==0||nums[mid-1]<nums[mid])&&(mid==nums.length-1||nums[mid]>nums[mid+1])) {
				return nums[mid];
			}
			if(nums[mid]<nums[mid+1]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,90,14,3};
		System.out.println(findBitonicPoint(nums));
	}
}
