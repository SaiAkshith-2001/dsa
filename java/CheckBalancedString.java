//Weekly contest 422
public class Main
{
	public static boolean isBalanced(String num) {
		int evenSumIndices=0;
		int oddSumIndices=0;
		for(int i=0; i<num.length(); i++) {
			int newInt=num.charAt(i)-'0';
			if(i%2==0) {
				evenSumIndices+=newInt;
			} else {
				oddSumIndices+=newInt;
			}

		}
		if(evenSumIndices==oddSumIndices) {
			return  true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isBalanced("24123"));
	}
}
