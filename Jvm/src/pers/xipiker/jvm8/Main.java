package pers.xipiker.jvm8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //线程第一次断掉
        Scanner sc = new Scanner(System.in);
        sc.next();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    //线程不停的运行
                }
            }
        },"while true").start();
        //输入第二次前，断了
        sc.next();
        //输入后，线程进入wait，一直等待中
        testWait(new Object());
    }
    private static void testWait(Object object){
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"wait").start();
    }
}
