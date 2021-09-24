package test;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Sets_ex {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();  // not support duplicate
		set.add("j");
		set.add("j");
		set.add("k");
		set.add("l");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		
		
		LinkedHashSet<String> lhs =new LinkedHashSet<String>();
		lhs.add("l1");
		lhs.add("l1");
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
		
 	}

}
