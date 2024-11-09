import java.util.Arrays;
public class Main
{
	public static int[] runningSum(int[] nums) {
		int temp=0;
		for(int i=0; i<nums.length; i++) {
			temp=temp+nums[i];
			nums[i]=temp;
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,60};
		System.out.println(Arrays.toString(runningSum(nums)));
	}
}
