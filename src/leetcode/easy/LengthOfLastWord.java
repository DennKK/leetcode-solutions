package leetcode.easy;

// Length of Last Word
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    return length;
                }
                continue;
            }
            length += 1;
        }
        return length;
    }
}