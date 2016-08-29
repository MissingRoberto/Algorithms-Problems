package stacksnqueues;

public class QueueOfStacks<T> {
	
	Stack<T> newItems = new Stack<T>();
	Stack<T> oldItems = new Stack<T>();
	
	
	public void push(T element){
		swap(newItems,oldItems);
		oldItems.push(element);
	}
	
	public T pop(){
		swap(oldItems,newItems);
		return newItems.pop();
	}
	
	private void swap(Stack<T> a, Stack<T> b){
		while(!a.isEmpty()){
			b.push(a.pop());
		}
	}
	
	public boolean isEmpty(){
		return newItems.isEmpty() || oldItems.isEmpty();
	}
}
