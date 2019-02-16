package pers.xipiker.jvm6;

public class Main {

    private Object instance;

    public static void main(String[] args) {
        Main m1 = new Main();
        Main m2 = new Main();

        //对象引用
        m1.instance = m2;
        m2.instance = m1;

        m1 = null;
        m2 = null;

        //垃圾回收
        System.gc();

    }
}
