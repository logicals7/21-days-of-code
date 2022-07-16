import java.util.Scanner;

public class d9_printAllCharactersOfStringInDifferentLines {
	
	public static void printAllCharactersOfStringInDifferentLines(String str) {
		for(int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printAllCharactersOfStringInDifferentLines(str);

	}

}
