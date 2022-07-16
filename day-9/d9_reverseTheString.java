import java.util.Scanner;

public class d9_reverseTheString {
	
	public static void reverseTheString(String str) {
		String str1 = "";
		for(int i = str.length()-1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseTheString(str);
	}

}
