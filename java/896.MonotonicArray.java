public class Main
{
	public static boolean isMonotonic(int[] nums) {
		boolean isIncreasing=true;
		boolean isDecreasing=true;
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]<=nums[i]) {
				isDecreasing=false;
			}
			else if(nums[i-1]>=nums[i]) {
				isIncreasing=false;
			}
		}
		return isDecreasing||isIncreasing;
	}
	public static void main(String[] args) {
		int[] nums= {110,100,10,0};
		System.out.println(isMonotonic(nums));
	}
}
