package test.com.threads;

import java.util.concurrent.locks.ReentrantLock;

class X {
	private final ReentrantLock lock = new ReentrantLock();

	public void m() {
		lock.lock();
		try {
			System.out.println("fuck!~");
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}
}

public class LockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
