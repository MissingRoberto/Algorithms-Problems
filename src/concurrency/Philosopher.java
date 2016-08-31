package concurrency;

public class Philosopher implements Runnable {
	
	ChopStick leftHand;
	ChopStick rightHand;
	String name;
	int goHome=2;

	public void run() {

		while (goHome>0) {
			
			leftHand.pickUp();
			
			if (!rightHand.tryPickUp()){
				leftHand.pullDown();
				continue;
			}
			System.out.println(name + " is eating...");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name + " finished");
			goHome--;
			leftHand.pullDown();
			rightHand.pullDown();
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