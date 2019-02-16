package pers.xipiker.jvm4;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        //这里为什么s1和s2进行比对会返回true，因为s1和s2的内容会存入运行时常量池，s1进入常量池后，s2进入时通过类似于StringTable:HashSet进行比对。
        System.out.println(s1 == s2);
        String s3 = new String("abc");
        //这里为什么s1和s3进行比对会返回false，因为每个对象声明都会存到Java堆|堆内存，s1进入的是运行时常量池，所以s1!=s3。
        System.out.println(s1 == s3);
        //这里为什么s1和s3进行比对会返回true，intern方法native本地方法实现，类似于把s3牵引到常量池，所以s1==s3。
        System.out.println(s1 == s3.intern());
    }
}
