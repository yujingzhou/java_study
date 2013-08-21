package test.com.threads;

//ThreadLocal 线程局部变量

//线程安全集合类
//java.util.concurrent ConcurrentHashMap ConcurrentLinkedQueue
//
//

class TestThread extends Thread{
	public TestThread (String name) {
		super(name);
	}
	
	public TestThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + "线程的i变量" + i);
		}
	}
}

class MyExHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(t + " 线程出现了异常:" + e);
		
	}
	
}

public class GroupThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程组的名字：" + mainGroup.getName());
		System.out.println("主线程组是后台线程组：" + mainGroup.isDaemon());
		new TestThread("新线程组").start();
		
		ThreadGroup tg = new ThreadGroup("新线程组");
		
		tg.setDaemon(true);
		
		System.out.println("tg线程组是后台线程组:" + tg.isDaemon());
		
		TestThread tt = new TestThread(tg, "tg组的线程甲");
		
		tt.start();
		new TestThread(tg, "tg组线程乙").start();
		
		Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
		int a = 5 / 0;
		
	}

}
