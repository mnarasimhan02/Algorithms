import java.util.HashSet;
import java.util.Set;

//check if string is permutation of palindrome
//Time complexity : O(128*n)- We iterate constant number of times(128) over the string of length n
//Space- O(1);

public class palindromePermutation {
	    public static boolean canPermutePalindrome(String s) {
	        int count = 0;
	        for (char i = 0; i < 128 ; i++) {
	            int ct = 0;
	            for (int j = 0; j < s.length(); j++) {
	                if (s.charAt(j) == i)
	                    ct++;
	            }
	            count += ct % 2;
	        }
	        return count <= 1;
	    }
	  //Time complexity : O(n)- We iterate constant number of times(128) over the string of length n
	  //Space- O(n);	    
	        public static boolean canPermutePalindromeSet(String s) {
	            Set <Character> set = new HashSet < > ();
	            for (int i = 0; i < s.length(); i++) {
	                if (!set.add(s.charAt(i)))
	                    set.remove(s.charAt(i));
	            }
	            return set.size() <= 1;
	        }

	   public static void main(String[] args) {
	        System.out.println("canPermutePalindrome : " + canPermutePalindrome("DOGGOD"));
	        System.out.println("canPermutePalindromeusing Set: " + canPermutePalindromeSet("MalayalaM"));

	    }

}
