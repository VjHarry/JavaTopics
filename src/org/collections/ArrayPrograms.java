package org.collections;

public class ArrayPrograms {
	public static void main(String[] args) {		
	
// Sum of array values
	int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; int sum=0;
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];	
	}System.out.println(sum);

// Calculate the average value
	int a1[]= {20, 30, 25, 35, -16, 60, -100}; int avg=0;
	
	for (int i = 0; i < a1.length; i++) {
		avg=avg+a1[i];
	}  int avgg=avg/a1.length;
	 System.out.println(avgg);
	 
// Find duplicates only from array
	 int a2[]= {10,10,20,50,60,80,60,50}; int su=0;
	 for (int i = 0; i < a2.length; i++) {
			for (int j =i+1; j < a2.length; j++) {
				if(a2[i]==a2[j]) {
					System.out.println(a2[i]);
				}
			}
		}

	System.out.println(10+30+"hari");
	System.out.println("hari"+10+30);
	}}
