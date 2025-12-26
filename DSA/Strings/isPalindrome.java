/*
Problem: Check if String is Palindrome
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
