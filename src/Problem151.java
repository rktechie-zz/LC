/*
 * Problem 151: Reverse Words in a String
 * 
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Clarification:

 -What constitutes a word?
    A sequence of non-space characters constitutes a word.
 -Could the input string contain leading or trailing spaces?
    Yes. However, your reversed string should not contain leading or trailing spaces.
 -How about multiple spaces between two words?
    Reduce them to a single space in the reversed string.
 */

public class Problem151 {

    public static void main (String[] args) {
        String x = reverseWords("My   Name is");
        System.out.println(x);
    }
    
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s = s.trim();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].trim().isEmpty()) {
                stringBuilder.append(words[i].trim() + " "); 
            }
        }
        
        return stringBuilder.toString().trim();
    }
}
