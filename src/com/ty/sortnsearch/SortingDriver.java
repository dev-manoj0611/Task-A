package com.ty.sortnsearch;

public class SortingDriver {
	static int[] arr = {9,3,-1,-8};
	public static void main(String[] args) {
		Sorting.bubbleSort(arr);
		for(int value : arr) {
			System.out.print(value);
		}
	}
}