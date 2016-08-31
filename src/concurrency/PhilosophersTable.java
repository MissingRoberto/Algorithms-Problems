package concurrency;

public class PhilosophersTable {

	Philosopher[] philosophers;
	
	public PhilosophersTable(Philosopher[] philosophers){
		for(int i=0;i<philosophers.length ;i++){
			Philosopher p = philosophers[i];
			p.rightHand = new ChopStick();
			if (i != 0){
				p.leftHand = philosophers[i-1].rightHand;
			}
			
		}
		
		philosophers[0].leftHand = philosophers[philosophers.length -1].rightHand;
		this.philosophers = philosophers;
	}
	
	public void startGame(){
		for(Philosopher p: philosophers){
			Thread thread = new Thread(p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			thread.start();
		}
	}

	
	
	
	public static void main(String[] args){
		Philosopher p1 = new Philosopher("111");
		Philosopher p2 = new Philosopher("222");
		Philosopher p3 = new Philosopher("333");
		Philosopher p4 = new Philosopher("444");
		Philosopher p5 = new Philosopher("555");
		Philosopher[] philosophers = {p1,p2,p3,p4,p5};
		
		PhilosophersTable table = new PhilosophersTable(philosophers);
		table.startGame();
		
	}

}
