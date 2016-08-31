package concurrency;

public class Philosopher implements Runnable {
	
	ChopStick leftHand;
	ChopStick rightHand;
	String name;
	int goHome=3;

	public void run() {

		while (goHome>0) {
			leftHand.lock.lock();
			rightHand.lock.lock();
			System.out.println(name + " is eating...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name + " finished");
			goHome--;
			leftHand.lock.unlock();
			rightHand.lock.unlock();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " went home");
	}

	public void cancel() {
		goHome = -1;
	}

	public boolean isCancelled() {
		return goHome<0;
	}

	public Philosopher(String name) {
		this.name = name;
	}

}