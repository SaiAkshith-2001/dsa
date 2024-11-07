public class Main
{
// 	public static int mySqrt(int x) {
// 		int result=(int)Math.sqrt(x);
// 		return result;
// 	}
	public static int mySqrt(int x) {
		int low=0;
		int high=x;
		int result=0;
		while(low<=high) {
			//  int mid=low+high/2;         //it may overflow
			int mid=low+((high-low)/2);   
			if(mid*mid==x) {
				return mid;
			} else if(mid*mid>x) {
				high=mid-1;
			} else {
				low=mid+1;
				result=mid;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(mySqrt(4));
	}
}
