package org.cap.demo;

public class SalesApp {

	int[] arr= {12,34,56,78,89};
	
	public void printdata() {
		int sum=0;
		for(int num:arr) {
			//sum+=num;
			sum=sum+num;
			System.out.println(num);
		}
		System.out.println("Sum:" + sum);
	}
}
