public class Main
{
	public static boolean isPalindrome(int value) {
		int reversedValue=0;
		int temp=value;
		while(temp!=0 && temp>0) {
			reversedValue=(reversedValue*10)+temp%10;
			temp=temp/10;
		}
		return reversedValue==value;
	}
	public static void main(String[] args) {
		int value=-121;
		System.out.println(isPalindrome(value));  //false
	}
}
