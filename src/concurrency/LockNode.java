package concurrency;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// TODO
public class LockNode {
	
	enum Status {FRESH, VISITED}
	
	Status status = Status.FRESH;
	ArrayList<LockNode> children = new ArrayList<LockNode>();
	Lock lock = new ReentrantLock();
	ArrayList<String> owners= new ArrayList<String>();
	
	public boolean hasCycle(){
		return this.hasCycle(this);
	}
	
	private boolean hasCycle(LockNode origin ){
		status = status.VISITED;
		for(LockNode n: children){
			if (n.status == status.VISITED){
				refresh();
				return false;
			}
			else if(n != origin){
				if(n.hasCycle(this))
					refresh();
					return true;
			}
		}
		
		refresh();
		return false;
	}
	
	private void refresh(){
		for(LockNode n: children){
			n.status = status.FRESH;
		}
		this.status  = status.FRESH;
	}
}
