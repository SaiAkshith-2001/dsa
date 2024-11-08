class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            if (hashSet.contains(i)) {
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }
  public static void main(String[] args){
    int[] nums={1,2,3,1};
    System.out.println(containsDuplicate(nums));
  }
}
