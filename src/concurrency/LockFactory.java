package concurrency;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//TODO

public class LockFactory {
	Lock request = new ReentrantLock();
	ArrayList<LockNode> locks = new ArrayList<LockNode>();
	public void initialize(int i){
		for(int j=0; j<i; i++){
			locks.add(new LockNode());
		}
	}
	
	public Lock[] getLocks(String owner){
		ArrayList<Lock> userLocks = new ArrayList<Lock>();
		for(LockNode n: locks){
			if(n.owners.contains(owner)){
				userLocks.add(n.lock);
			}
		}
		return (Lock[]) userLocks.toArray();
	}
	
	public boolean presale(String owner, int[] requestedLocks){
		request.lock();
		// Added requested to the graph
		for(int requestedLock: requestedLocks){
			for(int child: requestedLocks){
				LockNode lock = locks.get(requestedLock);
				lock.owners.add(owner);
				if (child != requestedLock)
					lock.children.add(locks.get(child));	
			}
		}
		// Scan the graph for cycles
		boolean hasCycle = false; 
		for(LockNode n: locks){
			if(n.hasCycle()){
				hasCycle = true;
				break;
			}
		}
		// remove presale
		if (!hasCycle){
			for(int requestedLock: requestedLocks){
				for(int child: requestedLocks){
					LockNode lock = locks.get(requestedLock);
					lock.owners.remove(owner);
					if (child != requestedLock)				
						lock.children.remove(locks.get(child));
				}
			}
		}
		request.unlock();
		return hasCycle;
		
	}
}
