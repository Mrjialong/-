public class ThreadTest extends Thread {
    private int i = 10;

    @Override
    public void run() {
        for (;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"is running "+i);
        }
    }

    public static void main(String[] args) {

        new ThreadTest().start();
        new ThreadTest().start();
    }
}
