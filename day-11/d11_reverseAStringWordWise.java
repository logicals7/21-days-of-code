/*
Reverse String Word Wise

Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format 
String in a single line
Output format 
Word wise reversed string in a single line
Constraints 
0 = S = 10^7
where S represents the length of string, S.
Sample Input 1
Welcome to Coding Ninjas
Sample Output 1
Ninjas Coding to Welcome
Sample Input 2
Always indent your code
Sample Output 2
code your indent Always
 */

/*
//Solution using substring function:

public static String reverseAStringWordWise(String str) {
	int end = str.length(); 
	int i = str.length() - 1;
	String result = "";
	while (i >= 0) {
		if (str.charAt(i) == ' ') {
			result = result + str.substring(i + 1, end) + " ";
			end = i;
		}
		i--;
	}
	result += str.substring(i + 1, end); 
	return result;
}


 */
import java.util.*;

public class d11_reverseAStringWordWise {
	
	public static String reverseAStringWordWise(String str) {
		int currentWordEndIndex = str.length()-1;
		String result = "";
		
		//this for loop will print all the words from last to first excluding first one because there is no space before first word.
		for(int i = str.length()-1; i >= 0; i--) {
			String currentWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = i+1; j <= currentWordEndIndex; j++)
					currentWord = currentWord + str.charAt(j);
				result = result + currentWord + " ";
				currentWordEndIndex = i-1;
				
			}
		}
		
		
		//getting the index of first space: we can reduce one for loop by counting the indexOfLastSpace in above for loop
		int indexOfFirstSpace = str.length()-1;
		for(int i = str.length()-1; i >= 0; i--)
			if(str.charAt(i) == ' ')
				indexOfFirstSpace = i;
		
		//printing the first word
		String firstWord = "";
		for(int k = 0; k < indexOfFirstSpace; k++)
			firstWord = firstWord + str.charAt(k);
		result = result + firstWord;
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseAStringWordWise(str));
	}

}
