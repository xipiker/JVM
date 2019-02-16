package pers.xipiker.jvm3;

public class StackError {
    public void test(){
        System.out.printf("start...");
        test();
    }
    public static void main(String[] args) {
        new StackError().test();
    }
}
