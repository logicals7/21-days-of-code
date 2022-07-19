import java.util.Scanner;

public class d13_columnWithLargestSum {

	public static int[][] takeInputIn2DArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of rows in 2D array:");
		int rows = sc.nextInt();
		System.out.println("Enter the total number of cols in 2D array:");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				//System.out.println("Enter the element at row number " + i + " & column number " + j);
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public static void columnWithLargestSum(int[][] arr) {
		int largestSum = 0;
		for(int j = 0; j < arr[0].length; j++){
			int sum = 0;
			for(int i = 0; i < arr.length; i++)
				sum = sum + arr[i][j];
			//System.out.print(sum + " ");
			if(sum > largestSum) 
				largestSum = sum;
		}
		System.out.println(largestSum);
	}
	
	
	public static void main(String[] args) {
			int arr[][] = takeInputIn2DArr();
			columnWithLargestSum(arr);
	}
}
