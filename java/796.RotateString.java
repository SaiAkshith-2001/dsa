// class Main {
//     public static boolean rotateString(String s, String goal) {
//         if(s.length()==goal.length()&&(s+s).contains(goal)){
//             return true;
//         }
//         return false;
//     }
//     public static void main (String[] args) {
//      System.out.println(rotateString("aabbaa","bbaaaa"));
//     }
// }


class Main {
	public static int[] findLPSArr(String goal) {
		int j=0;
		int lpsArr[]=new int[goal.length()];
		for(int i=1; i<goal.length();) {
			if(goal.charAt(i)==goal.charAt(j)) {
				lpsArr[i]=j+1;
				i++;
				j++;
			} else if(j>0) {
				j=lpsArr[j-1];  //if they are not equal go to prev index value
			} else {
				lpsArr[i]=0;
				i++;
			}
		}
		return lpsArr;
	}

	public static boolean KMP(String text,String goal,int[] lpsArr) {
		int m=text.length();
		int n=goal.length();
		int i=0;
		int j=0;
		while(i<m) {
			if(text.charAt(i)==goal.charAt(j)) {
				i++;
				j++;
			}
			if(j==n) {
				return true;
			}
			if(i<m && text.charAt(i)!=goal.charAt(j)) {
				if(j>0) {
					j=lpsArr[j-1];
				}
				else {
					i++;
				}
			}
		}
		return false;
	}
	public static boolean rotateString(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		String text =s+s;
		int[] lpsArr=findLPSArr(goal);
		return KMP(text,goal,lpsArr);
	}
	public static void main (String[] args) {
		System.out.println(rotateString("aabbaa","bbaazz"));
	}
}
