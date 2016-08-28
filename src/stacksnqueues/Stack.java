package stacksnqueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
	
	private ArrayList<T> list = new ArrayList<T>();
	private int size;
	public Stack(){
		super();
	}
	
	public void push(T element){
		list.add(element);
		size++;
	}
	public T pop(){
		T e = peek();
		list.remove(list.size()-1);
		size--;
		return e;
	}
	
	public T peek(){
		if (isEmpty()) throw new EmptyStackException();
		
		return list.get(list.size()-1);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return size;
	}
}
