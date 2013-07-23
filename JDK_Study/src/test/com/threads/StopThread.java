package test.com.threads;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static boolean stopRequeststed;
    private static synchronized void requestStop(){
        stopRequeststed = true;
    }
    private static synchronized boolean stopRequeststed(){
        return stopRequeststed;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Thread bacgroundThread =  new Thread(
            new Runnable(){
                public void run(){
                    int i = 0;
                    while(!stopRequeststed)
                        i++;
                    System.out.println("最后i为" + i);
                }
            }
        );
        bacgroundThread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        requestStop();
        //1594248210
        //1564635446
        //2147483647
        System.out.println(Integer.MAX_VALUE);
        System.out.println("运行完毕");
        System.out.println(TimeUnit.MINUTES.toMillis(10L));
        
        System.out.println(System.nanoTime());
    }

}
