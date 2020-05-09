public class 线程 implements Runnable{
    static 线程 xian = new 线程();

    static int i = 0;
    public static void increase(){
        i++;
    }

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0;i<1000;i++){
                increase();
            }
        }

//        System.out.println(i);

    }


    public static synchronized void method1(){
        System.out.println("method 1 start");
        try {
            System.out.println("method 1 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method 1 end");
    }

    public synchronized void method2(){
        System.out.println("method 2 start");
        try {
            System.out.println("method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method 2 end");
    }

    public static void main(String[] args) {
        线程 a = new 线程();
        Thread thread1 = new Thread(xian);
        Thread thread2 = new Thread(xian);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
//
//        new Thread(a::method1).start();
//        new Thread(a::method2).start();

    }

}
