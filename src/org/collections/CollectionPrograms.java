package org.collections;

import java.util.*;

public class CollectionPrograms {
	public static void main(String[] args) {
	/*	
// Length of arraylist	
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(20);		
		System.out.println(al.size());
	
// Length of linkedlist
		List<Integer> bl=new LinkedList<>();
		bl.add(10);
		bl.add(20);
		bl.add(10);
		bl.add(50);
		bl.add(20);		
		System.out.println(bl.size());
		System.out.println(bl.indexOf(10));
		System.out.println(bl.lastIndexOf(10));

// Remove duplicates in the list	
		List<Integer> cl=new LinkedList<>();
		cl.add(10);
		cl.add(20);
		cl.add(10);
		cl.add(50);
		cl.add(30);
		cl.add(50);
		Set<Integer> ss=new TreeSet<>();
		ss.addAll(cl);
		System.out.println(ss);

// Iterate the HashMap
		Map<String,String> mp=new TreeMap<>();
		mp.put("sub","hari");
		mp.put("class","bose");
		mp.put("name","tamil");
		mp.put("dept","panneer");
		for(String sd:mp.keySet()) {
			System.out.println(sd+" : "+mp.get(sd));
		}
		
// Remove duplicates from array
		int a[]= {10,23,45,45,23,11,34,67,77,67,89};
		Set<Integer> st=new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			st.add(a[i]);
		}System.out.println(st);

// Iterate the arraylist using Iterator
		List<Integer> li=new LinkedList<>();
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(0);
		li.add(15);
		li.add(16);				
	Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
 	
		int a[]= {10,23,45,45,23,11,34,67,77,67,89};
		Set<Integer> ft=new HashSet<>();
		for (int i = 0; i <a.length; i++) {
			ft.add(a[i]);
		}System.out.println(ft);
		
			
}}
