/*
Compress the String

Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
 */

import java.util.*;
public class d12_compressAString {
	
	public static String compressString(String str) {
		String newStr = "" + str.charAt(0); //adding the initial character to ans string
		int i = 1;
		int count = 1; //each character will count for at least once.
		while (i < str.length()) {
			//checking the counts of each character - if i & i-1 chars are same. if not, then counting stops.
			for(int j = i; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(i-1)) { count++; i++; }
				else { break; }
			}
			
			if(count > 1) { newStr = newStr + count; count =1; } //printing the count after char & resetting it to 1 for next char.
			
			//if ith & i-1 th chars are not same
			if(str.charAt(i) != str.charAt(i-1))
				newStr = newStr + str.charAt(i);
			
			i++;
		}

		return newStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(compressString(str));
	}

}
