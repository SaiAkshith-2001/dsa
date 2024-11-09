import java.util.*;
public class Main
{
	public static int[] plusOne(int[] digits) {
		int[] newArr = new int[digits.length + 1];    //extra element for 0
		for (int i = digits.length-1; i>=0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				return digits;
			}
			digits[i]=0;
		}
		newArr[0]=1;
		return newArr;
	}
	public static void main(String[] args) {
		int [] digits= {1,2,9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
}
