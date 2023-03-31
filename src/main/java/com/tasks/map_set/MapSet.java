package com.tasks.map_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class MapSet {

	/**
	 * Method returns common Elements
	 * @return
	 */
	  public HashSet<Integer> commonElements() {
	        int counter = 0;
	        HashSet<Integer> first = new HashSet<>();
	        HashSet<Integer> second = new HashSet<>();
	        HashSet<Integer> result = new HashSet<>();
	        
	        first.add(1);
	        first.add(3);
	        first.add(6);
	        first.add(2);
	        second.add(3);
	        second.add(2);
	        second.add(5);
	        second.add(9);

	        for (Integer integer : first) {
	            for (Integer integer1 : second) {
	                if (integer.equals(integer1)) {
	                    result.add(integer1);
	                }
	            }
	        }
	        return result;
	    }
	
	  /**
	   * Method order Cars by years
	   */
	  public void orderByYear() {
		  HashSet<Car> mySet = new HashSet<Car>();
		  mySet.add(new Car("Toyota",2020));
		  mySet.add(new Car("BMW",2019));
		  mySet.add(new Car("Ferrari",2023));
		  

		  ArrayList sortedList = new ArrayList(mySet);
		  Collections.sort(sortedList);
		  
		  
	  }
	
	  /**
	   * Method get's unique Elements from Set
	 * @param <E>
	   * @return
	   */
	  public HashSet<String> getUniqueElements() {

	        HashSet<String> hashSet = new HashSet<>();
	        hashSet.add("Pear");
	        hashSet.add("class");
	        hashSet.add("Apple");
	        hashSet.add("pear");

	        HashSet<String> uniqueHashSet = new HashSet<>();
	        for (String str : hashSet) {
	            String lowerCaseStr = str.toLowerCase();
	            if (!uniqueHashSet.contains(lowerCaseStr)) {
	                uniqueHashSet.add(lowerCaseStr);
	            }
	        }

	        return uniqueHashSet;
	    }
	  
	  
	  /**
	   * Method removes all even Numbers in LinkedHashSet
	   */
	  public void removeEvenNumbers() {
		  LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		  linkedHashSet.add(-3);
		  linkedHashSet.add(2);
		  linkedHashSet.add(4);
		  linkedHashSet.add(54);
		  linkedHashSet.add(33);
		  linkedHashSet.add(12);
		  linkedHashSet.add(32);
		  linkedHashSet.add(11);

	        LinkedHashSet newSet = new LinkedHashSet<>();


	        for (Integer integer : linkedHashSet) {
	            if (integer % 2 != 0) {
	                newSet.add(integer);
	            }
	        }
	        linkedHashSet = newSet;
	        

	  }
	  
	  /**
	   * Method order cars by Years
	   */
	  public void orderByCarYear() {
		  LinkedHashSet<Car> linkedHashSet = new LinkedHashSet<Car>();
		  
		  linkedHashSet.add(new Car("Ferrari",2015));
		  linkedHashSet.add(new Car("BMW",2019));
		  linkedHashSet.add(new Car("Toyota",2020));
		  
		  ArrayList<Car> arrayList = new ArrayList<>(linkedHashSet);
	      Collections.sort(arrayList);
	      
	  }
	  
	  /**
	   * Method removes Duplicate Names
	   */
	  public void removeDuplicateNames() {
		  
		  LinkedHashSet<Car> linkedHashSet = new LinkedHashSet<Car>();
		  
		  linkedHashSet.add(new Car("Ferrari",2015));
		  linkedHashSet.add(new Car("BMW",2019));
		  linkedHashSet.add(new Car("Ferrari",2020));
		  
		  ArrayList<Car> arrayList = new ArrayList<>(linkedHashSet);
	     
		  LinkedHashSet<String> names = new LinkedHashSet<>();
	        LinkedHashSet<Car> uniqueSet = new LinkedHashSet<>();
	        for (Car car : linkedHashSet) {
	            if (!names.contains(car.getCarsName())) {
	                uniqueSet.add(car);
	                names.add(car.getCarsName());
	            }
	        }

	  }
	  
	  /**
	   * Method sort's objects
	   */
	  public void sortObjects() {
		  TreeSet<Car> treeSet = new TreeSet<Car>();
		  
		  treeSet.add(new Car("Ferrari",2010));
		  treeSet.add(new Car("Ferrari",2013));
		  treeSet.add(new Car("Ferrari",2017));
		  
	  }
	  
	  /**
	   * Method returns element's from first Tree Set Which are not on the second Tree Set
	   */
	  public void containsInFirstList() {
		  	TreeSet<Integer> firstTreeSet = new TreeSet<>();
	        TreeSet<Integer> secondTreeSet = new TreeSet<>();

	        firstTreeSet.add(1);
	        firstTreeSet.add(3);
	        firstTreeSet.add(2);
	        firstTreeSet.add(5);
	        secondTreeSet.add(1);
	        secondTreeSet.add(3);
	        secondTreeSet.add(4);
	        secondTreeSet.add(6);
	        
	        TreeSet<Integer> uniqueSet = new TreeSet<>();


	        for(Integer i : firstTreeSet) {
	        	if(!secondTreeSet.contains(i)) {
	        		uniqueSet.add(i);
	        	}
	        }
	  }
	  
	  /**
	   * Method returns unique Strings of TreeSet
	   */
	  public void uniqueElementsString() {
		  
	        TreeSet<String> treeSet = new TreeSet<>();
	        treeSet.add("Hakob");
	        treeSet.add("Vardan");
	        treeSet.add("Serob");
	        
	        TreeSet<String> uniqueTreeSet = new TreeSet<>();
	        for (String name : treeSet) {
	            String tmp = name.toLowerCase();
	            if (treeSet.contains(tmp)) {
	                uniqueTreeSet.add(tmp);
	            }
	        }
	    }
	
}
