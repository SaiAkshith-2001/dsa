class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.trim().length() != 0 && needle.trim().length() != 0) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
    	public static void main(String[] args) {
		System.out.println(strStr("sadie sink","sink"));
	}
}
