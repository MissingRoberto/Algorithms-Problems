package stacksnqueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks<T> {
	
	ArrayList<Stack<T>> stacks = new ArrayList<Stack<T>>();
	private  int MAX_HEIGHT; 
	
	public SetOfStacks(int max_height){
		super();
		MAX_HEIGHT=max_height;
	}
	
	public void push(T element){
		
		if (isEmpty()){
			stacks.add(new Stack<T>());
		}
		Stack<T> stack = stacks.get(stacks.size()-1);
		if(stack.size() == MAX_HEIGHT){
			stack = new Stack<T>();
			stacks.add(stack);		
		}
		stack.push(element);
	}
	
	public T pop(){
		Stack<T> stack = stacks.get(stacks.size()-1);
		T element = stack.pop();
		if (stack.isEmpty())
			stacks.remove(stacks.size()-1);
		return element;
	}
	
	public T popAt(int index){
		if (index > stacks.size() || stacks.isEmpty()) throw new EmptyStackException();
		Stack<T> stack = stacks.get(index);
		T element = stack.pop();
		if (stack.isEmpty())
			stacks.remove(index);
		return element;
	
	}
	
	public boolean isEmpty(){
		return stacks.isEmpty();
	}
}
