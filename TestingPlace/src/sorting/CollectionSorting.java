package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSorting {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("david", "tomas", "zuzka", "marek");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) < 0) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
	}

}
