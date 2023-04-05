package assignment4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class assign4 {
	private static Integer sumNoSync = new Integer(0);
	private static Integer sumSync = new Integer(0);
	private static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		// Threads Without Synchronization
		ExecutorService executorNoSync = Executors.newCachedThreadPool();
		for(int i=0; i<1000; i++) { executorNoSync.execute(new SumNoSync()); }
		executorNoSync.shutdown();
		while(!executorNoSync.isTerminated()){}
		System.out.println("Without Synchronization\t:\t" + sumNoSync.intValue());
		
		// Threads Without Synchronization
		ExecutorService executorSync = Executors.newCachedThreadPool();
		for(int i=0; i<1000; i++) { executorSync.execute(new SumSync()); }
		executorSync.shutdown();
		while(!executorSync.isTerminated()){}
		System.out.println("With Synchronization\t:\t" + sumSync.intValue());
	}
	
	// runnable for threads without synchronization
	private static class SumNoSync implements Runnable{
		public void run() { sumNoSync = new Integer(sumNoSync.intValue() + 1); }
	}
	
	// runnable for threads with synchronization using locks
	private static class SumSync implements Runnable{
		public void run() {
			lock.lock();
			sumSync = new Integer(sumSync.intValue() + 1);
			lock.unlock();
		}
	}

}
