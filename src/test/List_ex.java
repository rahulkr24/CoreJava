package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List_ex {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("rk");
		list.add("rj");
		list.add("rp");
		System.out.println(list);
		System.out.println(list.get(0));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator<String> itr = list.iterator();
		{
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
				
		}
		
		for(String data: list) {
			System.out.println(data);
		}
		Collections.sort(list,Collections.reverseOrder());
		//Collections.reverse(list);
		System.out.println(list);
		
		
		
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("s1");
		list1.add("s2");
		list1.add("s3");
		list1.addFirst("rahul");
		list1.addLast("kumar");
		System.out.println(list1);
		
		
		Stack<String> st= new Stack<String>();
		st.push("rahul");
		st.push("kumar");
		st.pop();
		st.push("sahu");
		System.out.println(st);
		System.out.println(st.peek());
		
		
		
		Vector<String> v= new Vector<String>();
		v.add("1");
		v.add("2");
		System.out.println(v);
		
		
	}

}
