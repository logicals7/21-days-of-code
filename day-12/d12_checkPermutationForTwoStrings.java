/*
Check Permutation

For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other 
when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and 
hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/

/*
logic: 

- create an int array for all the ascii possible.
which will be 256 for 0-255 values.
however standard ascii characters are from 0 to 127 only.

- iterate through str1 & convert each character into int ascii value 
- for each instance of character increase the value by 1 at: arr[ascii_value]
- for example: str1 = "aba" , arr[97] = 2; arr[98] = 1; all other locations would be 0.

- iterate through str1 & convert each character into int ascii value 
- for each instance of character decrease the value by 1 at: arr[ascii_value]
- for example: str2 = "abb" , arr[97] = 2-1 = 1; arr[98] = 1-2 = -1; all other locations would be 0.

- check if the array have non-zero values?
if yes => str1 is not a permutation str2
if no => str1 is a permutation str2
 */

import java.util.Scanner;
public class d12_checkPermutationForTwoStrings {
	 public static boolean checkPermutation(String str1, String str2) {
		 boolean result = true;
		 
		 //if the length of both strings are not equal, they can't be permutation of each other.
		 if(str1.length() != str2.length())
			 return false;
		 
		//defining an array for counting all ascii values
		 int arr[] = new int[256]; 
		 
		//converting the characters of str1 into ascii values & storing them into an array at arr[ascii_value] location
		 for(int i = 0; i < str1.length(); i++) {
			 int intValueOfCurrentChar = (int)str1.charAt(i);
			 arr[intValueOfCurrentChar]++;
		 }
		 
		//converting the characters of str2 into ascii values & storing them into an array at arr[ascii_value] location
		 for(int j = 0; j < str2.length(); j++) {
			 int intValueOfCurrentChar = (int)str2.charAt(j);
			 arr[intValueOfCurrentChar]--;
		 }
		 
		 //checking if array has still non-zero values?
		 for(int k = 0; k < arr.length; k++)
			 if(arr[k] != 0)
				 result = false;
		 
		 return result;
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str1 = sc.nextLine();
		 String str2 = sc.nextLine();
		 System.out.println(checkPermutation(str1, str2));
		 
	 }

}
