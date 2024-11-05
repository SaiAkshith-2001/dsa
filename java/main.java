 class Main {
     public static boolean rotateString(String s, String goal) {
         if(s.length()==goal.length()&&(s+s).contains(goal)){
             return true;
         }
         return false;
     }
     public static void main (String[] args) {
      System.out.println(rotateString("aabbaa","bbaaaa"));
     }
 }
