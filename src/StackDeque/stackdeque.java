package StackDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class stackdeque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,2,3,1};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>(); 
		
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		System.out.println("stack" + stack);
		
		for (int i = 0; i < arr.length; i++) {
			list.add(stack.pop());
		}
		System.out.println("stack에서 list로 뽑기" + list);
		Collections.reverse(list);
		
		System.out.println("list 뒤집기" + list);
		
//		--------------------------------------------------------------
		
		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		deque.push(5);
		deque.push(2);
		deque.push(3);
		deque.push(7);
		deque.push(1);
		deque.push(4);
		
		list2.add(deque.poll());
		list2.add(deque.poll());
		list2.add(deque.poll());
		list2.add(deque.poll());

		System.out.println("deque" + deque);
		System.out.println(deque.getClass().getName());
		Collections.reverse(list2);
		System.out.println("list2" + list2);
		System.out.println(list.getClass().getName());
		
	}

}
