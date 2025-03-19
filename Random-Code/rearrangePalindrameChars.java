// Java implementation to check if
// characters of a given string can
// be rearranged to form a palindrome
import java.io.*;
import java.math.*;
import java.util.*;

class rearrangePalindrameChars {

	static int NO_OF_CHARS = 256;

	static boolean canFormPalindrome(String str)
	{
		// Create a count array and initialize all
		// values as 0
		int count[] = new int[NO_OF_CHARS];
		Arrays.fill(count, 0);

		// For each character in input strings,
		// increment count in the corresponding
		// count array
		for (int i = 0; i < str.length(); i++)
			count[(int)(str.charAt(i))]++;

		// Count odd occurring characters
		int odd = 0;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			if ((count[i] & 1) == 1)
				odd++;

			if (odd > 1)
				return false;
		}

		// Return true if odd count is 0 or 1,
		return true;
	}

	// Driver code
	public static void main(String args[])
	{
		if (canFormPalindrome("geeksforgeeks"))
			System.out.println("Yes");
		else
			System.out.println("No");

		if (canFormPalindrome("geeksogeeks"))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
	