package pers.xipiker.jvm9;

public class DeadLock implements Runnable {

    private Object object1;
    private Object object2;

    public DeadLock(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        synchronized (object1){
            //实验线程间互相调用过快问题，仅测试使用
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object2){
                System.out.println("hello world!");
            }
        }
    }
}
