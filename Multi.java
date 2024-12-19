class Multi extends Thread{

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }

}

class Multi3 implements Runnable{

    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread(m1);
        t1.start();
    }

}

class TestSleepMethod extends Thread{

    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod t1 = new TestSleepMethod();
        TestSleepMethod t2 = new TestSleepMethod();
        t1.start();
        t2.start();
    }

}


class TestThreadTwice1 extends Thread{

    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        t1.start();
    }

}


class TestCallRun2 extends Thread{

    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestCallRun2 t1 = new TestCallRun2();
        t1.run();
    }

}

class TestJoinMethod1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoinMethod1 t1 = new TestJoinMethod1();
        TestJoinMethod1 t2 = new TestJoinMethod1();
        TestJoinMethod1 t3 = new TestJoinMethod1();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}

class TestJoinMethod3 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        TestJoinMethod3 t1 = new TestJoinMethod3();
        TestJoinMethod3 t2 = new TestJoinMethod3();
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("Name of t2: "+t2.getName());
        System.out.println("id of t1: "+t1.getId());
        t1.start();
        t2.start();
        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1: "+t1.getName());
    }
}

class TestMultiPriority extends Thread{
    public void run(){
        System.out.println("running thread name is: "+Thread.currentThread().getName());
        System.out.println("running thread priority is: "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        TestMultiPriority m1 = new TestMultiPriority();
        TestMultiPriority m2 = new TestMultiPriority();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}