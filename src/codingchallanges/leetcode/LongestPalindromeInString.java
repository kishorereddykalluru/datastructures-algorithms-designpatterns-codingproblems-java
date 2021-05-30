package codingchallanges.leetcode;

public class LongestPalindromeInString {
    
    int resultIndex;
    int resultLength;

    /**
     * find longest palindrome
     * @param str
     * @return
     */
    public String longestPalindrome(String str) {
        if(str.length() < 2){
            return str;
        }
        for (int start = 0; start < str.length(); start++) {
            expandRange(str, start, start);
            expandRange(str, start, start + 1);
        }
        //didn't understand what is happening here
        return str.substring(resultIndex, resultIndex + resultLength);
    }

    /**
     * start from begin and expand range towards start and towards end and compare each element
     * @param str
     * @param begin
     * @param end
     */
    public void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if(resultLength < end - begin - 1){
            resultIndex = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        LongestPalindromeInString palindromeInString = new LongestPalindromeInString();

        String pali = palindromeInString.longestPalindrome("palinmaddampopperstop");
        System.out.println("pali = " + pali);

    }
}
