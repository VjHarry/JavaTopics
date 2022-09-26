package org.interviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SamplePrograms {
	public static void main(String[] args) {
		
// Sum of odd num
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum=sum+i;;				
			}}	System.out.println(sum);
				
// Sum of even num
			int summ=0;
			for(int i=1;i<=100;i++) {
				if(i%2==0) {
					summ=summ+i;;				
				}}	System.out.println(summ);		

// Count of odd num
				int c1=0;
		for (int i = 1; i <=100; i++) {
			if(i%2!=0) {
				c1++;
			}
		}System.out.println(c1);
				
// Count of even num
		int c2=0;
		for (int i = 1; i <=100; i++) {
			if(i%2!=0) {
			c2++;
			}} System.out.println(c2);				
					
// Factorial num
			int f=1;
			for(int i=1;i<=8;i++) {
				f=f*i;
			} System.out.println(f);
				
// Fibonacci series	
			int a=0,b=1;
			System.out.println(a); System.out.println(b);
		for (int i =2; i <10; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;	}
				
// Find its even/odd num
		Scanner s=new Scanner(System.in);
		System.out.println("Edhachum number soldra : ");
		int in=s.nextInt();
		if(in%2!=0) {
			System.out.println("Ithu Odd number ra");
		}else {
			System.out.println("Ithu even number ra");
		}  
		/*	
// Swapping num with 3rd variable
		int a1=24,a2=56,a3=0;
		a3=a1;
		a1=a2;
		a2=a3;
		System.out.println("a1 ="+a1);
		System.out.println("a2 ="+a2);
		
// Swapping num without 3rd variable
			int a4=24,a5=56;
			a4=a4+a5;
			a5=a4-a5;
			a4=a4-a5;
				System.out.println("a4 ="+a4);
				System.out.println("a5 ="+a5);		
		
// Reverse the number & check palindrome?		
		int e=222333222,g,h=0,temp=0;
		temp=e;
		while(e>0) {
			g=e%10;
			h=(h*10)+g;
			e=e/10;
		} System.out.println(h);
	if(h==temp) { System.out.println("palindrome");}else { System.out.println("Not palindrome");}
		
// Print palindrome num & also count
	int c5=0;
	 for(int i=0;i<=100;i++) {
		 int n,u=0,j=0;  
		n=i;
		 while(n>0) {
			 u=n%10;
			 j=(j*10)+u;
			 n=n/10;
		 } if(i==j) {
			 c5++; //System.out.println(i);
		 }
	 } System.out.println(c5);
	
// Find armstrong number		
	 int n, a7, i = 0, j = 0;
	 Scanner an = new Scanner(System.in);
	 System.out.println("Enter a number");
	 n = an.nextInt(); a7=n;;
	 while(n>0) {
		 i=n%10;
		 j=(i*i*i)+j;
		 n=n/10;
	 }if(j==a7) {
		 System.out.println("armstrong");
	 }else { System.out.println("no");}	 
	 
// Print armstrong number
	 for(int w=0;w<=1000;w++) {
		 int e1,e2=0,e3=0;
		 e1=w;
		 while(e1>0) {
			 e2=e1%10;
			 e3=(e2*e2*e2)+e3;
			 e1=e1/10;
		 } if(w==e3) {
			 System.out.println(w); }}	
	
// Forward triangle
	for (int i = 0; i <=8; i++) {
		for (int j =0; j <=i; j++) {
			System.out.print("*");
		}System.out.println("");
	}
// Reverse triangle	
	for (int i = 0; i <=8; i++) {
		for (int j =8; j >=i; j--) {
			System.out.print("*");
		}System.out.println("");
	}
	
// Check prime number
		int t=17,co=0;
		for (int i = 2; i <=t/2; i++) {
			if(t%2==0) {
				co=1;
			}
		}if(co==0) {
			System.out.println("prime");
		}else {
			System.out.println("not");
		}
	
// Find vowels and non vowels	
	String sg="subash chandra bose"; int vow=0,nvow=0;
	for (int i = 0; i <sg.length(); i++) {
		char ch=sg.charAt(i);
		if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U') {
			vow++;
		}else { nvow++; }
	}System.out.println("vow "+vow);
	System.out.println("nvow "+nvow);
	
// String reverse
	String df="hariharan",fd=""; char s;
	for (int i = 0; i <df.length(); i++) {
		s=df.charAt(i);
		fd=s+fd; }
	System.out.println(fd);
	
// String count 
	String dd="subash chandra bose"; int u=0;
	for (int i = 0; i <dd.length(); i++) {
		if(dd.charAt(i)!=' ') {
			u++;
		}
	}System.out.println("count "+u);
	
// String count by word
	String ui="hari om hari om harey harey hari om om";
	String[] iu=ui.split(" ");
	HashMap<String,Integer> mp=new HashMap<>();
	for(String re:iu) {
		if(mp.containsKey(re)) {
			int yi=mp.get(re);
			mp.put(re,yi+1);
		}else { mp.put(re,1);
	}}
	System.out.println(mp);
	*/
// Character count in string
	String oi="hariharan";
	char[] io=oi.toCharArray();
	
	HashMap<Character,Integer> kp=new HashMap<>();
	for(char hi:io) {
		if(kp.containsKey(hi)) {
			int ok=kp.get(hi);
			kp.put(hi,ok+1);
		}else { kp.put(hi,1);}
	}System.out.println(kp);
	
// Infosys Interview question
// Input is "hello world"						output is "helwor lold"
	
	String gu="hello world";
	String hello=gu.substring(0,3);
	System.out.println(hello);
	
	String lo=gu.substring(3,5);
	System.out.println(lo);
	
	String wor=gu.substring(6,9);
	System.out.println(wor);
	
	String ld=gu.substring(9,11);
	System.out.println(ld);
	
	String helwor = hello.concat(wor);
	System.out.println(helwor);
	
	String lold = lo.concat(ld);
	System.out.println(lold);
	
	System.out.println(helwor+" "+lold);
	
	
// Simplification of above program
	
	String rt="hello world";
	
	String s1=rt.substring(0,3);
	String s2=rt.substring(3,5);
	String s3=rt.substring(6,9);
	String s4=rt.substring(9,11);
	
	System.out.println(s1+s3+" "+s2+s4);
	System.out.println(s1.concat(s3)+" "+s2.concat(s4));
	
	
	
	
	
	
	
}}
