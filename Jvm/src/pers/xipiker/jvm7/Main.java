package pers.xipiker.jvm7;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //打印线程信息
        Map<Thread, StackTraceElement[]> m = Thread.getAllStackTraces();
        for(Map.Entry<Thread, StackTraceElement[]> en : m.entrySet()){
            Thread t = en.getKey();
            StackTraceElement[] v = en.getValue();
            System.out.println("Thread name is:"+t.getName());
            for(StackTraceElement s : v){
                System.err.println("\t"+s.toString());
            }
        }
    }
}
