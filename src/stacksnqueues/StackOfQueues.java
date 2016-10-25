package stacksnqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackOfQueues<T> {
	
	Queue<T> pushQueue = new LinkedList<T>();
	Queue<T> popQueue = new LinkedList<T>();

	public StackOfQueues() {
		super();
	}

	public void push(T element) {
		swap(popQueue, pushQueue);
		pushQueue.add(element);
	}

	public T pop() {
		swap(popQueue, pushQueue);
		return popQueue.poll();
	}

	private void swap(Queue<T> q1, Queue<T> q2) {
		while (!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
	}
	
}
