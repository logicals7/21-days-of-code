/*
Sort 0 1 2

You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. 
Write a solution to sort this array/list in a 'single scan'.
'Single Scan' refers to iterating over the array/list just once or to put it in other words, 
you will be visiting each element in the array/list just once.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2
 */

import java.util.*;
public class d8_sort012 {
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		return arr;
	}
	
	public static void sort012(int arr[]) {
		//maintaining 2 index for inserting 0 & 2
		int zeroInsertIndex = 0, twoInsertIndex = arr.length-1, i = 0;
		while(i <= twoInsertIndex) {
			//if we counter 1, we simply increase our i
			//if we counter 0, then 1 will be at zeroInsertIndex & we swap it with arr[i]
			//if we counter 2, we simply put it at the end of the array
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[zeroInsertIndex];
				arr[zeroInsertIndex] = temp;
				zeroInsertIndex++;
				i++;
			}
			
			else if(arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[twoInsertIndex];
				arr[twoInsertIndex] = temp;
				twoInsertIndex--;
				//here we can't increase i, because the element we swapped can be 0 which results into unsorted array if it is swapped after 1s.
			}
			
			else {
				i++;
			}
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
			sort012(arr);
			printArray(arr);
		}

	}

}
