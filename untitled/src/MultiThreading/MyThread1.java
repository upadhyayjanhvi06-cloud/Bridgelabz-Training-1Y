package Thread;
public class MyThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Janhvi");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}