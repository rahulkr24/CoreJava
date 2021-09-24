package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;                  // not support null 

public class Queue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq =new PriorityQueue<String>();
		pq.add("name1");
		pq.add("name2");
		pq.add("name3");
		pq.add("name4");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		ArrayDeque<String> aq = new ArrayDeque<String>();
		aq.add("u1");
		aq.add("u2");
		aq.add("u2");
		aq.addFirst("uuuuu");
		aq.addLast("u11111");
		System.out.println(aq);

	}

}
