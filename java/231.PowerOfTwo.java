public class Main {
	public static boolean isPowerOfTwo(int n) {
  //  Method 1 using & operator gives O(1) here e.g. n=8 => 8 & 7 = 0 i.e., true
		if (n <= 0) {
		    return false;
		}
		return (n & (n - 1)) == 0;       
  //  Method 2
	// 	for(int i=0; i<n; i++) {        //O(n)
	// 		int ans=(int)Math.pow(2,i);
	// 		if(ans==n) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
    
	//  Method 3
	//   	if(n==1) return true;
	// return Math.floor(Math.log(n)/Math.log(2))==Math.ceil(Math.log(n)/Math.log(2));
		
 // Method 4
 // while(i%2==0){
 // 	i/=2;
 // }
 // return i==1;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));  //true
	}
}
