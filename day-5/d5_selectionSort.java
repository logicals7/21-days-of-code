/*
Selection Sort

Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4
 */
import java.util.*;
public class d4_selectionSort {
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	
	
	//by defining a function return type as int, we create a new array in the memory.
	//we should not create a new array for any type of sorting, while we can directly make changes into the original one.
	//so keep the function type void & dont return anything.
	public static void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			//i be the index at which element is to be inserted
			int min = arr[i];
			int indexOfMin = i;
			//j be the index for traversing & comparing the element at j with min
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					indexOfMin = j;
				}
			}
			int temp = arr[indexOfMin];
			arr[indexOfMin] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int arr[] = takeInput();
			selectionSort(arr);
			printArray(arr);
		}

	}

}
