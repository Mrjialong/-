public class ThreadTest2 implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        for (;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"is running "+i);
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2();
        new Thread(threadTest2,"线程1").start();
        new Thread(threadTest2,"线程2").start();
    }
}
