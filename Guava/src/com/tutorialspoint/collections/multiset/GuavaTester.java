package com.tutorialspoint.collections.multiset;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class GuavaTester {

	public static void main(String[] args) {

		// create a multiset collection
		Multiset<String> multiset = HashMultiset.create();
		
		multiset.add("a");
		multiset.add("b");
		multiset.add("c");
		multiset.add("d");
		multiset.add("a");
		multiset.add("b");
		multiset.add("c");
		multiset.add("b");
		multiset.add("b");
		multiset.add("b");
		
		// print the occurrence of an element
		System.out.println("Occurrence of 'b' : " + multiset.count("b"));
		
		// print the total size of the multiset
		System.out.println("Total Size : " + multiset.size());
		
		// get the distinct elements of the multiset as set
		Set<String> set = multiset.elementSet();
		
		// display the elements of the set
		System.out.print("Set [");
		
		for(String s : set) {
			System.out.print(" " + s);
		}
		System.out.println("]");
		
		// display the distinct elements of the multiset with their occurrence count
		System.out.println("MultiSet [");
		for (Multiset.Entry<String> entry : multiset.entrySet()) {
			System.out.println("Element: " + entry.getElement() + ", Occurrence(s): " + entry.getCount());
		}
		System.out.println("]");
		
		// remove extra occurences
		multiset.remove("b", 2);
		
		// print the occurrence of an element
		System.out.println("Occurence of 'b' : " + multiset.count("b"));
		
	}

}
