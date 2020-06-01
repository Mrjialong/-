import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest4 implements Runnable {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    @Override
    public void run() {
            lock.lock();
            try {
                System.out.println("时间是"+System.currentTimeMillis());
                    condition.await();
                System.out.println("await之后");
                } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
    }
    public void nitify(){
        System.out.println("signal之前");
        condition.signal();
        System.out.println("signal之后");
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadTest4 a =  new ThreadTest4();
        Thread thread =  new Thread(a);
        thread.start();
        Thread.sleep(3000);
        a.nitify();
    }
}
