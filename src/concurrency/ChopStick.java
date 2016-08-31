package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ChopStick {
	Lock lock = new ReentrantLock();
	
	public void pickUp(){
		lock.lock();
	}
	public boolean tryPickUp(){
		return lock.tryLock();
	}
	
	public void pullDown(){
		lock.unlock();
	}
}
