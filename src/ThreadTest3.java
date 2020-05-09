import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) {
        ThreadTest3 threadTest3 = new ThreadTest3();
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
            int i = 0 ;
           for(;i<100;i++){
                System.out.println(Thread.currentThread().getName() + "的循环变量i的值 ：" + i);
            }
           return i;
        });
        new Thread(task,"有返回值的线程").start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
