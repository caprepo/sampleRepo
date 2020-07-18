package org.cap.demo;

public class SalesApp {

	int[] arr= {12,34,56,78,89};
	
	public void printdata() {
		int sum=0;
		//for(int num:arr) {
		for(int i=0;i<arr.length;i++) {
			//sum+=num;
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Sum:" + sum);
	}
}
