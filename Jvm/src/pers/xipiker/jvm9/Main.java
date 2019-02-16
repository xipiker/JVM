package pers.xipiker.jvm9;

public class Main {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        new Thread(new DeadLock(object1, object2)).start();
        new Thread(new DeadLock(object2, object1)).start();
    }
}
