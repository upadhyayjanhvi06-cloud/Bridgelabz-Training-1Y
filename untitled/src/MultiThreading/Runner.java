package Thread;

public class Runner {
    public static void main(String args[]){
//        MyThread2 t2=new MyThread2();
//        Thread thread=new Thread(t2);
////        thread.start();
        EvenThread e1=new EvenThread();
        Thread thread=new Thread(e1);
        thread.start();
        OddThread o1=new OddThread();
        Thread thread1=new Thread(o1);
        thread1.start();
    }
}
