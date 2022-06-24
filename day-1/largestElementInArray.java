import java.util.Scanner;

public class largestElementInArray {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		//defining the array
		int arr[] = new int[size];
		//entering the elements of the array
		for(int i = 0; i < size; i++) {
			System.out.println("enter the " + (i+1) + "th element of the array: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void largestElement(int arr[]) {
		int largest = Integer.MIN_VALUE; //-2147483648 is the smallest possible integer in java
		for(int i = 0; i < arr.length; i++)
			if(arr[i] >= largest)
				largest = arr[i];
		System.out.println("The largest element of the array is: " + largest);
	}
	
	
	public static void main(String[] args) {
		int arr[] = takeInput();
		printArray(arr);
		largestElement(arr);
	}

}
