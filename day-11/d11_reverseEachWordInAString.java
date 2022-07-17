/*
String: abc def ghi
Output: cba fed ihg
 */

import java.util.Scanner;

public class d11_reverseEachWordInAString {
	
	public static String reverseEachWord(String str) {
		String result = "";
		int currentWordStartIndex = 0;
		
		//this for loop will print all the words excluding last one because there is no space after last word.
		for(int i = 0; i < str.length(); i++) {
			String currentWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = i-1; j >= currentWordStartIndex; j--) 
					currentWord = currentWord + str.charAt(j);
				result = result + currentWord + " ";
				currentWordStartIndex = result.length();
			}
		}
		
		//getting the index of last space: we can reduce one for loop by counting the indexOfLastSpace in above for loop
		int indexOfLastSpace = 0;
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == ' ') 
				indexOfLastSpace = i;
		//printing last word
		String lastWord = "";
		for(int k = str.length()-1; k > indexOfLastSpace; k--)
			lastWord = lastWord + str.charAt(k);
		result = result + lastWord;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(reverseEachWord(str));
	}

}
