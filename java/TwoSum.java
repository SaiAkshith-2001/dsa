import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class Main
{
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			}
			numMap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(twoSum(nums,7)));
	}
}
