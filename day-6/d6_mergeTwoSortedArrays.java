/*
Code Merge Two Sorted Arrays

You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
*/

import java.util.*;

public class d6_mergeTwoSortedArrays {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}

	public static int[] mergedSortedArray(int[] arr1, int[] arr2) {
		int sizeOfMergedArray = arr1.length + arr2.length;
		int arr[] = new int[sizeOfMergedArray];
		int key = 0; // key be the index for merged array
		int i = 0, j = 0; // i & j be the index of arr1 & arr2 respectively

		// inserting elements in the merged array
		// when we have both arrays as 'not exhausted'
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				arr[key] = arr2[j];
				key++;
				j++;
			}

			else if (arr1[i] < arr2[j]) {
				arr[key] = arr1[i];
				key++;
				i++;
			}
			// when arr[i] == arr[j] are equal, we put arr1 elements first
			else {
				arr[key] = arr1[i];
				key++;
				i++;
				arr[key] = arr2[j];
				key++;
				j++;
			}
		}
		// when elements of arr1 are remaining but arr2 is exhausted
		// then we need to insert the elements of arr1 only in the merged array.
		while (i < arr1.length) {
			arr[key] = arr1[i];
			i++;
			key++;
		}
		// when elements of arr2 are remaining but arr1 is exhausted
		// then we need to insert the elements of arr2 only in the merged array.
		while (j < arr2.length) {
			arr[key] = arr2[j];
			j++;
			key++;
		}

		return arr;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int arr1[] = takeInput();
			int arr2[] = takeInput();
			int arr[] = mergedSortedArray(arr1, arr2);
			printArray(arr);
		}
	}

}
