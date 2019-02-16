package pers.xipiker.jvm2;

import java.util.ArrayList;
import java.util.List;

public class Jconsole {
    public static void main(String[] args) {
        try {
            //这里为了方便测试延迟1000毫秒
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fill(1000);
    }

    private static void fill(int n) {
        List<Jconsole> jconsoleList = new ArrayList<>();
        for(int i = 0; i < n; n++){
            try {
                //这里为了方便测试延迟1000毫秒
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jconsoleList.add(new Jconsole());
        }
    }
}
