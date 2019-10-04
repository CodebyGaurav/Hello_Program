package hello;

//class Hi extends Thread
//class Hi implements Runnable{}

//class Hello extends Thread
//class Hello implements Runnable{	}

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runnable hi = ()->
					{
						for(int i=1;i<=5;i++)
						{
							System.out.println("Hi" + Thread.currentThread().getPriority());
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}	
				;
		Runnable he = ()->
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(he);
		
		
		//t1.setName("Hi THread");
		//t2.setName("Hello Thread");
		//System.out.println(t1.getName());
		//System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		t2.start();
		
		
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("bye..");
		
	//	hi.show();
	//	he.show();
	}

}
