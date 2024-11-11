public class Main
{

    public static int lengthOfLastWord(String s) {
        if (s.trim().length() != 0) {
            String trimmedWord = s.trim();
            String[] newTrimmedWord = trimmedWord.split(" ");
            return newTrimmedWord[newTrimmedWord.length - 1].length();
        }
        return -1;
    }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   Hello World    "));
	}
}
