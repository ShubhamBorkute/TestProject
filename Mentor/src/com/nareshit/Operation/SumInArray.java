package com.nareshit.Operation;

import java.util.Arrays;

public class SumInArray {

	public static void Operation(int arr[],int n) {
		
		
		if(n==1) {
			System.out.println(0);
			return;
		}
		
		
		int i,j;
		
	int left[]=new int [n];
	int right[]=new int[n];
	int prod[]=new int [n];
	
	left[0]=1;
	right[n-1]=1;
	for(i=1;i<n;i++)
		left[i]=arr[i-1]*left[i-1];
	
	
	for(j=n-2;j>=0;j--)
		right[j]=arr[j+1]*right[j+1];
	
	
	for(i=0;i<n;i++)
		prod[i]=left[i]*right[i];
	
	
	System.out.println(Arrays.toString(prod));
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {10,3,5,6,2};
		int n=arr.length;
		Operation(arr,n);
	}
	
	
	
}
