// Rememeber,
// 1+1=0 with carry 1
// 1+0=1 with carry 0
// 0+1=1 with carry 0
// 0+0=0 with carry 0
// Imp:1+1=1 with carry 1 if previous carry was 1.
// The carry gets added in next step(scanning from right to left).
public class Main
{
	public static String addBinary(String a, String b) {
		StringBuilder result=new StringBuilder();   //mutable
		int i=a.length()-1;
		int j=b.length()-1;
		int carry=0;
		while(i>=0||j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=a.charAt(i)-'0';   //convert char to int
				i--;
			}
			if(j>=0) {
				sum+=b.charAt(j)-'0';   //convert char to int
				j--;
			}
			result.append(sum%2);
			carry=sum/2;
		}
		if(carry!=0) {
			result.append(carry);
		}
		return result.reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}
}
