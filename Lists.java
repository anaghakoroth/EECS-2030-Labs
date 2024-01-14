package eecs2030.lab4;

import java.util.Comparator;
import java.util.List;

public class Lists {
	private Lists(){} //no objects of this class are desired
	
	public static <T extends Comparable <? super T>> void defaultSort(List <T> list){
		list.sort(Comparator.naturalOrder()); //will use a built-in variation of mergesort
											//alternative: Collections.sort(list);
	}

	public static <T extends Comparable <? super T>> void insertionSortRecursive(List <T> list){
		//TODO implement the recursive solution
		//your solution may not use loops of any kind, neither directly, nor indirectly (e.g., in some helper method)
		if(list.size() > 1 ) {
			Lists.defaultSort(list);
			return;
		}
		else {
			Lists.insertionSortRecursive(list.subList(1,  list.size()));
			T first = list.get(0);
			T second = list.get(1);
			if(second.compareTo(first) < 0) {
				list.set(0, second);
				list.set(1,  first);
			}
			
		}
	}
	
	public static <T extends Comparable <? super T>> void insertionSortIterative(List <T> list){
		//TODO implement the Iterative solution
		for(int i = 0; i < list.size(); i++) {
			for(int j = i + 1; j < list.size(); j++) {
				T first = list.get(i);
				T second = list.get(j);
				if(second.compareTo(first) < 0) {
					list.set(i,  second);
					list.set(j,  first);
				}
					
			}
		}
	}

}
